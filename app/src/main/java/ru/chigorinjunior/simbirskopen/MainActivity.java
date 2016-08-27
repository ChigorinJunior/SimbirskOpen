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
    BottomBar mBottomBar;
    Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        initBottomBar(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();

        Fragment fragment = new ScheduleFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.activity_main, fragment).commit();
    }

    private void initBottomBar(Bundle savedInstanceState) {
        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItems(R.menu.main_bottom_bar);
        mBottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                switch (menuItemId) {
                    case R.id.bottom_bar_schedule_item:
                        mFragment = new ScheduleFragment();
                        break;
                    case R.id.bottom_bar_results_item:
                        mFragment = new ResultsFragment();
                        break;
                }

                openScreen();
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {
                // Do nothing
            }
        });
    }

    private void openScreen() {
        getSupportFragmentManager().beginTransaction().add(R.id.activity_main, mFragment).commit();
    }
}
