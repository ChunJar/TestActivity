package com.example.cj.testactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Activity:用来管理用户界面的活动
 * 通常一个Activity表示一个页面，可以处理和用户之间的交互工作。
 * 应用程序有对应的入口Activity。声明配置在AndroidManifest.xml。需要对应的action和category。
 */

public class MainActivity extends Activity {
    private Button mainBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainBtn = (Button) findViewById(R.id.main_btn);
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                //实现页面跳转
                startActivity(intent);
            }
        });
    }

}
