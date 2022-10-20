package com.allen.动态代理;

/**
 * @author ：jhys
 * @date ：Created in 2021/5/16 7:57
 * @Description ：
 */
//接口
interface Hello {
    String sayHello(String str);
}
class HelloImpl implements Hello {
    @Override
    public String sayHello(String str) {
        return "HelloImpl: " + str;
    }
}

// 静态代理方式
class StaticProxiedHello implements Hello{
    private Hello hello = new HelloImpl();

    @Override
    public String sayHello(String str) {
        System.out.println("You said: " + str);
        return hello.sayHello(str);
    }
}