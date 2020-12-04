package com.signapps.services;

import com.signapps.interfaces.CaptureService;
import com.signapps.interfaces.TasksService;

public class AllServices {
    TasksService tasksService;
    CaptureService captureService;

    public AllServices() { }

    public AllServices(TasksService tasksService, CaptureService captureService) {
        this.tasksService = tasksService;
        this.captureService = captureService;
    }

    public TasksService getTasksService() {
        return tasksService;
    }

    public void setTasksService(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    public CaptureService getCaptureService() {
        return captureService;
    }

    public void setCaptureService(CaptureService captureService) {
        this.captureService = captureService;
    }
}
