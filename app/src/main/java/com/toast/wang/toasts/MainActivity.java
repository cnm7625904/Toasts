package com.toast.wang.toasts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.toast.wang.toastutils.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtils.showShortToast(this,"没问题");
    }
}
