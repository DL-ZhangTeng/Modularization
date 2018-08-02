package com.zhangteng.component.empty_service;

import com.zhangteng.component.service.IAccountService;

/**
 * Created by swing on 2018/8/2.
 */
public class EmptyAccountService implements IAccountService {
    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }
}
