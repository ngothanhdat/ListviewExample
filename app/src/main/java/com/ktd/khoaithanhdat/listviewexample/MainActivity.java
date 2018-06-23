package com.ktd.khoaithanhdat.listviewexample;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
private ListView lvListStudent;
private String[] student={"Nguyen Van A","Nguyen Van B","Nguyen Van C","Nguyen Van D","Nguyen Van E","Nguyen Van F","Nguyen Van G"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intUI();
        setDataList();
    }

    private void intUI() {
        lvListStudent= (ListView) findViewById(R.id.lvListStudent);
    }
    public  void setDataList(){
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,student);
        lvListStudent.setAdapter(arrayAdapter);
    }
}
