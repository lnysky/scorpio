package com.lnysky.scorpio;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;


/**
 * Created by lny on 2018/11/28.
 */
public class Scorpio {

    public static ActivityBar with(Activity activity) {
        return new ActivityBar(activity);
    }

    public static FragmentBar with(android.app.Fragment fragment) {
        return new FragmentBar(fragment);
    }

    public static XFragmentBar with(Fragment fragment) {
        return new XFragmentBar(fragment);
    }

    public static StateLayoutBar with(@NonNull StateLayout stateLayout) {
        return new StateLayoutBar(stateLayout);
    }

}
