package ru.chigorinjunior.simbirskopen.ui.schedule;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import ru.chigorinjunior.simbirskopen.R;
import ru.chigorinjunior.simbirskopen.domain.Day;
import ru.chigorinjunior.simbirskopen.ui.base.BaseFragment;

public class DayFragment extends BaseFragment {
    public static final String DAY_ARG = "day_arg";

    @BindView(R.id.day_recycler)
    RecyclerView mRecyclerView;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_day;
    }

    @Override
    protected void init() {
        DayAdapter dayAdapter = new DayAdapter(getActivity(), (Day) getArguments().getParcelable(DAY_ARG));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(dayAdapter);
    }
}
