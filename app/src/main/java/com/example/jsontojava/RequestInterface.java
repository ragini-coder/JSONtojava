package com.example.jsontojava;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("dds861/3932d2ad026a64ccea9c86e5d20ac9b5/raw/26c68320633242159631f263a35def193bc7c3a8/json.json")
    Call<JSONResponse> getJSON();
}
