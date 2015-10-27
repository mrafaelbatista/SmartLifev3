package br.com.mrafaelbatista.smartlifev3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import br.com.mrafaelbatista.smartlifev3.R;
import br.com.mrafaelbatista.smartlifev3.models.Treino;

public class ListaTreino extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_treino);
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

        textView = (TextView) findViewById(R.id.id_textView);
        StringBuffer result = new StringBuffer();
        result.append("Resultado busca: \n\n");

        List<Treino> treinoList = Treino.listAll(Treino.class);
        for (Treino t : treinoList) {
            result.append("Nome: " + t.getNomeTreino() + "|" + "Objetivo:" + t.getObjetivoTreino() + "\n");
        }

        textView.setText(result.toString());
    }




}
