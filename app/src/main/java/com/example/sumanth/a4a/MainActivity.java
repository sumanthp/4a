package com.example.sumanth.a4a;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlertDialog alertDialog;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.prompt_dialog,null);
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setMessage("HOSTEL DETAILS").setView(view)
                .setPositiveButton("DISPLAY", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                EditText id = (EditText)view.findViewById(R.id.student_id);
                String value = id.getText().toString().trim();
                if(value.equals("1BM14IS063")){
                    Toast.makeText(MainActivity.this,"Sumanth\nBMSCE",Toast.LENGTH_LONG).show();
                }
                else if(value.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Id entered is empty",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "ID does not MATCH", Toast.LENGTH_SHORT).show();
                }
            }
        })
                .setNegativeButton("HELP", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Contact Hostel warden: 999999999",Toast.LENGTH_SHORT).show();
                    }
                }).setCancelable(false);
        alertDialog = dialog.create();
        alertDialog.show();

    }
}
