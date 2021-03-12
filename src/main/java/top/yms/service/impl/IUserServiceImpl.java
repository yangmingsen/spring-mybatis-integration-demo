package top.yms.service.impl;

import top.yms.service.IAccountService;
import top.yms.service.IUserService;

public class IUserServiceImpl implements IUserService {
    private IAccountService accountService;

    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }
}
