package ru.chigorinjunior.simbirskopen.ui.schedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.chigorinjunior.simbirskopen.R;
import ru.chigorinjunior.simbirskopen.domain.Schedule;
import ru.chigorinjunior.simbirskopen.providers.ScheduleProvider;

public class ScheduleFragment extends Fragment {
    public static final String SCHEDULE_ARG = "schedule_arg";

    @BindView(R.id.days_view_pager)
    ViewPager mDaysViewPager;

    @BindView(R.id.tabs)
    PagerSlidingTabStrip mTabs;

    Schedule mSchedule;

    DaysAdapter mDaysAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_schedule, container, false);
        ButterKnife.bind(this, view);
        initViewPager();
        return view;
    }

    public void initViewPager() {
        mSchedule = ScheduleProvider.getSchedule();
        mDaysAdapter = new DaysAdapter(getChildFragmentManager());
        mDaysAdapter.setSchedule(mSchedule);
        mDaysViewPager.setAdapter(mDaysAdapter);
        mTabs.setViewPager(mDaysViewPager);
    }
}
