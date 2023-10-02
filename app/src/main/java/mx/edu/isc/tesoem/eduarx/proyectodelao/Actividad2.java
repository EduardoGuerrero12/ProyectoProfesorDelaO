package mx.edu.isc.tesoem.eduarx.proyectodelao;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Actividad2 extends AppCompatActivity {
    EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
    }
    public void confirmar(View v)
    {
        Intent intento1=new Intent();
        intento1.putExtra("nombre",et1.getText().toString());
        intento1.putExtra("edad",et2.getText().toString());
        intento1.putExtra("correo",et3.getText().toString());
        setResult(Activity.RESULT_OK,intento1);
        finish();
    }
    public void cancelar(View v)
    {
        Intent intento1=new Intent();
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}