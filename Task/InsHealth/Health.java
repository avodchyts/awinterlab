package com.InsHealth;

public class Health {
    private  String name;
    private  int age;
    private String sex;
    private String nationality;

    public Health() {    }
    public Health(String name, int age, String sex, String nationality) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }
    public void setHealth(String name, int age, String sex, String nationality) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }
    public void getHealth() {
        System.out.println("Name - " + this.name);
        System.out.println("Age -" + this.age);
        System.out.println("Sex - " + this.sex);
        System.out.println("Nationality - " + this.nationality);
    }
}
