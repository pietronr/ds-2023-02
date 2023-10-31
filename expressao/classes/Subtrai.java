package classes;

import interfaces.Expressao;

public class Subtrai implements Expressao {
    public Subtrai (Expressao min, Expressao sub) {
        this.minuendo = min;
        this.subtraendo = sub;
    }

    public Expressao minuendo;
    public Expressao subtraendo;

    @Override
    public float valor() {
        return minuendo.valor() - subtraendo.valor();
    }
}
