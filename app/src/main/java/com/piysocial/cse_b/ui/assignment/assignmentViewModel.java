package com.piysocial.cse_b.ui.assignment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class assignmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public assignmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Assignment fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}