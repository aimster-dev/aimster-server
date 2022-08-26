package com.aimster.aimsterserver.objects.responses;

/**
 * This object encapsulates all properties of User that can be sent back to the client.
 * Properties like password are excluded because of security risks or because the fields are not necessary.
 */
public class UserProfileResponse {

    private Long id;

    private String username;

    private Long experience;

    public UserProfileResponse() {}

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

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }
}
