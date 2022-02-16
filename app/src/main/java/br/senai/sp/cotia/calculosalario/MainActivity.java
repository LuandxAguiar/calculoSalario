package br.senai.sp.cotia.calculosalario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edSalario, edDependentes;
    private RadioButton rbPlanSim, rbPlanNao, rbStan, rbBasi,rbSuper,rbMaster, rbVtSim, rbVtNao,rbVaSim, rbVaNao,rbVrSim, rbVrNao;
    private Button btCalcular, btLimpar;
    private String Plano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referenciar os componentes
        edSalario = findViewById(R.id.salario);
        edDependentes = findViewById(R.id.numDependentes);
        rbPlanSim = findViewById(R.id.planoSim);
        rbPlanNao = findViewById(R.id.planoNao);
        rbStan = findViewById(R.id.standard);
        rbBasi = findViewById(R.id.pBasico);
        rbSuper = findViewById(R.id.pSuper);
        rbMaster = findViewById(R.id.pMaster);
        rbVtSim = findViewById(R.id.vtSim);
        rbVtNao = findViewById(R.id.vtNao);
        rbVaSim = findViewById(R.id.vaSim);
        rbVaNao = findViewById(R.id.vaNao);
        rbVrSim = findViewById(R.id.vrSim);
        rbVrNao = findViewById(R.id.vrNao);
        btCalcular = findViewById(R.id.bt_calcular);
        btLimpar = findViewById(R.id.bt_limpar);

        do{
            btCalcular.setOnClickListener(v -> {
               if(rbPlanSim.isActivated()) {
                   switch (edSalario < 3000) {
                       case rbStan.isActivated():
                           return Plano = "60";

                       case rbBasi.isActivated():
                           return Plano = "80";
                   }


               }
            }
        }while(200 <= edSalario);

    }

}

