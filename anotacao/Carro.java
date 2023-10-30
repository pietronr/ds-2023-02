public class Carro extends Observable {
    public Loja loja;
    
    public Carro(String tag, Runnable acao) {
        this.tagObservada = tag;
        this.acao = acao;
    }

    public Loja getLoja() {
        return this.loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;

        this.addObserver(loja);
    }

    @Override
    public boolean addObserver(Observer object) {
        if (super.addObserver(loja)) {
            acao.run();
            return true;
        }

        return false;
    }
}