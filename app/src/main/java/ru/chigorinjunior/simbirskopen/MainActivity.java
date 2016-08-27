package ru.chigorinjunior.simbirskopen;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.firebase.client.Firebase;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.chigorinjunior.simbirskopen.ui.results.ResultsAdapter;
import ru.chigorinjunior.simbirskopen.ui.schedule.ScheduleFragment;

public class MainActivity extends AppCompatActivity {
//    @BindView(R.id.teams_results)
//    RecyclerView mTeamsResults;

    @BindView(R.id.activity_main)
    FrameLayout mFrameLayout;

    ResultsAdapter mResultsAdapter;

    Firebase mFirebase;

    BottomBar mBottomBar;

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

//        mTeamsResults.setHasFixedSize(true);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        mTeamsResults.setLayoutManager(layoutManager);
//        mFirebase = new Firebase("https://simbirskopen-7074c.firebaseio.com/results");
//        mResultsAdapter = new ResultsAdapter(Team.class, R.layout.result_list_item, ResultsAdapter.ResultsViewHolder.class, mFirebase);
//        mTeamsResults.setAdapter(mResultsAdapter);
    }

    private void initBottomBar(Bundle savedInstanceState) {
        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItems(R.menu.main_bottom_bar);
        mBottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
//                switch (menuItemId) {
//                    case R.id.bottom_bar_schedule_item:
//                        mFragmentType = FragmentType.MAP;
//                        break;
//                    case R.id.bottom_bar_map_item:
//                        mFragmentType = FragmentType.MAP;
//                        break;
//                    default:
//                        mFragmentType = FragmentType.MAP;
//                        break;
//                }
//
//                openScreen();
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {
                // Do nothing
            }
        });
    }
}
