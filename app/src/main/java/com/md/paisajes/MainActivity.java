package com.md.paisajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
public ImageView img;
public int i = 0;
public TextView txt;
public ArrayList<String> myImageTextList = new ArrayList<>();//Lista de los textos de las imagenes
public ArrayList<Integer> myImageList = new ArrayList<>();//Lista de las imagenes
public boolean act=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageViewCarrusel);
        txt = (TextView) findViewById(R.id.textView);
        imageConstructor();

    }
    public void checked (View view){
        if (act){
            act=false;
        }else{act = true; }
    }
    public void imageConstructor(){
//imagenes
        myImageList.add(R.drawable.cancun);
        myImageList.add(R.drawable.rivera_maya);
        myImageList.add(R.drawable.canon_del_sumidero);
        myImageList.add(R.drawable.huasteca_potosina);
        myImageList.add(R.drawable.cascada_cola_de_caballo);
        myImageList.add(R.drawable.los_cabos);
        myImageList.add(R.drawable.cuatrocienegas);
        myImageList.add(R.drawable.selva_lacandona);
        myImageList.add(R.drawable.sierra_de_arteaga);
        myImageList.add(R.drawable.arrecife_veracruzano);
        myImageList.add(R.drawable.cascada_de_eyipantla);
        myImageList.add(R.drawable.volcanes);
        myImageList.add(R.drawable.barrancas_del_cobre);
        myImageList.add(R.drawable.ria_celestun);
        myImageList.add(R.drawable.biosfera_el_cielo);
//        textos de las imagenes
        myImageTextList.add("Cancún, Quintana Roo");
        myImageTextList.add("Riviera Maya, Quintana Roo");
        myImageTextList.add("Cañón del Sumidero, Chiapas");
        myImageTextList.add("Huasteca Potosina, San Luis Potosí");
        myImageTextList.add("Cascada Cola de Caballo, Nuevo León");
        myImageTextList.add("Los Cabos, Baja California Sur");
        myImageTextList.add("Cuatrociénegas, Coahuila");
        myImageTextList.add("Selva Lacandona, Chiapas");
        myImageTextList.add("Sierra de Arteaga, Coahuila");
        myImageTextList.add("Arrecife Veracruzano, Veracruz");
        myImageTextList.add("Cascada de Eyipantla, Veracruz");
        myImageTextList.add("Popocatépetl e Iztaccíhuatl, Estado de México, Morelos y Puebla");
        myImageTextList.add("Barrancas del Cobre, Chihuahua");
        myImageTextList.add("Ría Celestún, Yucatán");
        myImageTextList.add("Reserva de la Biosfera El Cielo, Tamaulipas");



    }
    public void changeImage(View view){
        if (i<myImageList.size()&&act){
            img.setImageResource(myImageList.get(i));
            txt.setText(myImageTextList.get(i).toString());
            i++;
        }
        if (i>=15){
             i=0;
        }
    }
}