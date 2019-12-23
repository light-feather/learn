package exception;

public class TryCatchTest {
    public static void main(String[] args){
        TryCatchTest tryCatchTest = new TryCatchTest();
       /* int result1 = tryCatchTest.test1();
        System.out.println("The value of result1 is "+result1);
        int result2 = tryCatchTest.test2();
        System.out.println("The value of result2 is " + result2);*/
       int result3 = tryCatchTest.test3();
       System.out.println("The value of result3 is " + result3);
    }
    public int test1(){
        int result = 100;
        int number = 10;
        try {
            while(number>-1){
                number--;
                result = result + result/number;
            }
            return result;
        } catch (Exception e) {
            System.out.println("Find Exception!!!");
            e.printStackTrace();
            return -1;
        }
//        return result;
    }

    public int test2(){
        int result = 100;
        int number = 10;
        try {
            while(number>-1){
                number--;
                result = result + result/number;
//                发生异常之后，try中后续代码将跳过，转而执行catch中的语句和finally中的语句
                System.out.println("result: "+result+", number: "+number);
            }
            return result;
        } catch (Exception e) {
            System.out.println("Find Exception!!!");
            e.printStackTrace();
            return result = 999;
        }finally {
            //finally中的语句会在try和catch中的语句return返回之前执行
            System.out.println("This is the operation after excepting");
            System.out.println("the value of result is " + result);
        }
    }

    public int test3(){
        int result = 100;
        int number = 10;
        try {
            while(number>-1){
                number--;
                result = result + result/number;
            }
        } catch (Exception e) {
            System.out.println("Find Exception!!!");
            e.printStackTrace();
        }finally {
            System.out.println("This is the operation after excepting");
            System.out.println("the value of result is " + result);//此处的result为抛出异常之前的值
//            return 1111;
        }
        System.out.println("The end of test3()");
        return 1111;
    }
}
