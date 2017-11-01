package m23.alvarez.uberuniversitario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btnIniciarSesion;
    Button btnCrearCuenta;
    TextView lblOlvideContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciarSesion = (Button) findViewById(R.id.btnIniciarSesion);
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnCrearCuenta = (Button) findViewById(R.id.btnCrearCuenta);
        btnCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crearCuenta = new Intent(MainActivity.this,CrearCuenta.class);
                startActivity(crearCuenta);
            }
        });

        lblOlvideContrasena = (TextView) findViewById(R.id.lblOlvideContrasena);
        lblOlvideContrasena.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent OlvideContrasena = new Intent(MainActivity.this,OlvideContrasena.class);
                startActivity(OlvideContrasena);
            }
        });

    }
}
