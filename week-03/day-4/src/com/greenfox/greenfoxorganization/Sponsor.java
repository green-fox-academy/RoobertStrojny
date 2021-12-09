package com.greenfox.greenfoxorganization;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public Sponsor() {
        this.setName("Jane Doe");
        this.setAge(30);
        this.setGender("female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() +
                " who represents " + getCompany() + " and hired " + getHiredStudents() + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public String getCompany() {
        return company;
    }


    public int getHiredStudents() {
        return hiredStudents;
    }

}
