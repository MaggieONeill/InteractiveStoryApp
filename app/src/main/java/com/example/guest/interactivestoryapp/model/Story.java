package com.example.guest.interactivestoryapp.model;

import com.example.guest.interactivestoryapp.R;

/**
 * Created by Guest on 11/11/15.
 */
public class Story {
    private Page[] mPages;

    public Story() {
        mPages = new Page [7];

        mPages[0] = new Page();
        mPages[0].setImageId(R.drawable.page0);
        mPages[0].setText("test");
        mPages[0].setChoice1(new Choice());
        mPages[0].setChoice2(new Choice());

    }
}