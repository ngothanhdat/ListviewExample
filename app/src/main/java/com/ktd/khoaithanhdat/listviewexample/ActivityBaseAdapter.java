package com.ktd.khoaithanhdat.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import adapter.AdapterStudent;
import model.StudentModel;

/**
 * Created by Khoai thanh dat on 18-Nov-17.
 */

public class ActivityBaseAdapter extends Activity {
    private ListView lvStudent;
    private Button btnXoa;
    private AdapterStudent adapterStudent;
    private ArrayList<StudentModel> studentModels=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_base_adapter);
        intUI();
        setData();
    }

    private void intUI() {
        lvStudent=(ListView)findViewById(R.id.lvStudent);
        btnXoa=(Button)findViewById(R.id.btnXoa);
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentModels.remove(0);
                adapterStudent.notifyDataSetChanged();
            }
        });
    }
    public void setData(){
        for(int i=0;i<20;i++){
            StudentModel studentModel=new StudentModel(""+i,"nguyen Van A","Ha Noi");
            studentModels.add(studentModel);
        }
        adapterStudent=new AdapterStudent(getApplicationContext(),studentModels);
        lvStudent.setAdapter(adapterStudent);

    }

}
