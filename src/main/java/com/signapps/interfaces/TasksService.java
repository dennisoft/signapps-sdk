package com.signapps.interfaces;

import com.signapps.models.Tasks;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface TasksService {
    @Headers("Content-Type:application/json; charset=UTF-8")
    @GET("{version}/tasks/{id}")
    Call<Tasks> getTask(@Path("id") long id, @Path("version") String version);
}
