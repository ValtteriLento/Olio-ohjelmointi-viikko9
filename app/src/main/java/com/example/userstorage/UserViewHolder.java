package com.example.userstorage;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView nameView, degreeProgramView, emailView;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        nameView = itemView.findViewById(R.id.textName);
        degreeProgramView = itemView.findViewById(R.id.textDegreeProgram);
        emailView = itemView.findViewById(R.id.textEmail);
    }
}
