package com.example.bbemsi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TypeActivity extends AppCompatActivity {

    CardView teacher,student,parent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_type);

        teacher = findViewById(R.id.teacher);
        student = findViewById(R.id.student);
        parent = findViewById(R.id.parent);

        teacher.setOnClickListener(v -> {
            Intent intent = new Intent(TypeActivity.this, ProfessorActivity.class);
            startActivity(intent);
        });

        student.setOnClickListener(v -> {
            Intent intent = new Intent(TypeActivity.this, ProfessorActivity.class);
            startActivity(intent);
        });

        parent.setOnClickListener(v -> {
            Intent intent = new Intent(TypeActivity.this, ParentActivity.class);
            startActivity(intent);
        });


    }
}