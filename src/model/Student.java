package model;

public class Student {
    private String name;
    private Integer age;
    private Character gender;
    private String ID;

    public Student(String n, Integer a, Character g, String id) {
        this.name = n;
        this.age = a;
        this.gender = g;
        this.ID = id;
    }

    public Character getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }
}


