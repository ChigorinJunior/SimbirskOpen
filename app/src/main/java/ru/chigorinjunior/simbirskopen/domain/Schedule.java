package ru.chigorinjunior.simbirskopen.domain;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Schedule implements Parcelable{
    private List<Day> mDays;

    public Schedule(final List<Day> aDays){
        mDays = aDays;
    }

    public List<Day> getDays(){
        return mDays;
    }

    public void setDays(final List<Day> aDays){
        mDays = aDays;
    }

    public int getDaysCount() {
        return mDays == null? 0 : mDays.size();
    }

    public Day getDay(int position) {
        return mDays == null? null : mDays.get(position);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.mDays);
    }

    protected Schedule(Parcel in) {
        this.mDays = in.createTypedArrayList(Day.CREATOR);
    }

    public static final Creator<Schedule> CREATOR = new Creator<Schedule>() {
        @Override
        public Schedule createFromParcel(Parcel source) {
            return new Schedule(source);
        }

        @Override
        public Schedule[] newArray(int size) {
            return new Schedule[size];
        }
    };
}
