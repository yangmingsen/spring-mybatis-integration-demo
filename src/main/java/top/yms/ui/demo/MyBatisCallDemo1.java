package top.yms.ui.demo;

import top.yms.mapper.UserMapper;


public class MyBatisCallDemo1 {


    private  UserMapper userMapper;

//    public MyBatisCallDemo1(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    public UserMapper getUserMapper() {
        return userMapper;
    }
}
