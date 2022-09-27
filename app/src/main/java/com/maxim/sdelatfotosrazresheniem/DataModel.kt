package com.maxim.sdelatfotosrazresheniem

import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel: ViewModel(){
    val photokartochka : MutableLiveData<ImageView> by lazy{
        MutableLiveData<ImageView>()
    }
}
