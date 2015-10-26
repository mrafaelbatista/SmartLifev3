package br.com.mrafaelbatista.smartlifev3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.mrafaelbatista.smartlifev3.Controllers.ControllerCadastroTreino;
import br.com.mrafaelbatista.smartlifev3.models.Atividade;

public class CadastroTreino extends AppCompatActivity {

    private EditText nomeTreino;
    private EditText objTreino;
    private ArrayList<Atividade> atividades;
    private TextView listaAtividadesTreino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_treino);
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


        nomeTreino = (EditText) findViewById(R.id.nomeTreino);
        objTreino = (EditText) findViewById(R.id.objTreino);

        atividades = new ArrayList<>();

        listaAtividadesTreino = (TextView) findViewById(R.id.listaAtividadesTreino);

    }

    protected void onResume() {
        super.onResume();

        String nTreino = ControllerCadastroTreino.getInstance().getNomeTreino();
        String oTreino = ControllerCadastroTreino.getInstance().getObjTreino();
        atividades = (ArrayList<Atividade>) ControllerCadastroTreino.getInstance().getListaAtividades();
        String atividadeParaLista = null;

        if (nTreino != null || oTreino != null) {
            nomeTreino.setText(nTreino);
            objTreino.setText(oTreino);
        }

        if (atividades != null) {
            for (Atividade a : atividades) {
                if(atividadeParaLista == null) {
                    atividadeParaLista = "- " + a.getNomeAtividade() + "\n";
                } else {
                    atividadeParaLista = atividadeParaLista + "- " + a.getNomeAtividade() + "\n";
                }
            }

            //Apresentar dados da lista na tela do treino.
            listaAtividadesTreino.setText(atividadeParaLista);

        }
    }

    public void adicionarAtividade(View v) {

        //Receber a instância desta classe e armazenar para enviar por Intent
        ControllerCadastroTreino.getInstance().setNomeTreino(nomeTreino.getText().toString());
        ControllerCadastroTreino.getInstance().setObjTreino(objTreino.getText().toString());
        ControllerCadastroTreino.getInstance().setListaAtividades(atividades);
        //Envia instância da classe por Intent
        Intent i = new Intent(CadastroTreino.this, CadastroAtividades.class);
        startActivity(i);
    }

}
