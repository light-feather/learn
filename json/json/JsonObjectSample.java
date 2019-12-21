package json;

import bean.Diaosi;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonObjectSample {
    public static void main(String[] args){
//        jsonObject();
//        creatJsonMap();
        createJsonByBean();
    }

    private static void createJsonByBean() {
        Diaosi diaosi = new Diaosi();
        diaosi.setAge(25);
        diaosi.setBirthday("1997-10-23");
        diaosi.setName("Olivin");
        diaosi.setSchool("藍翔");
        diaosi.setHas_girlfriend(false);
        diaosi.setHouse(null);
        diaosi.setCar(null);
        diaosi.setMajor(new String[]{"数控机床","挖掘机"});
        diaosi.setComment("这是一个注释");
        System.out.println(new JSONObject(diaosi).toString());
    }

    private static void creatJsonMap() {
        Map<String,Object> personmap = new HashMap<String,Object>();
        personmap.put("name","王小二");
        personmap.put("age",25);
        personmap.put("birthday","1997-10-23");
        personmap.put("school","蓝翔");
        personmap.put("major",new String[]{"数控机床","挖掘机"});
        personmap.put("has_girlfriend",false);
//        person.put("car",null); //这样写会因为null二义性而报错
        Object nullObject = null;
        personmap.put("car",nullObject);
        personmap.put("house",nullObject);
        personmap.put("comment","只是一个注释");
//        System.out.println(new JSONObject(personmap));
        System.out.println(new JSONObject(personmap).toString());
    }

    /**
     *  "name" : "王小二",
     *  "age" : 25,
     *  "birthday" : "1997-10-23",
     *  "school" : "蓝翔",
     *  "major" : [
     *      "数控机床",
     *      "挖掘机"
     *  ],
     *  "has_girlfriend" : false,
     *  "car" : null,
     *  "house" : null,
     *  "comment" : "注释"
     *
     * */
    private static void jsonObject(){
        JSONObject person = new JSONObject();
        person.put("name","王小二");
        person.put("age",25);
        person.put("birthday","1997-10-23");
        person.put("school","蓝翔");
        person.put("major",new String[]{"数控机床","挖掘机"});
        person.put("has_girlfriend",false);
//        person.put("car",null); //这样写会因为null二义性而报错
        Object nullObject = null;
        person.put("car",nullObject);
        person.put("house",nullObject);
        person.put("comment","只是一个注释");
        System.out.println(person.toString());
    }

}
