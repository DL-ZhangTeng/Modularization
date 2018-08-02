package com.zhangteng.login;

import com.zhangteng.component.service.IAccountService;

/**
 * Created by swing on 2018/8/2.
 */
public class AccountService implements IAccountService {
    @Override
    public boolean isLogin() {
        return true;
    }

    @Override
    public String getAccountId() {
        return "1111";
    }
}
