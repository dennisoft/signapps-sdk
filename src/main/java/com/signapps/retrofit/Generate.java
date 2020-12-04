package com.signapps.retrofit;

import com.signapps.interfaces.CaptureService;
import com.signapps.interfaces.TasksService;
import com.signapps.services.AllServices;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Generate {

    public AllServices services(String baseUrl) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        TasksService tasksService = retrofit.create(TasksService.class);
        CaptureService captureService = retrofit.create(CaptureService.class);

        AllServices allServices = new AllServices();
        allServices.setCaptureService(captureService);
        allServices.setTasksService(tasksService);

        return allServices;

    }
}
