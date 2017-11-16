package com.greenfox.tomdreidel.chatfactory;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import com.greenfox.tomdreidel.chatfactory.interfaces.MessageAPI;
import com.greenfox.tomdreidel.chatfactory.model.Message;
import com.greenfox.tomdreidel.chatfactory.model.MessageAdapter;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {

    MessageAdapter messageAdapter;
    EditText editText;
    Message enteredMessage;
    Button sendButton;
    MessageAPI service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageAdapter = new MessageAdapter(this);
        ListView listView = findViewById(R.id.listMessages);
        listView.setAdapter(messageAdapter);
        editText = findViewById(R.id.editMessageTextbox);
        sendButton = findViewById(R.id.buttonSendMessage);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://chatfactory.herokuapp.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        service = retrofit.create(MessageAPI.class);

        service.getMessages().enqueue(new Callback<List<Message>>() {
            @Override
            public void onResponse(Call<List<Message>> call, Response<List<Message>> response) {
                messageAdapter.clear();
                messageAdapter.addAll(response.body());
            }

            @Override
            public void onFailure(Call<List<Message>> call, Throwable t) {
                t.printStackTrace();
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredMessage = new Message("Tomi", editText.getText().toString());
                service.postMessage(enteredMessage).enqueue(new Callback<Message>() {
                    @Override
                    public void onResponse(Call<Message> call, Response<Message> response) {
                        messageAdapter.add(enteredMessage);
                        editText.setText("");
                        editText.clearFocus();
                    }

                    @Override
                    public void onFailure(Call<Message> call, Throwable t) {
                        t.printStackTrace();
                    }
                });

                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        });
    }
}
