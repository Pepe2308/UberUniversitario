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
    TextView contrasena;
    TextView matricula;
    String matriculabd="1217234";
    String contrasenabd="elpepe";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciarSesion = (Button) findViewById(R.id.btnIniciarSesion);
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contrasena = (TextView) findViewById(R.id.contrasena);
                matricula = (TextView)findViewById(R.id.matricula);
                if(contrasena.getText().toString().equals(contrasenabd)&&matricula.getText().toString().equals(matriculabd))
                {
                   // matricula=null;
                  //  contrasena=null;
                    //llevar a la ventana principal del usuario
                }
                if(matricula.getText().toString().isEmpty())
                {
                    //llamar una ventana que diga que la matricula esta vacia
                }
                if(contrasena.getText().toString().isEmpty())
                {
                    //lamar una ventana que diga que la contraseña está vacia
                }
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
