package gson;

import bean.Diaosi;
import bean.DiaosiWithBirthday;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class GsonReadSample {
    public static void main(String[] args) throws IOException {
//        createGsonOrdinary();
        createGsonWithDate();
    }
    private static void createGsonWithDate() throws IOException {
        File file = new File(GsonReadSample.class.getResource("/Olivin.json").getFile());
        String content = FileUtils.readFileToString(file);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setDateFormat("yyyy-MM-dd").create();
        DiaosiWithBirthday diaosi = gson.fromJson(content,DiaosiWithBirthday.class);
        System.out.println(diaosi.toString());
        System.out.println(diaosi.getBirthday().toString());
        //json中的数组可以和java中的集合类相对应
        System.out.println(diaosi.getMajor());
        System.out.println(diaosi.getMajor().getClass());
    }
    private static void createGsonOrdinary() throws IOException {
        File file = new File(GsonReadSample.class.getResource("/Olivin.json").getFile());
        String content = FileUtils.readFileToString(file);

        Gson gson = new Gson();
        //反向解析json生成Diaosi对象
        Diaosi diaosi = gson.fromJson(content,Diaosi.class);
        System.out.println(diaosi.toString());
    }
}
