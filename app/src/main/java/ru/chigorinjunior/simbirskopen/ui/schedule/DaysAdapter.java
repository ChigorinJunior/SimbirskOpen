package ru.chigorinjunior.simbirskopen.ui.schedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.chigorinjunior.simbirskopen.domain.Schedule;

public class DaysAdapter extends FragmentPagerAdapter {
    private Schedule mSchedule;

    public DaysAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setSchedule(Schedule schedule) {
        mSchedule = schedule;
    }

    @Override
    public int getCount() {
        return mSchedule == null? 0 : mSchedule.getDaysCount();
    }

    @Override
    public Fragment getItem(int position) {
        Bundle args = new Bundle();
        args.putParcelable(DayFragment.DAY_ARG, mSchedule.getDay(position));
        Fragment fragment = new DayFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mSchedule.getDay(position).getCaption();
    }
}
