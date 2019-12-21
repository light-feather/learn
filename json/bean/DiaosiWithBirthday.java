package bean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class DiaosiWithBirthday {
    private String name;
    private String school;
    private boolean has_girlfriend;
    private double age;
    private Object car;
    private Object house;
    //将数组替换为集合类
//    private List<String> major;
    private Set<String> major;

    private Date birthday;
    private String comment;

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

   /* public List<String> getMajor() {
        return major;
    }

    public void setMajor(List<String> major) {
        this.major = major;
    }*/

    public Set<String> getMajor() {
        return major;
    }

    public void setMajor(Set<String> major) {
        this.major = major;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
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
        return "[name:"+name+", age:"+age+", school:"+school+", has_girlfriend:"+has_girlfriend+", car:"+car+", house:"+house+", birthday:"+birthday.toString()+", comment:"+comment+", "+
                "major:"+ major.toString()+"]";
    }
}
