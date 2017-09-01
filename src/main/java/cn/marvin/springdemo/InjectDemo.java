package cn.marvin.springdemo;

public class InjectDemo {
    private String name;
    private int age;

    public InjectDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("name:" + name + "--age:" + age);
    }
}
