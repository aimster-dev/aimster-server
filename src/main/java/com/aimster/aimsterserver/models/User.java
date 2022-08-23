package com.aimster.aimsterserver.models;

import java.sql.Timestamp;

public class User {

    private Long id;

    private String username;

    private String password;

    private String email;

    private Long experience;

    private String confirmationCode;

    private Timestamp confirmationDate;

        public User(Long id, String username, String password, String email, Long experience, String confirmationCode, Timestamp confirmationDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.experience = experience;
        this.confirmationCode = confirmationCode;
        this.confirmationDate = confirmationDate;
    }

    public Timestamp getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(Timestamp confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }
}
