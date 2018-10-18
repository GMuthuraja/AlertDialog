package app.example.app.alertdialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showDialog(View v){
//                new AlertDialog.Builder(this)
//                .setTitle("Alert Dialog")
//                .setIcon(R.mipmap.ic_launcher)
//                .setCancelable(false)
//                .setMessage("Do you want to close this dialog?")
//                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                }).setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
//                      @Override
//                      public void onClick(DialogInterface dialog, int which) {
//
//                      }
//                  }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                  }).show();


                AlertDialog alert = new AlertDialog.Builder(this).create();
                alert.setTitle("Alert Dialog");
                alert.setIcon(R.mipmap.ic_launcher);
                alert.setCancelable(false);
                alert.setMessage("Do you want to close this dialog?");

                alert.setButton(Dialog.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
                });

                alert.setButton(Dialog.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                alert.setButton(Dialog.BUTTON_NEUTRAL, "CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                alert.show();
    }


}
