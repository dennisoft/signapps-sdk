package com.signapps.models;

import com.google.gson.Gson;
import retrofit2.converter.gson.GsonConverterFactory;

public class Tasks {
    private long taskId;
    private long sectionId;
    private String title;
    private boolean required;
    private String status;

    public Tasks(long taskId, long sectionId, String title, boolean required, String status) {
        this.taskId = taskId;
        this.sectionId = sectionId;
        this.title = title;
        this.required = required;
        this.status = status;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public long getSectionId() {
        return sectionId;
    }

    public void setSectionId(long sectionId) {
        this.sectionId = sectionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
