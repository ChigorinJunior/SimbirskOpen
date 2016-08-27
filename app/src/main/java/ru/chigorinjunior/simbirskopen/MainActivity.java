package ru.chigorinjunior.simbirskopen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;

import com.firebase.client.Firebase;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.chigorinjunior.simbirskopen.domain.Team;
import ru.chigorinjunior.simbirskopen.ui.results.ResultsAdapter;
import ru.chigorinjunior.simbirskopen.ui.schedule.ScheduleFragment;

public class MainActivity extends AppCompatActivity {
//    @BindView(R.id.teams_results)
//    RecyclerView mTeamsResults;

    @BindView(R.id.activity_main)
    FrameLayout mFrameLayout;

    ResultsAdapter mResultsAdapter;

    Firebase mFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
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
}
