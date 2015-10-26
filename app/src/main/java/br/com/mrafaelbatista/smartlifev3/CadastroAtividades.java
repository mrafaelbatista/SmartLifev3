package br.com.mrafaelbatista.smartlifev3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import br.com.mrafaelbatista.smartlifev3.Controllers.ControllerCadastroTreino;
import br.com.mrafaelbatista.smartlifev3.models.Atividade;

public class CadastroAtividades extends AppCompatActivity {

    private List<CheckBox> listCheckbox = new ArrayList<>();
    private ArrayList<Atividade> aList = new ArrayList<>();
    private Atividade atividade;
    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;
    private CheckBox cb4;
    private CheckBox cb5;
    private CheckBox cb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_atividades);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        //Seboso, mas funfou!!!
        cb1 = (CheckBox) findViewById(R.id.cb_abdFrontal);
        listCheckbox.add(cb1);
        cb2 = (CheckBox) findViewById(R.id.cb_abdBike);
        listCheckbox.add(cb2);
        cb3 = (CheckBox) findViewById(R.id.cb_abdInversao);
        listCheckbox.add(cb3);
        cb4 = (CheckBox) findViewById(R.id.cb_bcpRoscaConcent);
        listCheckbox.add(cb4);
        cb5 = (CheckBox) findViewById(R.id.cb_bcpRoscaDireta);
        listCheckbox.add(cb5);
        cb6 = (CheckBox) findViewById(R.id.cb_bcpRoscaAlternada);
        listCheckbox.add(cb6);
    }

    public void listarAtividades(View v) {

        for (CheckBox c : listCheckbox) {
            if (c.isChecked()) {
                atividade = new Atividade(c.getText().toString());
                Toast.makeText(this, c.getText().toString(), Toast.LENGTH_LONG).show();
                aList.add(atividade);
            }
        }

        ControllerCadastroTreino.getInstance().setListaAtividades(aList);
        Intent i = new Intent(CadastroAtividades.this, CadastroTreino.class);
        startActivity(i);
    }


}
