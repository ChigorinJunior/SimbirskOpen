package ru.chigorinjunior.simbirskopen.ui.results;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.client.Firebase;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.chigorinjunior.simbirskopen.R;
import ru.chigorinjunior.simbirskopen.domain.Team;

public class ResultsFragment extends Fragment {
    @BindView(R.id.results_recycler)
    RecyclerView mResultsRecycler;

    ResultsAdapter mResultsAdapter;
    Firebase mFirebase;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_results, container, false);
        ButterKnife.bind(this, view);
        fillData();
        return view;
    }

    public void fillData() {
        mResultsRecycler.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mResultsRecycler.setLayoutManager(layoutManager);
        mFirebase = new Firebase("https://simbirskopen-7074c.firebaseio.com/results");
        mResultsAdapter = new ResultsAdapter(Team.class, R.layout.result_list_item, ResultsAdapter.ResultsViewHolder.class, mFirebase);
        mResultsRecycler.setAdapter(mResultsAdapter);
    }
}
