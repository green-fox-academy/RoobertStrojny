package com.greenfox.clonable;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private final String name;
    private List<Student> students;
    private List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        setMentors(new ArrayList<>());
        setStudents(new ArrayList<>());
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + getName() + " cohort has " + getStudents().size() + " students and " + getMentors().size() +
                " mentors.");
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
    }
}
