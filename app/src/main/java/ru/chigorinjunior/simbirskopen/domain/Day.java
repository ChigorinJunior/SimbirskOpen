package ru.chigorinjunior.simbirskopen.domain;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Day implements Parcelable{
    private int mId;
    private String mCaption;
    private List<Item> mItems;

    public Day(String caption, List<Item> items) {
        mCaption = caption;
        mItems = items;
    }

    public List<Item> getItems() {
        return mItems;
    }

    public void setItems(final List<Item> aItems) {
        mItems = aItems;
    }

    public int getItemsCount() {
        return mItems == null? 0 : mItems.size();
    }

    public Item getItem(int position) {
        return mItems == null? null : mItems.get(position);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.mId);
        dest.writeString(this.mCaption);
        dest.writeList(this.mItems);
    }

    protected Day(Parcel in) {
        this.mId = in.readInt();
        this.mCaption = in.readString();
        this.mItems = new ArrayList<Item>();
        in.readList(this.mItems, Item.class.getClassLoader());
    }

    public static final Creator<Day> CREATOR = new Creator<Day>() {
        @Override
        public Day createFromParcel(Parcel source) {
            return new Day(source);
        }

        @Override
        public Day[] newArray(int size) {
            return new Day[size];
        }
    };

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }
}
