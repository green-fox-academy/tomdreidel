package com.greenfox.tomdreidel.chatfactory.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.greenfox.tomdreidel.chatfactory.R;

/**
 * Created by tomdreidel on 2017. 11. 16..
 */

public class MessageAdapter extends ArrayAdapter<com.greenfox.tomdreidel.chatfactory.model.Message> {
    public MessageAdapter(@NonNull Context context) {
        super(context, 0);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Message current = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.message, parent, false);
        }
            TextView username = convertView.findViewById(R.id.username);
            TextView text = convertView.findViewById(R.id.text);
            if (current != null) {
                username.setText(current.getUsername());
                text.setText(current.getText());
            }

        return convertView;
    }
}
