package com.aimster.aimsterserver.objects.requests;

public class UpdateUserRequest {

    private Long id;

    private String username;

    private String password;

    private String email;

    private String confirmationCode;

    private String confirmationDate;

    private Long experience;

    public UpdateUserRequest(String username, String password, String email, String confirmationCode, String confirmationDate, Long experience) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.confirmationCode = confirmationCode;
        this.confirmationDate = confirmationDate;
        this.experience = experience;
    }

    public UpdateUserRequest() {}

    public String getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(String confirmationDate) {
        this.confirmationDate = confirmationDate;
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

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }
}
