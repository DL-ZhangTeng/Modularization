package com.zhangteng.share;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zhangteng.component.ServiceFactory;
@Route(path = "/share/share")
public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        TextView textView = findViewById(R.id.share_textview);
        if (ServiceFactory.getInstance().getAccountService().isLogin()) {
            textView.setText(ServiceFactory.getInstance().getAccountService().getAccountId());
        }
    }
}
