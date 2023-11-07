package classes;

import interfaces.Markdown;

public class Item implements Markdown {
    public Item(Markdown markdown) {
        this.markdown = markdown;
    }

    public Markdown markdown;

    @Override
    public String exibe() {
        String resultado =  String.format("* %s", markdown.exibe());
        return resultado;
    }
}
