package app.retrofit.nipunu.retrofitapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Nipunu on 14,August,2019
 */
public class ServiceGenerator {
    static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create());
    static Retrofit retrofit = builder.build();

//    public static GitHubClient createService(){
//        return retrofit.create(GitHubClient.class);
//    }

    public static <serviceType> serviceType createService(Class<serviceType> serviceClass){
        return retrofit.create(serviceClass);
    }

}
