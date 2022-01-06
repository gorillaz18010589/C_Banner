package android.wenxlu.mylibrary.indicator;

import android.view.View;
import android.wenxlu.mylibrary.config.IndicatorConfig;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

public interface Indicator extends ViewPager.OnPageChangeListener {
    @NonNull
    View getIndicatorView();

    IndicatorConfig getIndicatorConfig();

    void onPageChanged(int count, int currentPosition);

}
