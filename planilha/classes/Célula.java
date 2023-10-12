package classes;

import observer.Observer;
import observer.Subject;

public class Célula implements Observer {
    private String conteudo;
    private Subject subject;

    public Célula(String conteudo, Subject subject) {
        this.conteudo = conteudo;
        this.subject = subject;
        subject.attach(this);
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
        subject.notifyObservers(this);
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public void update(Célula subject) {
        System.out.println("Reavaliar célula " + this.getConteudo() + " por mudança ocorrida na célula " + subject.getConteudo());
    }
}
