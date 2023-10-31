package classes;
import interfaces.Expressao;

public class Constante implements Expressao {
    public Constante(float x) {
        this.valor = x;
    }

    public float valor;

    @Override
    public float valor() {
        return valor;
    }
}