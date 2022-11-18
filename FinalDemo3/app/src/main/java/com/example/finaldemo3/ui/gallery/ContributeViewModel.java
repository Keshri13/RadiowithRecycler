package com.example.finaldemo3.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContributeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ContributeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Contribute fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}