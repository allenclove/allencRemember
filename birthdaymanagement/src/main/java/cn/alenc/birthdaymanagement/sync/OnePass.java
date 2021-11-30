package cn.alenc.birthdaymanagement.sync;

import java.util.HashSet;

//懒加载的单例模式
public class OnePass {
    private static volatile OnePass instance;

    private OnePass(){

    }

    public static OnePass getInstance(){
        if(instance == null){
            synchronized (OnePass.class){
                if(instance == null){
                    instance = new OnePass();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        System.out.println(OnePass.getInstance());
        System.out.println(OnePass.getInstance());


        String a = "1234";
        String b = "123";


        HashSet set;
    }
}
