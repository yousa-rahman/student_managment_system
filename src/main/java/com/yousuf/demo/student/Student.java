package com.yousuf.demo.student;

import java.util.UUID;

public class Student {

    private  final UUID studentID;
    private final String firstName;
    private final String secondName;
    private final String email;
    private  final Gender gender;

    public Student(UUID studentID, String firstName, String secondName, String email, Gender gender) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.gender = gender;
    }

    public UUID getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    enum Gender{
        MALE, FEMALE, OTHER
    }
}
