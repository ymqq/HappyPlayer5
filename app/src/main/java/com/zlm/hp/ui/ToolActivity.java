package com.zlm.hp.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zlm.libs.widget.SwipeBackLayout;

/**
 * @Description: 相关工具
 * @author: zhangliangming
 * @date: 2018-12-30 0:41
 **/
public class ToolActivity extends BaseActivity {
    /**
     *
     */
    private SwipeBackLayout mSwipeBackLayout;


    @Override
    protected int setContentLayoutResID() {
        return R.layout.activity_tool;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        mSwipeBackLayout = findViewById(R.id.swipeback_layout);
        mSwipeBackLayout.setSwipeBackLayoutListener(new SwipeBackLayout.SwipeBackLayoutListener() {

            @Override
            public void finishActivity() {
                finish();
                overridePendingTransition(0, 0);
            }
        });

        TextView titleView = findViewById(R.id.title);
        titleView.setText(getString(R.string.tab_tool));

        //返回
        ImageView backImg = findViewById(R.id.backImg);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSwipeBackLayout.closeView();
            }
        });
    }

    @Override
    protected void handleUIMessage(Message msg) {

    }

    @Override
    protected void handleWorkerMessage(Message msg) {

    }

    @Override
    public void onBackPressed() {
        mSwipeBackLayout.closeView();
    }
}
