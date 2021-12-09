package junk;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;
import java.time.Duration;

public class TrelloApi {
    public static final String KEY = "1a039ff9acff8e4ffb5c72f0687d605e";
    public static final String TOKEN = "df76a6bad84685e5d1cdf1d10d0de27b7bff9f42b7cd7559ad2580728549818b";

    OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(Duration.ofSeconds(30))
            .writeTimeout(Duration.ofSeconds(30))
            .build();

    public void getBoardLists(String boardId) throws IOException {

        Request request = new Request.Builder()
                .url("https://api.trello.com/1/boards/" + boardId + "/lists?key=" + KEY + "&token=" + TOKEN)
                .build();

        String response = client.newCall(request).execute().body().string();

        System.out.println(response);

    }

    public void createCard(String listId) throws IOException {
        RequestBody body = RequestBody.create("{\"name\":\"MYCARD\"}", MediaType.parse("application/json; charset=utf-8"));
        Request request = new Request.Builder()
                .url("https://api.trello.com/1/cards?idList="+ listId + "&keepFromSource=all&key=" + KEY + "&token=" + TOKEN)
                .post(body)
                .build();
        String response = client.newCall(request).execute().body().string();
        System.out.println(response);
    }
}
