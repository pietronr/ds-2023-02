package classes;

import interfaces.Markdown;

public class Título implements Markdown {
    public Título(Markdown markdown) {
        this.markdown = markdown;
    }

    public Markdown markdown;

    @Override
    public String exibe() {
        String resultado = String.format("# %s", markdown.exibe());
        return resultado;
    }
}
