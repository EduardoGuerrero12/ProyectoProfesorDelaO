package mx.edu.isc.tesoem.eduarx.proyectodelao;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);



    }

    public  void datos(View v){
        Intent intento1=new Intent(this, Actividad2.class);
        startActivityForResult(intento1,100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==100)
        {
          if (resultCode==Activity.RESULT_OK){
              Bundle datos=data.getExtras();
              tv1.setText(datos.getString("nombre"));
          }
          if (resultCode==Activity.RESULT_OK){
              Bundle datos=data.getExtras();
              tv2.setText(datos.getString("edad"));
          }
          if (resultCode==Activity.RESULT_OK){
              Bundle datos=data.getExtras();
              tv3.setText(datos.getString("correo"));
          }
          if(resultCode==Activity.RESULT_CANCELED){
              Toast.makeText(this,"Se cancelo por que me equivoque XD",Toast.LENGTH_SHORT).show();
          }
        }

    }


}