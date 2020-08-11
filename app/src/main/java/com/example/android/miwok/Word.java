package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mAudioResourceId;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    public Word( String DefaultTranslation,String MiwokTranslation,int AudioResourceId){
        mDefaultTranslation= DefaultTranslation;
        mMiwokTranslation= MiwokTranslation;
        mAudioResourceId= AudioResourceId;
    }
    public Word( String DefaultTranslation,String MiwokTranslation,int ImageResourceId,int AudioResourceId){
        mDefaultTranslation= DefaultTranslation;
        mMiwokTranslation= MiwokTranslation;
        mImageResourceId= ImageResourceId;
        mAudioResourceId= AudioResourceId;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getAudioResourceId(){

        return mAudioResourceId;
    }
    public int getImageResourceId(){

        return mImageResourceId;
    }
    public boolean hasImage(){
        if(mImageResourceId==NO_IMAGE_PROVIDED)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
