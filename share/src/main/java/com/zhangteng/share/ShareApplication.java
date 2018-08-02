package com.zhangteng.share;

import android.app.Application;

import com.zhangteng.base.BaseApplication;

/**
 * Created by swing on 2018/8/2.
 */
public class ShareApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {

    }

    @Override
    public void initModuleData(Application application) {

    }
}
