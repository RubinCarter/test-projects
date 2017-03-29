package com.rubin.test;


import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * Created by RubinCarter on 2016/10/30.
 */
public class Test {

    private static ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className) {
        Object o;
        if((o = map.get(className)) == null) {
            Object o1 = initInstance();
            o = map.putIfAbsent(className, o1);
            if(o == null)
                o = o1;
        }
        return o;
    }

    private static Object initInstance() {
        return new Object();
    }


    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Test.getInstance("aa") + "dd");
        System.out.println(Test.getInstance("aa") + "aa");
    }/*

//    @org.junit.Test
    public void testThread() throws InterruptedException {
        *//*for (int i = 0; i < 10; i++) {
            final int n = i;
            Thread thread = new Thread(()->
                System.out.println(String.format("线程 %s 编号为 %s ", Thread.currentThread().getName(), n))
            );
            thread.start();
        }


        TimeUnit.SECONDS.sleep(20);*//*
    }

    public Object instance = null;

    private static final int _1MB = 1024 * 1014;

    private byte[] bigSize = new byte[2 * _1MB];

//    @org.junit.Test
    public void test(){
        System.out.println("test");
    }

//    @org.junit.Test
    public void test1(){
        *//*List<String> stringList = new ArrayList<>();
        int i = 0;
        while (true){
            stringList.add(String.valueOf(i).intern());
        }*//*
    }

//    @org.junit.Test
    public void test2() {
        *//*String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str11 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str11.intern() == str11);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);*//*

        String st1 = new String("java1".getBytes());
        System.out.println(st1.intern() == st1);
     }

//     @org.junit.Test
    public void testGC() {
         Test test = new Test();
         Test test1 = new Test();
         test.instance = test1;
         test1.instance = test;

         test = null;
         test1 = null;
         System.gc();
    }*/

}
