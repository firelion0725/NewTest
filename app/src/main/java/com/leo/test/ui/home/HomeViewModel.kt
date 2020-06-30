package com.leo.test.ui.home

import android.app.Application
import android.content.Intent
import android.util.Log
import androidx.lifecycle.*
import com.leo.test.ui.SecondActivity

class HomeViewModel(application: Application) : AndroidViewModel(application), LifecycleObserver {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
    private val _context = this.getApplication<Application>();

    fun goTo() {
        val intent = Intent(_context, SecondActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        _context.startActivity(intent)
    }

    open fun bindLifecycle(lifecycleOwner: LifecycleOwner) {
        lifecycleOwner.lifecycle.addObserver(this)
    }

    open fun unbindLifecycle(lifecycleOwner: LifecycleOwner) {
        lifecycleOwner.lifecycle.removeObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.i("HomeVm life cycle", "onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Log.i("HomeVm life cycle", "onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.i("HomeVm life cycle", "onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.i("HomeVm life cycle", "onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.i("HomeVm life cycle", "onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.i("HomeVm life cycle", "onDestroy")
    }
}