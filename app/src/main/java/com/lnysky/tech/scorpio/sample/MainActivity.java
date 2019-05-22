package com.lnysky.tech.scorpio.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.lnysky.tech.scorpio.Scorpio;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_test_xml).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), TestXmlActivity.class));
            }
        });
    }

    public void testFragment(View v) {
        startActivity(new Intent(this, TestActivity.class));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_loading:
                loading();
                return true;
            case R.id.action_empty:
                empty();
                return true;
            case R.id.action_error:
                error();
                return true;
            case R.id.action_custom:
                custom();
                return true;
            case R.id.action_content:
                content();
                return true;
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.state, menu);
        return true;
    }

    private void content() {
        Scorpio.with(this).content().show();
    }

    private void loading() {
        Scorpio.with(this).loading().setTips("加载中...").show();
    }

    private void empty() {
        Scorpio.with(this).empty().setTips("主页面空空的~~").show();
    }

    private void error() {
        Scorpio.with(this).error()
                .setRetryText("重新加载")
                .setOnRetryListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loading();
                    }
                }).show();
    }

    private void custom() {
        Scorpio.with(this).get(CustomState.class).show();
    }

}
