package br.com.mrafaelbatista.smartlifev3.models;

import com.orm.SugarRecord;

import java.util.ArrayList;


/**
 * Created by mrafa on 26/10/2015.
 */
public class Treino extends SugarRecord<Treino> {

    private String nomeTreino;
    private String objetivoTreino;
    private String atividades;
//    private ArrayList<Atividade> listaAtividades;

    public Treino() {
    }

    public Treino(String nomeTreino, String objetivoTreino, String atividades) {
        this.nomeTreino = nomeTreino;
        this.objetivoTreino = objetivoTreino;
        this.atividades = atividades;
    }

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

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

//    public ArrayList<Atividade> getListaAtividades() {
//        return listaAtividades;
//    }
//
//    public void setListaAtividades(ArrayList<Atividade> listaAtividades) {
//        this.listaAtividades = listaAtividades;
//    }
}
