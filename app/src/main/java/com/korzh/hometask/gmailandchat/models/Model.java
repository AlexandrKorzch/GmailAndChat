package com.korzh.hometask.gmailandchat.models;

/**
 * Created by alex on 6/10/17.
 */

public class Model {

    private int mType;
    private int mIconId;
    private String mTitle;
    private String mTheme;

    Model(int type) {
        mType = type;
    }

    public int getIconId() {
        return mIconId;
    }

    public void setIconId(int iconId) {
        mIconId = iconId;
    }

    public int getType() {
        return mType;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getTheme() {
        return mTheme;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setTheme(String theme) {
        mTheme = theme;
    }
}
