package classes;

import interfaces.Expressao;

public class Soma implements Expressao {
    public Soma (Expressao p1, Expressao p2) {
        this.parcela1 = p1;
        this.parcela2 = p2;
    }

    public Expressao parcela1;
    public Expressao parcela2;

    @Override
    public float valor() {
        return parcela1.valor() + parcela2.valor();
    }
}
