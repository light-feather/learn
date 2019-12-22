import java.util.ArrayList;
import java.util.List;

public class TestAltEnter {
    public static void main(String[] args){
        String name = "name";
        int age = 22;
//        String show = "name: "+ name + "age: " + age;
//        String show = String.format("name: %sage: %d", name, age);
        String show = new StringBuilder().append("name: ").append(name).append("，age: ").append(age).toString();
        System.out.println(show);
//        System.out.printf("name: %s, age: %d%n", name, age);
        test();
    }

    private static void test() {
        List<String> list = new ArrayList<String>();
        int temp = 0;
        while(temp<10){
            list.add("test"+temp);
            temp++;
        }
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        for (String s : list) {
            System.out.println(s);
        }
    }
}
