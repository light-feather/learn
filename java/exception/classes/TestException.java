import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个数:");
            int one = scanner.nextInt();
            System.out.println("请输入第二个数:");
            int two = scanner.nextInt();
            System.out.println("两数相除的结果为: " + one / two);
        } catch (InputMismatchException e) {
            System.out.println("你应该输入整数!!!");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0!!!");
        } catch (Exception e) {
            System.out.println("未知异常!!!");
            e.printStackTrace();
        }
        System.out.println("程序运行结束.");
    }
}
