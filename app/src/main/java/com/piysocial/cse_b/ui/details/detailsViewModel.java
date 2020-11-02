package com.piysocial.cse_b.ui.details;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class detailsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public detailsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Class Details fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}