package com.example.slawomirmakurat.locationadres;

/**
 * Created by slawomir.makurat on 2017-03-01.
 */

public enum CustomPagerEnum {

    RED(R.string.red, R.layout.view_red),
    BLUE(R.string.blue, R.layout.view_blue),
    ORANGE(R.string.orange, R.layout.view_orange);

    private int mTitleResId;
    private int mLayoutResId;

    CustomPagerEnum(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}