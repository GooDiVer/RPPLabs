package e.mi.work3_v2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import e.mi.work3_v2.database.StudentsDbHelper;

public class DatabaseInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_student);

        MyAdapter adapter = new MyAdapter(StudentsDbHelper.getInstance(this).getAllStudent(),this);

        RecyclerView rv = findViewById(R.id.recyclerViewStudent);

        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(adapter);
    }
}
