package top.yms.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.yms.pojo.Account;
import top.yms.pojo.Role;
import top.yms.pojo.User;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 请求参数绑定
 */
@RestController
@RequestMapping("/param")
public class ParamController {

    /**
     * 请求参数绑定入门
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("执行了...");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        return "success";
    }

    /**
     * 请求参数绑定把数据封装到JavaBean的类中
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了...");
        System.out.println(account);
        return "success";
    }



    @RequestMapping("/getMapping")
    public Object getMapping(@RequestBody Map map) {
        System.out.println(map.toString());
        Map<String, Object> map1 = new HashMap<String, Object>();
        for(int i=0; i<5; i++) {
            map1.put("key"+i, "value"+i);
        }
        return map1;
    }

    @RequestMapping("/case1")
    public Object case1(Role role) {
        System.out.println(role);
        return role.toString();
    }

    @RequestMapping(value="/responseBody", produces="application/json")
    @ResponseBody
    public Map<String, Object> responseBody(){
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("param1", "abc");
        retMap.put("param2", "abcd");
        return retMap;
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("执行了...");
        System.out.println(user);
        return "success";
    }

    /**
     * 原生的API
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了...");
        System.out.println(request);

        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);
        return "success";
    }

}
