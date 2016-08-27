package ru.chigorinjunior.simbirskopen.domain;

public class Result {
    private long mTeamId;
    private int mTourId;
    private int mValue;

    public Result(long teamId, int tourId, int value) {
        mTeamId = teamId;
        mTourId = tourId;
        mValue = value;
    }

    public long getTeamId() {
        return mTeamId;
    }

    public void setTeamId(long teamId) {
        mTeamId = teamId;
    }

    public int getTourId() {
        return mTourId;
    }

    public void setTourId(int tourId) {
        mTourId = tourId;
    }

    public int getValue() {
        return mValue;
    }

    public void setValue(int value) {
        mValue = value;
    }
}
