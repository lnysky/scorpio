package com.lnysky.scorpio.sample;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;


import com.lnysky.scorpio.StateLayout;

public class CustomState extends StateLayout.State<CustomState.ViewHolder> {

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(LayoutInflater inflater, ViewGroup parent) {
        View view = inflater.inflate(R.layout.state_custom, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onSwitchState(ViewHolder holder, boolean showing) {
        super.onSwitchState(holder, showing);
        AlphaAnimation animation;
        if (showing) {
            animation = new AlphaAnimation(0f, 1f);
        } else {
            animation = new AlphaAnimation(1f, 0f);
        }
        animation.setDuration(1000);
        holder.stateView.startAnimation(animation);
    }

    static class ViewHolder extends StateLayout.ViewHolder {

        ViewHolder(View view) {
            super(view);
        }
    }
}
