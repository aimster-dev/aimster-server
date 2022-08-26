package com.aimster.aimsterserver.objects.requests;

// The name of this bothers me too
public class CreateUserFriendRequestRequest {

    private Long id;

    private Long sourceId;

    private Long targetId;

    public CreateUserFriendRequestRequest() {}

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
