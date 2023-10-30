public class Main {
    public static void main(String[] args) {
        Loja observador = new Loja();
        
        Carro carro = new Carro("carro", () -> {
            System.out.println("Observador registrado com sucesso para o carro");
            observador.notifyObservers("carro");
        });

        carro.setLoja(observador);
    }
}
