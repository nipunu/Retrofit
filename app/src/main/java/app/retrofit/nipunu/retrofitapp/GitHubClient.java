package app.retrofit.nipunu.retrofitapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Nipunu on 12,August,2019
 */
public interface GitHubClient {
    @GET("users/{user}/repos")
   Call<List<GitHubRepo>> reposForUser(@Path("user") String user);
}
