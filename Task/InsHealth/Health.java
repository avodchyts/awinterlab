package com.InsHealth;

public class Health {
    private  String name;
   private  int age;
  private String sex;
  private String nationality;

  public Health() { }
  public Health(String name, int age, String sex, String nationality) {
      this.name = name;
      this.age = age;
      this.sex = sex;
      this.nationality = nationality;
  }

    public void setName(String name) {  this.name = name; }
    public void getName() { System.out.println("Name - " + this.name); }

    public void setAge (int age) {  this.age = age;}
    public void getAge() {System.out.println("Age -" + this.age); }

    public void setSex(String sex) { this.sex = sex; }
    public void getSex() { System.out.println("Sex - " + this.sex);}

  public void setNationality(String nationality) {this.nationality = nationality;}
    public void getNationality() {System.out.println("Nationality - " + this.nationality); }

    public String toString(){return"Name" + " " + name + " " + "Age" + " " + age + " " + "Sex" + " " + sex;}
}
