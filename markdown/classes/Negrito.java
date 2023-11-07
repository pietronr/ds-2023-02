package classes;

import interfaces.Markdown;

public class Negrito implements Markdown {
    public Negrito(Markdown markdown) {
        this.markdown = markdown;
    }

    public Markdown markdown;

    @Override
    public String exibe() {
        String resultado = String.format("**%s**", markdown.exibe());
        return resultado;
    }
}
