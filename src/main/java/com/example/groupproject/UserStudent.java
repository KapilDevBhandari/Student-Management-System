package com.example.groupproject;

public class UserStudent {
    private int id;
    private String fullName;
    private String gender;
    private String faculty;
    private String phoneNo;
    private String email;


    public UserStudent(int id, String fullName, String gender, String faculty, String phoneNo, String email) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.faculty = faculty;
        this.phoneNo = phoneNo;
        this.email = email;

    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

}

