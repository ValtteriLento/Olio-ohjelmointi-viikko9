package com.example.userstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    private EditText editFirstName;
    private EditText editLastName;
    private EditText editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editEmail = findViewById(R.id.editEmail);
    }

    public void addUser(View view) {

        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();
        String email = editEmail.getText().toString();
        RadioGroup rgDegreeProgram = findViewById(R.id.rgDegreeProgram);

        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.rbComputer:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Tietotekniikka"));
                break;
            case R.id.rbProduction:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Tuotantotalous"));
                break;
            case R.id.rbCalculation:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Laskennallinen tekniikka"));
                break;
            case R.id.rbElectric:
                UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Sähkötekniikka"));
                break;
        }

    }
}