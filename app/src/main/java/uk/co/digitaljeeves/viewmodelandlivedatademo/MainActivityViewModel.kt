package uk.co.digitaljeeves.viewmodelandlivedatademo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var currentCount = MutableLiveData<Int>(0)

    init {
        currentCount.value = 0
    }

    fun incrementCount(){
        currentCount.value = currentCount.value?.plus(1)
    }
}