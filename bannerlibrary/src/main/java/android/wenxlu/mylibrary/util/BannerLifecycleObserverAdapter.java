package android.wenxlu.mylibrary.util;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class BannerLifecycleObserverAdapter implements LifecycleObserver {
    private final BannerLifecycleObserver mObserver;
    private final LifecycleOwner mLifecycleOwner;

    public BannerLifecycleObserverAdapter(LifecycleOwner lifecycleOwner, BannerLifecycleObserver observer) {
        mLifecycleOwner = lifecycleOwner;
        mObserver = observer;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        Log.i("hank", "onStart");
        mObserver.onStart(mLifecycleOwner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        Log.i("hank", "onStop");
        mObserver.onStop(mLifecycleOwner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        Log.i("hank", "onDestroy");
        mObserver.onDestroy(mLifecycleOwner);
    }

}