package com.example.guest.interactivestoryapp.model;

/**
 * Created by Guest on 11/11/15.
 */
public class Choice {
    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    private String mText;
    private int mNextPage;


}