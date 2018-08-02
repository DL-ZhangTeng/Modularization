package com.zhangteng.login;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.zhangteng.component.ServiceFactory;

/**
 * Created by swing on 2018/8/2.
 */
@Interceptor(priority = 8, name = "登录拦截器")
public class LoginInterceptor implements IInterceptor {
    private Context context;

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        if (postcard.getPath().equals("share/share")) {
            if (ServiceFactory.getInstance().getAccountService().isLogin()) {
                callback.onContinue(postcard);
            } else {
                callback.onInterrupt(new RuntimeException("请登录"));
            }
        } else {
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {
        this.context = context;
    }
}
