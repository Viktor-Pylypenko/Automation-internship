package com.thirdparty.trello.services;

import com.thirdparty.trello.models.Board;
import com.thirdparty.trello.models.Lists;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface BoardService {

    @GET("boards/{id}/lists")
    Call<List<Lists>> getLists(@Path("id") String id);

    @POST("boards")
    Call<Board> createBoard(@Query("name") String name);

}
