package classes;

import interfaces.Markdown;

public class Concatena implements Markdown {
    public Concatena(Markdown markdown1, Markdown markdown2) {
        this.markdown1 = markdown1;
        this.markdown2 = markdown2;
    }

    public Markdown markdown1;
    public Markdown markdown2;

    @Override
    public String exibe() {
        String resultado =  markdown1.exibe() + " " + markdown2.exibe();
        return resultado;
    }
}
