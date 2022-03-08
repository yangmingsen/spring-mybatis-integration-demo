package top.yms.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.yms.mapper.RoleMapper;
import top.yms.pojo.MyUser;
import top.yms.mapper.UserMapper;
import top.yms.pojo.Role;
import top.yms.ui.demo.Demo3;


public class MyBatisTestDemo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        Demo3 bean = ac.getBean(Demo3.class);

        UserMapper userMapper = ac.getBean(UserMapper.class);
        MyUser user = userMapper.getUser(1);
        System.out.println(user.toString());

        userMapper.getUserList().forEach(System.out::println);

        RoleMapper roleMapper = ac.getBean(RoleMapper.class);
        Role role = new Role();
        role.setId(3);
        role.setNote("Eric2");
        role.setRoleName("Eric 34 35");
        roleMapper.insert(role);




    }
}
