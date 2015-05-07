package com.andani.animesh.dialogcustom3;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   public  void show(View view)
   {
       Dialog2 dialog2=new Dialog2();
       dialog2.show(getFragmentManager(),"dialog2");
   }
    public  void show2(View v)
    {
        Dialog2 dialog2=new Dialog2();
        FragmentTransaction transaction=getFragmentManager().beginTransaction();
        transaction.add(R.id.main,dialog2,"aa");
        transaction.commit();
    }
}
