package com.lzw.pattern.建造者模式.demo2;


/**
 * 手机类
 * @author : lzw
 * @date : 2021/12/27
 * @since : 1.0
 */
public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    /**
     * 私有构造方法
     * @return
     */
    private Phone(Builder builder){
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainboard = builder.mainboard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        /**
         * 静态类部类可以访问外部类的静态方法
         * @return Phone，手机类
         */
        public Phone build() {
           return new Phone(this);
        }
    }
}
