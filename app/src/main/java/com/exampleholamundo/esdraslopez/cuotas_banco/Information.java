package com.exampleholamundo.esdraslopez.cuotas_banco;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;

public class Information extends AppCompatActivity {
String tipo="", type="";
    int year=0,prestamo=0,yearPagar=0,yeartotal=0,yearcobrar=0,meses=0;
    double montoAjuste,tasa=0, montoInteres=0,montoTotalACobrar=0,cuotaMensual=0;

    TextView uno,dos,tres,cuatro,cinco,seis,siete,ocho;

     Button button;


/*
    public void openbank(Button)throws Exception{
        String link = "http://www.ficohsa.com/";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        button=(Button)findViewById(R.id.button) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uriUrl = Uri.parse("http://www.ficohsa.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });

        prestamo= getIntent().getExtras().getInt("prestamo");
        yearPagar=getIntent().getExtras().getInt("yearPagar");
        type=getIntent().getExtras().getString("type");

        tipo= getIntent().getExtras().getString("tipo");
        year=getIntent().getExtras().getInt("year");
        Toast.makeText(Information.this,"Type of loan: " + tipo + ", Calculating in: " + year + " years", Toast.LENGTH_SHORT).show();

        uno = (TextView)findViewById(R.id.text1);
        uno.setText(String.valueOf(prestamo));

        dos=(TextView)findViewById(R.id.texto2);
        dos.setText(String.valueOf(yearPagar));

        tres=(TextView)findViewById(R.id.texto3);
        Calendar c=  Calendar.getInstance();
        int year= c.get(Calendar.YEAR);

        yearcobrar=year+yearPagar;
        tres.setText(String.valueOf(yearcobrar));

        cuatro=(TextView)findViewById(R.id.texto4);
        cuatro.setText(type);

        cinco=(TextView)findViewById(R.id.texto5);
        if(type.equals("AUTO")){
            montoAjuste=((prestamo*30)/100);
        }else if(type.equals("CASA")){
            montoAjuste=(prestamo+30000);
        }else if(type.equals("FAMILIA")){
            montoAjuste=(prestamo+0);
        }
        cinco.setText(String.valueOf(montoAjuste));


        seis=(TextView)findViewById(R.id.texto6);
        if (type.equals("AUTO")){
            tasa=0.25;
        }else if(type.equals("CASA")){
            tasa=0.1;
        }else if(type.equals("FAMILIA")){
            tasa=0.35;
        }
        montoInteres=tasa*prestamo*yearPagar;
        seis.setText(String.valueOf(montoInteres));

        siete=(TextView)findViewById(R.id.texto7);
        montoTotalACobrar=prestamo+montoAjuste+montoInteres;
        siete.setText(String.valueOf(montoTotalACobrar));

        ocho=(TextView)findViewById(R.id.texto8);
        meses=yearPagar*12;
        cuotaMensual=montoTotalACobrar/meses;
        ocho.setText(String.valueOf(cuotaMensual));



    }
}
