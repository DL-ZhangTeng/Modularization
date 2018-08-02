package com.zhangteng.modularization;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zhangteng.base.AppConfig;
import com.zhangteng.base.BaseApplication;

/**
 * Created by swing on 2018/8/2.
 */
public class MainApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug()) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        for (String moduleApp : AppConfig.moduleApps) {
            try {
                Class clazz = Class.forName(moduleApp);
                BaseApplication baseApplication = (BaseApplication) clazz.newInstance();
                baseApplication.initModuleApp(this);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initModuleData(Application application) {
        for (String moduleApp : AppConfig.moduleApps) {
            try {
                Class clazz = Class.forName(moduleApp);
                BaseApplication baseApplication = (BaseApplication) clazz.newInstance();
                baseApplication.initModuleData(this);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}
