package com.piysocial.cse_b.ui.announcement;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class announcementViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public announcementViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Announcement fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}