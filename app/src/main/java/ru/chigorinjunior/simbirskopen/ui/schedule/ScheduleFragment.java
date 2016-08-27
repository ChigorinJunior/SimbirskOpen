package ru.chigorinjunior.simbirskopen.ui.schedule;

import android.support.v4.view.ViewPager;

import com.astuetz.PagerSlidingTabStrip;

import butterknife.BindView;
import ru.chigorinjunior.simbirskopen.R;
import ru.chigorinjunior.simbirskopen.providers.ScheduleProvider;
import ru.chigorinjunior.simbirskopen.ui.base.BaseFragment;

public class ScheduleFragment extends BaseFragment {
    @BindView(R.id.days_view_pager)
    ViewPager mDaysViewPager;

    @BindView(R.id.tabs)
    PagerSlidingTabStrip mTabs;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_schedule;
    }

    @Override
    protected void init() {
        DaysAdapter mDaysAdapter = new DaysAdapter(getChildFragmentManager());
        mDaysAdapter.setSchedule(ScheduleProvider.getSchedule());
        mDaysViewPager.setAdapter(mDaysAdapter);
        mTabs.setViewPager(mDaysViewPager);
    }
}
