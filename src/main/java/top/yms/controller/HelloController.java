package top.yms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 控制器类
@Controller
@RequestMapping(path="/user")
public class HelloController {
    private int count = 0;

    private final ReentrantLock lock = new ReentrantLock();

    /**
     * 入门案例
     * @return
     */
    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("Hello StringMVC");
        return "success";
    }

    /**
     * RequestMapping注解
     * @return
     */
    @RequestMapping(value="/testRequestMapping",params = {"username=heihei"},headers = {"Accept"})
    public String testRequestMapping(){
        lock.lock();
        try {
            count++;
            System.out.println("count="+count);
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return "success";
    }


    @RequestMapping("/reset")
    @ResponseBody
    public String reset() {
        this.count = 0;
        System.out.println("currentCount="+count);
        return "reset sucdess";
    }


}
