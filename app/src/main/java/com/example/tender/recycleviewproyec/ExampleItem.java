package com.example.tender.recycleviewproyec;

public class ExampleItem {
    private String mImagerUrl;
    private String mCreator;
    private int mLikes;

    public ExampleItem(String imagerUrl, String creator, int likes) {
        mImagerUrl = imagerUrl;
        mCreator = creator;
        mLikes = likes;
    }

    public String getImagerUrl() {
        return mImagerUrl;
    }

    public String getCreator() {
        return mCreator;
    }
    public int getLikeCount(){
        return mLikes;

    }
}
