package classes;

import java.util.List;

import observer.Subject;

public class Planilha extends Subject {
    private String nome;
    private List<Célula> celulas;

    public Planilha() { }

    public Planilha(String nome, List<Célula> celulas) {
        this.nome = nome;
        this.celulas = celulas;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Célula> getCelulas() {
        return celulas;
    }

    public void setCelulas(List<Célula> celulas) {
        this.celulas = celulas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planilha: ").append(nome).append("\n");
        for (Célula celula : celulas) {
            sb.append("Célula ").append(celula.getConteudo()).append(": ").append(celula.getConteudo()).append("\n");
        }
        return sb.toString();
    }
}