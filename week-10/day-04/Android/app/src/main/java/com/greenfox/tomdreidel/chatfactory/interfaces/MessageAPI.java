package com.greenfox.tomdreidel.chatfactory.interfaces;

import java.util.List;
import com.greenfox.tomdreidel.chatfactory.model.Message;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by tomdreidel on 2017. 11. 16..
 */

public interface MessageAPI {

    @GET("/api/message/current")
    Call<List<Message>> getMessages();

    @POST("/api/message/send")
    Call<Message> postMessage(@Body Message message);
}
