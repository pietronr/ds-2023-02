package classes;

import interfaces.Markdown;

public class Itálico implements Markdown {
    public Itálico(Markdown markdown) {
        this.markdown = markdown;
    }

    public Markdown markdown;

    @Override
    public String exibe() {
        String resultado = String.format("_%s_", markdown.exibe());
        return resultado;
    }
}
