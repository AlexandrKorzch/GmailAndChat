package com.korzh.hometask.gmailandchat.models;

/**
 * Created by alex on 6/11/17.
 */

public class Group {

    private String mGroupName;
    private int mColorId;

    public Group(String groupName, int colorId) {
        mGroupName = groupName;
        mColorId = colorId;
    }

    public String getGroupName() {
        return mGroupName;
    }

    public int getColorId() {
        return mColorId;
    }
}
