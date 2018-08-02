package com.zhangteng.login;

import android.app.Application;

import com.zhangteng.base.BaseApplication;
import com.zhangteng.component.ServiceFactory;

/**
 * Created by swing on 2018/8/2.
 */
public class LoginApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
