package com.lnysky.tech.scorpio.sample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;

import com.lnysky.tech.scorpio.State;
import com.lnysky.tech.scorpio.StateLayout;

public class CustomState extends State<CustomState.ViewHolder> {

    @Override
    protected ViewHolder onCreateViewHolder(LayoutInflater inflater, ViewGroup parent) {
        View view = inflater.inflate(R.layout.custom, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onSwitchState(ViewHolder holder, boolean show) {
        super.onSwitchState(holder, show);
        AlphaAnimation animation;
        if (show) {
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