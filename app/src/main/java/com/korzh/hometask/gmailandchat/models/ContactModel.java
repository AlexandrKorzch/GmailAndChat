package com.korzh.hometask.gmailandchat.models;

import static com.korzh.hometask.gmailandchat.general.Const.CONTACT_TYPE;

/**
 * Created by alex on 6/10/17.
 */

public class ContactModel extends Model {

    private boolean mRead;
    private boolean mScreb;
    private boolean mMark;
    private String mText;
    private String mTime;
    private Group mGroup;

    public ContactModel() {
        super(CONTACT_TYPE);
    }

    public boolean isRead() {
        return mRead;
    }

    public void setRead(boolean read) {
        mRead = read;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public boolean isScreb() {
        return mScreb;
    }

    public void setScreb(boolean screb) {
        mScreb = screb;
    }

    public boolean isMark() {
        return mMark;
    }

    public void setMark(boolean mark) {
        mMark = mark;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

    public Group getGroup() {
        return mGroup;
    }

    public void setGroup(Group group) {
        mGroup = group;
    }
}
