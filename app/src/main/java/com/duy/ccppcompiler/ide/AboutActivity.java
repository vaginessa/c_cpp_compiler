package com.duy.ccppcompiler.ide;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.duy.ccppcompiler.R;
import com.jecelyin.editor.v2.ThemeSupportActivity;

public class AboutActivity extends ThemeSupportActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
}
