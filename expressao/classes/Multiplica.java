package classes;

import interfaces.Expressao;

public class Multiplica implements Expressao {
    public Multiplica (Expressao f1, Expressao f2) {
        this.fator1 = f1;
        this.fator2 = f2;
    }

    public Expressao fator1;
    public Expressao fator2;

    @Override
    public float valor() {
        return fator1.valor() * fator2.valor();
    }
}
