package com.example.groupproject;

public class UserStaff {
    private int id;
    private String fullName;
    private String gender;
    private String role;
    private String phoneNo;
    private String email;

    public UserStaff(int id, String fullName, String gender, String role, String phoneNo, String email) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }
}
