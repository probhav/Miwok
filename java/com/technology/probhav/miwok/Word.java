package com.technology.probhav.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private int maudioResourseId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String defaultTranslation, String miwokTranslation,int audioResourseId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
         maudioResourseId=audioResourseId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,int audioResourseId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId = imageResourceId;
        maudioResourseId=audioResourseId;
    }

    //getDefaultTranslation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //get the miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return maudioResourseId;
    }

    public boolean hasImage(){
    return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
}
