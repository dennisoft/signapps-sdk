package com.signapps.interfaces;

import com.signapps.models.CaptureRequest;
import com.signapps.models.CaptureResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface CaptureService {
    @Headers("Content-Type:application/json; charset=UTF-8")
    @POST("{version}/tasks/capture")
    Call<CaptureResponse> captureChange(@Body CaptureRequest newRequest, @Path("version") String version);
}
