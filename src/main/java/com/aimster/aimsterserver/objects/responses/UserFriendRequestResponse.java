package com.aimster.aimsterserver.objects.responses;

public class UserFriendRequestResponse {

    private Long id;

    private Long requesterId;

    private String requesterUsername;

    private Long requesterExperience;

    public UserFriendRequestResponse() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(Long requesterId) {
        this.requesterId = requesterId;
    }

    public String getRequesterUsername() {
        return requesterUsername;
    }

    public void setRequesterUsername(String requesterUsername) {
        this.requesterUsername = requesterUsername;
    }

    public Long getRequesterExperience() {
        return requesterExperience;
    }

    public void setRequesterExperience(Long requesterExperience) {
        this.requesterExperience = requesterExperience;
    }
}
