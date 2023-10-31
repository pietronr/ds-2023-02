package classes;

import interfaces.Expressao;

public class Divide implements Expressao {
    public Divide (Expressao dividendo, Expressao divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public Expressao dividendo;
    public Expressao divisor;

    @Override
    public float valor() {
        return dividendo.valor() / divisor.valor();
    }
}
