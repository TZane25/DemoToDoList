package sg.edu.rp.c346.id20011280.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    ArrayList<ToDoItem> alTodo;

    ArrayAdapter<ToDoItem> aaTodo;

    CustomAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        alTodo = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2020,8,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);

        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);
        alTodo.add(item1);
        alTodo.add(item2);

        Adapter = new CustomAdapter(this,R.layout.row,alTodo);
        lv.setAdapter(Adapter);




    }
}