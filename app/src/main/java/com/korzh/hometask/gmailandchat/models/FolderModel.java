package com.korzh.hometask.gmailandchat.models;

import static com.korzh.hometask.gmailandchat.general.Const.FOLDER_TYPE;

/**
 * Created by alex on 6/10/17.
 */

public class FolderModel extends Model {

    private int mIndicatorColorId;
    private int mNewMailsCount;

    public FolderModel() {
        super(FOLDER_TYPE);
    }

    public int getIndicatorColorId() {
        return mIndicatorColorId;
    }

    public void setIndicatorColorId(int indicatorColorId) {
        mIndicatorColorId = indicatorColorId;
    }

    public int getNewMailsCount() {
        return mNewMailsCount;
    }

    public void setNewMailsCount(int newMailsCount) {
        mNewMailsCount = newMailsCount;
    }
}
