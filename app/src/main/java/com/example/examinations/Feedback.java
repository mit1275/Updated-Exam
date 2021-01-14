package com.example.examinations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.examinations.Model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Feedback extends AppCompatActivity {
    EditText enterfeeds;
    Button b2;
    FirebaseDatabase database;
    DatabaseReference databaseusers;
    DatabaseReference feedbacks;
    DatabaseReference reference;
    FirebaseAuth fAuth;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        enterfeeds=(EditText)findViewById(R.id.enterfeed);
        b2=(Button) findViewById(R.id.submits);
//        String uid=FirebaseAuth.getInstance().getCurrentUser().getUid();
//        feedbacks=FirebaseDatabase.getInstance().getReference().child(uid).child("Feedback");
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String val=enterfeeds.getText().toString();
//                feedbacks.setValue(val);
//            }
//        });
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Register.class));
        finish();


    }

}
