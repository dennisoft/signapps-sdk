package com.signapps.models;

public class CaptureResponse {
    private long taskId;
    private String newStatus;
    private String message;
    private String responseCode;

    public CaptureResponse(long taskId, String newStatus, String message, String responseCode) {
        this.taskId = taskId;
        this.newStatus = newStatus;
        this.message = message;
        this.responseCode = responseCode;
    }

    public CaptureResponse(long taskId, String message, String responseCode) {
        this.taskId = taskId;
        this.message = message;
        this.responseCode = responseCode;
    }

    public CaptureResponse(String message, String responseCode) {
        this.message = message;
        this.responseCode = responseCode;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
