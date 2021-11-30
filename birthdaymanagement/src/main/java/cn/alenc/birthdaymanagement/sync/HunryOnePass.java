package cn.alenc.birthdaymanagement.sync;

//饿汉式的单例模式
public class HunryOnePass {
    private final static HunryOnePass instance = new HunryOnePass();


    private HunryOnePass(){

    }

    public static HunryOnePass getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(HunryOnePass.getInstance());
        System.out.println(HunryOnePass.getInstance());
    }
}
