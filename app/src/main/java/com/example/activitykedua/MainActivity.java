package com.example.activitykedua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel Edit Text
    EditText edName, edPassword;

    //Deklarasi variabel Button
    Button okButton;

    // //Deklarasi variabel menyimpan username dan password
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel login dengan componen button pada layout
        okButton = findViewById(R.id.btSignIn);

        //Menghubungkan variabel edname dengan componen button pada layout
        edName = findViewById(R.id.edName);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edPassword = findViewById(R.id.edPassword);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = edName.getText().toString();
                password = edPassword.getText().toString();

                if (username.equals("") || password.equals("")) {
                    Toast.makeText(MainActivity.this, "Username atau Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    if (username.equals("erda") && password.equals("rdwyns")) {
                        Toast.makeText(MainActivity.this, "Sukses", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Username atau Password salah !", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    };
}
