package com.yad.tapan;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.yad.tapan.Ni_Use.BranchAdapter;
import com.yad.tapan.Ni_Use.Myclass;
import com.yad.tapan.aktu_sample.R;

import java.util.ArrayList;

public class Branch extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);


        ArrayList<Myclass> words = new ArrayList<Myclass>();
        words.add(new Myclass("Computer Science and Engineering",""));
        words.add(new Myclass("Information and Technology",""));
        words.add(new Myclass("Mechanical Engineering",""));
        words.add(new Myclass("Civil Engineering",""));
        words.add(new Myclass("Electrical Engineering",""));



        BranchAdapter<Myclass> branchAdapter = new BranchAdapter<Myclass>(this,R.layout.content,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(branchAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(Branch.this,cs_sem3s.class);
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(Branch.this,it2.class);
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(Branch.this,me2.class);
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(Branch.this,cv2.class);
                    startActivity(intent);
                }
                else if (i==4){
                    Intent intent = new Intent(Branch.this,el2.class);
                    startActivity(intent);
                }
            }
        });
   }
}