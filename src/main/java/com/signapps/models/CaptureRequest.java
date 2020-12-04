package com.signapps.models;

public class CaptureRequest {
    private long taskId;
    private String status;
    private String userId;

    public CaptureRequest(long taskId, String status, String userId) {
        this.taskId = taskId;
        this.status = status;
        this.userId = userId;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
