package com.example.kimberly.MidtermExam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kimberlycanedo.MidtermExam.R;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        checkWifi();
    }


    //
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if(item.getItemId()==R.id.clear){
//            Log.d("OnItemSelected", "inside");
////            fragment.clear();
//
////            recyclerView.setVisibility(View.GONE);
////            clear();
//        }
//        return onOptionsItemSelected(item);
//    }
}
