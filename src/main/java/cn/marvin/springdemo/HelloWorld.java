package cn.marvin.springdemo;

public class HelloWorld extends BaseBean {
    private String message;
    private String message2;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage2(String message) {
        this.message2 = message;
    }

    public void getMessage() {
        System.out.println("Your message:" + this.message);
    }

    public void getMessage2() {
        System.out.println("Your message2:" + this.message2);
    }
}
