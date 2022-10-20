package com.allen.test;

/**
 * @author ：jhys
 * @date ：Created in 2021/9/11 10:15
 * @Description ：
 */
public class TestException {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            if (b == 0) {
                throw new ArithmeticException();
            };
            System.out.println("a/b的值是：" + a / b);
            System.out.println("this will not be printed!");
        } catch (ArithmeticException e) {
            System.out.println("程序出现异常，变量b不能为0！" + e);
        }
        System.out.println("程序正常结束。");
    }
}
class TestException1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        System.out.println("a/b的值是：" + a / b);
        System.out.println("this will not be printed!");
    }
}
class TestThrow{
    static void proc(){
        try{
            throw new NullPointerException("demo");
        }catch(NullPointerException e){
            System.out.println("Caught inside proc");
            throw e;
        }
    }

    public static void main(String [] args){
        try{
            proc();
        }catch(NullPointerException e){
            System.out.println("Recaught: "+e);
        }
    }
}
class TestThrows{
    // throws抛出异常，在main方法中使用try catch进行捕获
    static void throw1() throws IllegalAccessException{
        System.out.println("Inside throw1 . ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args){
        try {
            throw1();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class TestFinally{
    static void proc1(){
        try{
            System.out.println("inside proc1");
            throw new RuntimeException("demo");
        }finally{
            System.out.println("proc1's finally");
        }
    }
    static void proc2(){
        try{
            System.out.println("inside proc2");
            return ;
        } finally{
            System.out.println("proc2's finally");
        }
    }
    static void proc3(){
        try{
            System.out.println("inside proc3");
        }finally{
            System.out.println("proc3's finally");
        }
    }
    public static void main(String [] args){
        try{
            proc1();
        }catch(Exception e){
            System.out.println("Exception caught");
        }
        proc2();
        proc3();
    }
}