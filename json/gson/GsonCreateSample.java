package gson;

import bean.Diaosi;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;

public class GsonCreateSample {
    public static void main(String[] args) {
        createGsonByBuilder();
    }

    private static void createGsonOrdinary() {
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
        Gson gson = new Gson();
        System.out.println(gson.toJson(diaosi));
    }
    private static void createGsonByBuilder(){
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
        //
        diaosi.setIgnore("创建json时会被忽略的属性，你看不到他的值");
        System.out.println(diaosi.getIgnore());

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting(); //以美化后的方式打印json数据
        //重写json中的命名策略,将小写name变为大写
        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {
            public String translateName(Field field) {
                if(field.getName().equals("name"))
                    return "NAME";
                return field.getName();
            }
        });
        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(diaosi));
    }
}
