package com.learn2crack.network;

import com.learn2crack.model.Response;
import com.learn2crack.model.User;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface RetrofitInterface {

    @POST("account/registration")
    Observable<Response> register(@Body User user);

    @POST("account/login")
    Observable<Response> login();

    @POST("account/user/get")
    Observable<User> getProfile(@Path("email") String email);

    @POST("users/{email}")
    Observable<Response> changePassword(@Path("email") String email, @Body User user);

    @POST("users/{email}/password")
    Observable<Response> resetPasswordInit(@Path("email") String email);

    @POST("users/{email}/password")
    Observable<Response> resetPasswordFinish(@Path("email") String email, @Body User user);
}
