package com.signapps;

import com.signapps.interfaces.CaptureService;
import com.signapps.interfaces.TasksService;
import com.signapps.models.CaptureRequest;
import com.signapps.models.CaptureResponse;
import com.signapps.models.Tasks;
import com.google.gson.*;
import com.signapps.retrofit.Generate;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class App {
    public static void main( String[] args ) throws IOException {
        // Set Variables
        final String BASE_URL = "http://44.237.165.153:8081/api/todo/";
        final String VERSION = "v1";

        // Get Services
        TasksService tasksService = new Generate().services(BASE_URL).getTasksService();
        CaptureService captureService = new Generate().services(BASE_URL).getCaptureService();

        // Call the tasks service
        Call<Tasks> call = tasksService.getTask(1,VERSION);
        Response<Tasks> response = call.execute();

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        // Print tasks service response and print it as a JSON string
        System.out.println(new Gson().toJson(response.body()));

        // Call the capture service
        Call<CaptureResponse> newCall = captureService.captureChange(new CaptureRequest(1,"Completed", "john"),VERSION);
        Response<CaptureResponse> newResponse = newCall.execute();

        if (!newResponse.isSuccessful()) {
            throw new IOException(newResponse.errorBody() != null
                    ? newResponse.errorBody().string() : "Unknown error");
        }

        // Print Capture service response and print it as a JSON string
        System.out.println(new Gson().toJson(newResponse.body()));
    }
}
