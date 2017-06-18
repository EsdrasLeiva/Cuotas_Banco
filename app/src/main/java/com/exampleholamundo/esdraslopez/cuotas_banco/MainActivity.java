package com.exampleholamundo.esdraslopez.cuotas_banco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton buttoncar,buttonfamily,buttonhouse;
    EditText editMonto, editTiempo;
    String tipo="",type="";
    int monto=0,tiempo=0, year=0,prestamo=0,yearPagar=0,yeartotal=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTiempo=(EditText)findViewById(R.id.editCantidadYear);
        editMonto=(EditText)findViewById(R.id.editMonto);

        buttoncar = (ImageButton) findViewById(R.id.ibcars);
        buttoncar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   try {
                           monto = Integer.parseInt(editMonto.getText().toString());
                           tiempo = Integer.parseInt(editTiempo.getText().toString());
                            tipo="AUTO";
                            year=tiempo;
                            prestamo=monto;
                            yearPagar=tiempo;
                            type=tipo;
                            yeartotal=tiempo;
                           if( monto> 5000  && tiempo> 0) {
                               Intent intent = new Intent(MainActivity.this, Information.class);
                               intent.putExtra("tipo",tipo);
                               intent.putExtra("year",year);
                               intent.putExtra("prestamo",prestamo);
                               intent.putExtra("yearPagar",yearPagar);
                               intent.putExtra("type",tipo);
                               intent.putExtra("yeartotal",tiempo);
                               startActivity(intent);
                               editMonto.setText("");
                               editTiempo.setText("");
                           }else{
                               Toast.makeText(MainActivity.this,"No cumple con el requerimiento", Toast.LENGTH_SHORT).show();
                           }
                   }catch (Exception e){
                       Toast.makeText(MainActivity.this,"Llene todos los campos", Toast.LENGTH_SHORT).show();
                   }
                }
            });


        buttonfamily = (ImageButton) findViewById(R.id.ibfamily);
        buttonfamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    monto = Integer.parseInt(editMonto.getText().toString());
                    tiempo = Integer.parseInt(editTiempo.getText().toString());
                    tipo="FAMILIA";
                    year=tiempo;
                    prestamo=monto;
                    yearPagar=tiempo;
                    type=tipo;
                    yeartotal=tiempo;
                    if( monto> 5000  && tiempo> 0) {
                        Intent intent = new Intent(MainActivity.this, Information.class);
                        intent.putExtra("tipo",tipo);
                        intent.putExtra("year",year);
                        intent.putExtra("prestamo",prestamo);
                        intent.putExtra("yearPagar",yearPagar);
                        intent.putExtra("type",tipo);
                        intent.putExtra("yeartotal",tiempo);
                        startActivity(intent);
                        editMonto.setText("");
                        editTiempo.setText("");
                    }else{
                        Toast.makeText(MainActivity.this,"No cumple con el requerimiento", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Llene todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });


        buttonhouse = (ImageButton) findViewById(R.id.ibhouse);
        buttonhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    monto = Integer.parseInt(editMonto.getText().toString());
                    tiempo = Integer.parseInt(editTiempo.getText().toString());
                    tipo="CASA";
                    year=tiempo;
                    prestamo=monto;
                    yearPagar=tiempo;
                    type=tipo;
                    yeartotal=tiempo;
                    if( monto> 5000  && tiempo> 0) {
                        Intent intent = new Intent(MainActivity.this, Information.class);
                        intent.putExtra("tipo",tipo);
                        intent.putExtra("year",year);
                        intent.putExtra("prestamo",prestamo);
                        intent.putExtra("yearPagar",yearPagar);
                        intent.putExtra("type",tipo);
                        intent.putExtra("yeartotal",tiempo);
                        startActivity(intent);
                        editMonto.setText("");
                        editTiempo.setText("");
                    }else{
                        Toast.makeText(MainActivity.this,"No cumple con el requerimiento", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Llene todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
