package top.yms.service.impl;


import org.springframework.stereotype.Service;
import top.yms.dao.IAccountDao;
import top.yms.dao.impl.AccountDaoImpl;
import top.yms.service.IAccountService;
import top.yms.service.IUserService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao ;
    private IUserService userService;

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public IAccountDao getAccountDao() {
        return accountDao;
    }

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void  saveAccount(){
        accountDao.saveAccount();
    }


}
