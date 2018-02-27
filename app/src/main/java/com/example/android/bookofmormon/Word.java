package com.example.android.bookofmormon;

/**
 * Created by avishai on 2/23/2018.
 */

public class Word {

    private int mAudioResourceId;

    public Word(int audioResourceId){
        mAudioResourceId = audioResourceId;
    }

    public int getAudioResourceId(){ return mAudioResourceId;}
}
