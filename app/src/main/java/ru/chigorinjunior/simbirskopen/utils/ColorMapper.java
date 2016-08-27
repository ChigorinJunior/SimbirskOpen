package ru.chigorinjunior.simbirskopen.utils;

import android.support.annotation.ColorRes;

import ru.chigorinjunior.simbirskopen.R;
import ru.chigorinjunior.simbirskopen.domain.Item;

public class ColorMapper {
    public static @ColorRes int getColor(Item.ItemType itemType) {
        switch (itemType) {
            case CHGK:
                return R.color.color1;
            case BRAIN:
                return R.color.color2;
            case POLYATLON:
                return R.color.color3;
            case QUARTET:
                return R.color.color4;
            case ORGANIZATION:
                return R.color.color5;
            case BREAK:
                return R.color.color6;
            default:
                return R.color.color1;
        }
    }
}
