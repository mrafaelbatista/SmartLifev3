package br.com.mrafaelbatista.smartlifev3.models;


/**
 * Created by mrafa on 26/10/2015.
 */
public class Atividade {

    private String nomeAtividade;
    private int repeticoesAtividade;

    public Atividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public int getRepeticoesAtividade() {
        return repeticoesAtividade;
    }

    public void setRepeticoesAtividade(int repeticoesAtividade) {
        this.repeticoesAtividade = repeticoesAtividade;
    }

}
