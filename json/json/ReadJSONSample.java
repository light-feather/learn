package json;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class ReadJSONSample {
    public static void main(String[] args) throws IOException {
//        System.out.println(ReadJSONSample.class.getResource("")); //不同于Eclipse上的创建方式，json文件要放到resource下
        File file = new File(ReadJSONSample.class.getResource("/Olivin.json").getFile());
        String content = FileUtils.readFileToString(file);
        /**
         * JSONObject不支持javabean方式反解析
         * */
        JSONObject Olivin = new JSONObject(content);
        //如果json中没有name则不会打印
        if(!Olivin.isNull("name")) {
            System.out.println("姓名是:" + Olivin.getString("name"));
        }
        if(!Olivin.isNull("age")){
            System.out.println("年龄: "+Olivin.getDouble("age"));
        }
        if(!Olivin.isNull("school")){
            System.out.println("学校:"+Olivin.getString("school"));
        }
        if(!Olivin.isNull("has_girlfriend")){
            System.out.println("有没有女朋友: "+Olivin.getBoolean("has_girlfriend"));
        }
        if(!Olivin.isNull("major")){JSONArray jsonArray = Olivin.getJSONArray("major");
            for (int i = 0; i < jsonArray.length(); i++) {
                String major = (String) jsonArray.get(i);
                System.out.println("专业-"+(i+1)+"-"+major);
            }
        }
        if(!Olivin.isNull("comment")){
            System.out.println("注释: "+Olivin.getString("comment"));
        }
    }
}
