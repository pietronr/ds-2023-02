package classes;

import observer.Observer;
import observer.Subject;

public class Célula implements Observer {
    private String nome;
    private String conteudo;
    private Subject subject;
    private String aviso;
    private Boolean foiAtualizado = false;

    public Célula(String nome, String conteudo, Subject subject) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.subject = subject;
        subject.attach(this);
    }

    public void setName(String nome) {

    }

    public String getNome() {
        return nome;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
        this.setHasBeenUpdated(true);
        subject.notifyObservers(this);
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }

    public String getAviso() {
        return aviso;
    }

    @Override
    public void setHasBeenUpdated(Boolean foiAtualizado) {
        this.foiAtualizado = foiAtualizado;
    }

    @Override
    public Boolean getHasBeenUpdated() {
        return foiAtualizado;
    }

    @Override
    public void update(Célula subject) {
        if (!this.getHasBeenUpdated()) {
            String aviso = "Reavaliar célula " + this.getNome() + " por mudança ocorrida na célula "
                    + subject.getNome() + ", que agora possui valor " + subject.getConteudo();

            this.setAviso(aviso);
            System.out.println(aviso);
        }
    }
}
