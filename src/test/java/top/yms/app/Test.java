package top.yms.app;

import org.springframework.util.StringUtils;

public class Test {

    @org.junit.Test
    public void test() {
        String hh = "Hello,Hhh,osdf";
        String[] strings = StringUtils.tokenizeToStringArray(hh, ",");
        System.out.println(strings);

    }

    public void test1() {

    }
}
