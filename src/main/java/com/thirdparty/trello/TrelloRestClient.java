package com.thirdparty.trello;

import com.thirdparty.trello.interceptors.TrelloAuthInterceptor;
import com.thirdparty.trello.services.BoardService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.time.Duration;

public class TrelloRestClient {

    public static final String HOME_IO_BASE_URL = "https://api.trello.com/1/";

    public BoardService boardService;

    public TrelloRestClient() {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(Duration.ofSeconds(30))
                .writeTimeout(Duration.ofSeconds(30))
                .readTimeout(Duration.ofSeconds(30))
                .addInterceptor(new TrelloAuthInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(HOME_IO_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        boardService = retrofit.create(BoardService.class);
    }

}
