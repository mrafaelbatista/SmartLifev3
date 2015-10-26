package br.com.mrafaelbatista.smartlifev3.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrafa on 26/10/2015.
 */
public class Treino {

    private String nomeTreino;
    private String objetivoTreino;
    private ArrayList<Atividade> listaAtividades;

    public String getNomeTreino() {
        return nomeTreino;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public String getObjetivoTreino() {
        return objetivoTreino;
    }

    public void setObjetivoTreino(String objetivoTreino) {
        this.objetivoTreino = objetivoTreino;
    }

    public ArrayList<Atividade> getListaAtividades() {
        return listaAtividades;
    }

    public void setListaAtividades(ArrayList<Atividade> listaAtividades) {
        this.listaAtividades = listaAtividades;
    }
}
