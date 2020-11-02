package com.piysocial.cse_b.ui.resources;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class resourcesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public resourcesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}