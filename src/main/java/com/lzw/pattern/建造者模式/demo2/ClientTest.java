package com.lzw.pattern.建造者模式.demo2;

/**
 * 使用建造者模式创建对象
 * <p>
 * 当一个类构造器需要传入很多参数时，如果创建这个类的实例，代码可读性会非常差，而且很容易引入错误，此时就可以利用建造者模式进行重构。
 *
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class ClientTest {
    public static void main(String[] args) {

        //构建Phone对象
        PhoneTest phoneTest = new PhoneTest("intel", "三星屏幕", "金士顿", "华硕");
        System.out.println(phoneTest);

        System.out.println("===============================");

        // 实例化构建者
        Phone.Builder builder = new Phone.Builder();
        Phone phone = builder
                .cpu("intel")
                .screen("三星屏幕")
//                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .build();

        System.out.println(phone.toString());

        System.out.println("====================================");

        Phone phone1 = new Phone.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .build();

        System.out.println(phone1.toString());
    }
}
