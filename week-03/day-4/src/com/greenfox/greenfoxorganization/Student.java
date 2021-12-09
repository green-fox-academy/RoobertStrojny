package com.greenfox.greenfoxorganization;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        this.setName("Jane Doe");
        this.setAge(30);
        this.setGender("female");
        setPreviousOrganization("The School of Life");
        setSkippedDays(0);
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " years old " + this.getGender() +
                " from " + getPreviousOrganization() + " who skipped " + getSkippedDays() + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }

    public void setSkippedDays(int skippedDays) {
        this.skippedDays = skippedDays;
    }
}
