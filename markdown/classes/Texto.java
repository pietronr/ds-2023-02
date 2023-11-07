package classes;

import interfaces.Markdown;

public class Texto implements Markdown {
    public Texto(String x) {
        this.texto = x;
    }

    public String texto;

    public String exibe() {
        return texto;
    }
}
