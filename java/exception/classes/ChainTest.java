package exception;
//异常链
public class ChainTest {
    /**
     * test1()抛出"喝大了"异常
     * test2()调用test1()，捕获"喝大了"异常，并且包装成运行时异常继续抛出
     * main方法中，调用test2(),尝试捕获test2()抛出的异常
     * @param args
     */
    public static void main(String[] args){
        ChainTest chainTest = new ChainTest();
        try {
            chainTest.test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void test1() throws DrunkException {
        throw new DrunkException("喝车别开酒！");
    }
    public void test2(){
        try {
            test1();
        } catch (DrunkException e) {
          /*  RuntimeException runtimeException = new RuntimeException("司机一滴酒，亲人两行泪~~");
            runtimeException.initCause(e);*/
//          相对来说简单点的实现方法
          RuntimeException runtimeException = new RuntimeException(e);
            throw runtimeException;
        }
    }
}
