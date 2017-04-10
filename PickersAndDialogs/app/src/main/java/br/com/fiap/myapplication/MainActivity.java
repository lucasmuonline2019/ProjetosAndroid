package br.com.fiap.myapplication;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    //TimePicker tmpHorario;

   // DatePicker dtpAniversario;

    //AutoCompleteTextView actvPaises;
    // String[]paises = new String[]{"Argentina","Brasil","Chile","Dinamarca","Escocia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tmpHorario = (TimePicker) findViewById(R.id.tmpHorario);
        //dtpAniversario = (DatePicker) findViewById(R.id.dtpAniversario);
        //actvPaises = (AutoCompleteTextView) findViewById(R.id.actvPaises);
        //ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,paises);
        //actvPaises.setAdapter(adapter);
    }
    public void salvar(View v){

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker datePicker, int i,int i1, int i2){
                Toast.makeText(MainActivity.this,i2 + "/" + i1, Toast.LENGTH_SHORT).show();
            }
        },2017,03,02);
            datePickerDialog.show();


    }
}




//        ProgressDialog progressDialog = new ProgressDialog(this);
//        ProgressDialog.setTitle("Carregando");
//        progressDialog.setMessage("Aguarde ...");
//        progressDialog.show();

//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle(R.string.titulo);
//        builder.setMessage(R.string.msg);
//        builder.setIcon(android.R.drawable.ic_dialog_alert);
//        builder.setCancelable(false);
//        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, getString(R.string.clicou_ok), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        builder.setNegativeButton(R.string.fechar, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, R.string.clicou_em_fechar, Toast.LENGTH_SHORT).show();
//            }
//        });
//        builder.show();


        // if (Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {}
           // int hour = tmpHorario.getCurrentHour();
           // int min = tmpHorario.getCurrentMinute();

//        int year = dtpAniversario.getYear();
//        int month = dtpAniversario.getMonth();
//        int day = dtpAniversario.getDayOfMonth();
//
//        //Calendar calendar = new GregorianCalendar(year,month,day);
//        //calendar.getTimeInMillis();
//
//        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//        dialog.setTitle(getString(R.string.data_escolhida));
//        dialog.setMessage(day + "/" + month + "/" + year);
//        dialog.show();
