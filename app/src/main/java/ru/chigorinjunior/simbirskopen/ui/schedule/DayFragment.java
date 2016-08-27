package ru.chigorinjunior.simbirskopen.ui.schedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.chigorinjunior.simbirskopen.R;
import ru.chigorinjunior.simbirskopen.domain.Day;

public class DayFragment extends Fragment {
    public static final String DAY_ARG = "day_arg";

    @BindView(R.id.day_recycler)
    RecyclerView mRecyclerView;

    Day mDay;

    private DayAdapter mDayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day, container, false);
        ButterKnife.bind(this, view);
        initDay();
        return view;
    }

    public void initDay() {
        mDay = getArguments().getParcelable(DAY_ARG);
        mDayAdapter = new DayAdapter(getActivity(), mDay);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mDayAdapter);
    }
}
