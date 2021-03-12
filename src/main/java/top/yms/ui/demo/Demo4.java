package top.yms.ui.demo;

import org.springframework.stereotype.Component;


public class Demo4 {

    static class A {
        protected void say(String msg) {
            msg = "1234";
            System.out.println(msg);
        }
    }

    static class B extends A {
        protected void say(String msg) {
            super.say(msg);
            msg = "123sdf";
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.say("hello");
    }

}
