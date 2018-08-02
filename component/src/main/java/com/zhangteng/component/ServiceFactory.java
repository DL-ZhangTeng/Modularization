package com.zhangteng.component;

import com.zhangteng.component.empty_service.EmptyAccountService;
import com.zhangteng.component.service.IAccountService;

/**
 * Created by swing on 2018/8/2.
 */
public class ServiceFactory {
    private IAccountService accountService;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return Inner.serviceFactory;
    }

    private static class Inner {
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }

    public IAccountService getAccountService() {
        return accountService == null ? new EmptyAccountService() : accountService;
    }

    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }
}
