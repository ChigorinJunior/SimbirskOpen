package ru.chigorinjunior.simbirskopen;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

import butterknife.ButterKnife;
import ru.chigorinjunior.simbirskopen.ui.results.ResultsFragment;
import ru.chigorinjunior.simbirskopen.ui.schedule.ScheduleFragment;

public class MainActivity extends AppCompatActivity {
    private static final String SCHEDULE_FRAGMENT_TAG = "ScheduleFragment";
    private static final String RESULTS_FRAGMENT_TAG = "ResultsFragment";

    Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        initBottomBar(savedInstanceState);
    }

    private void initBottomBar(Bundle savedInstanceState) {
        BottomBar mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItems(R.menu.main_bottom_bar);
        mBottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                String fragmentTag = getFragmentTag(menuItemId);
                mFragment = getSupportFragmentManager().findFragmentByTag(fragmentTag);
                openScreen(fragmentTag);
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {
                // Do nothing
            }
        });
    }

    private void openScreen(String fragmentTag) {
        if (mFragment == null) {
            mFragment = getFragmentByTag(fragmentTag);
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, mFragment).commit();
    }

    private String getFragmentTag(@IdRes int menuItemId) {
        switch (menuItemId) {
            case R.id.bottom_bar_schedule_item:
                return SCHEDULE_FRAGMENT_TAG;
            case R.id.bottom_bar_results_item:
                return RESULTS_FRAGMENT_TAG;
            default:
                return SCHEDULE_FRAGMENT_TAG;
        }
    }

    private Fragment getFragmentByTag(String fragmentTag) {
        switch (fragmentTag) {
            case SCHEDULE_FRAGMENT_TAG:
                return new ScheduleFragment();
            case RESULTS_FRAGMENT_TAG:
                return new ResultsFragment();
            default:
                return new ScheduleFragment();
        }
    }
}
