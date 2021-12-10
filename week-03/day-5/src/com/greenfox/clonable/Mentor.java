package com.greenfox.clonable;

public class Mentor extends Person {
    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        this.setName("Jane Doe");
        this.setAge(30);
        this.setGender("female");
        this.level = "Intermediate";
    }

    @Override
    public Object clone() {
        return null;
    }

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() +
                " " + getLevel() + " mentor.");
    }


    public String getLevel() {
        return level;
    }

}
