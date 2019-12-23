package exception;
//自定义异常类
public class DemoException extends Exception {
    public DemoException() {
        super();
    }

    public DemoException(String message) {
        super(message);
    }
}
