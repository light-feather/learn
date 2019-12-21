package bean;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Diaosi {
//    @SerializedName("NAME") //将json中的name的键值改为大写
    private String name;
    private String school;
    private boolean has_girlfriend;
    private double age;
    private Object car;
    private Object house;
    private String[] major;
    private String birthday;
    private String comment;
    //
    private transient String ignore;

    public String getIgnore() {
        return ignore;
    }

    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isHas_girlfriend() {
        return has_girlfriend;
    }

    public void setHas_girlfriend(boolean has_girlfriend) {
        this.has_girlfriend = has_girlfriend;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Object getCar() {
        return car;
    }

    public void setCar(Object car) {
        this.car = car;
    }

    public Object getHouse() {
        return house;
    }

    public void setHouse(Object house) {
        this.house = house;
    }

    public String[] getMajor() {
        return major;
    }

    public void setMajor(String[] major) {
        this.major = major;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "[name:"+name+", age:"+age+", school:"+school+", has_girlfriend:"+has_girlfriend+", car:"+car+", house:"+house+", birthday:"+birthday+", comment:"+comment+""+
                "major:"+Arrays.deepToString(major)+"]";
    }
}
