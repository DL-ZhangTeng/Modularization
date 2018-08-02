package com.zhangteng.base;

import android.app.Application;

/**
 * Created by swing on 2018/8/2.
 */
public abstract class BaseApplication extends Application {

    public abstract void initModuleApp(Application application);

    public abstract void initModuleData(Application application);
}
