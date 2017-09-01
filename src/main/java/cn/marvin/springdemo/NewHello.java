package cn.marvin.springdemo;

public class NewHello extends BaseBean {
    private String message;
    private String message2;
    private String message3;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage2(String message) {
        this.message2 = message;
    }

    public void setMessage3(String message) {
        this.message3 = message;
    }

    public void getMessage() {
        System.out.println("NewHello message:" + this.message);
    }

    public void getMessage2() {
        System.out.println("NewHello message2:" + this.message2);
    }

    public void getMessage3() {
        System.out.println("NewHello message3:" + this.message3);
    }
}
