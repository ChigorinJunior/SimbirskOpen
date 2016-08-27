package ru.chigorinjunior.simbirskopen.domain;

public class Item {
    private ItemType mItemType;
    private int mDayId;
    private String mStartTime;
    private String mEndTime;

    private String mInfo;

    public enum ItemType {
        CHGK,
        BRAIN,
        QUARTET,
        BREAK,
        POLYATLON,
        ORGANIZATION
    }

    public Item(ItemType itemType, String startTime, String endTime, String info) {
        mItemType = itemType;
        mStartTime = startTime;
        mEndTime = endTime;
        mInfo = info;
    }

    public ItemType getItemType() {
        return mItemType;
    }

    public void setItemType(ItemType itemType) {
        mItemType = itemType;
    }

    public int getDayId() {
        return mDayId;
    }

    public void setDayId(int dayId) {
        mDayId = dayId;
    }

    public String getStartTime() {
        return mStartTime;
    }

    public void setStartTime(String startTime) {
        mStartTime = startTime;
    }

    public String getEndTime() {
        return mEndTime;
    }

    public void setEndTime(String endTime) {
        mEndTime = endTime;
    }

    public String getInfo() {
        return mInfo;
    }

    public void setInfo(String info) {
        mInfo = info;
    }
}
