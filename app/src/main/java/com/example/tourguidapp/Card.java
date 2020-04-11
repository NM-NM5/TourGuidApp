package com.example.tourguidapp;

public class Card {
    private int mImageId;
    private int mTitleNameId;
    private int mBioId;
    private int mMapsId;

    private static final int NO_PHONE = -1;
    private int mPhoneNumberId = NO_PHONE;


    public Card(int imageId, int titleNameId, int bioId, int phoneNumberId, int mapsId) {
        mBioId = bioId;
        mImageId = imageId;
        mPhoneNumberId = phoneNumberId;
        mTitleNameId = titleNameId;
        mMapsId = mapsId;
    }

    public Card(int imageId, int titleNameId, int bioId, int mapsId) {
        mBioId = bioId;
        mImageId = imageId;
        mTitleNameId = titleNameId;
        mMapsId = mapsId;
    }

    public int getImageId() {
        return mImageId;
    }

    public int getTitleNameId() {
        return mTitleNameId;
    }

    public int getBioId() {
        return mBioId;
    }

    public int getMapsId() {
        return mMapsId;
    }

    public int getPhoneNumberId() {
        return mPhoneNumberId;
    }

    public boolean has_phone() {
        return mPhoneNumberId != NO_PHONE;
    }

}
