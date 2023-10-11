import classes.*;

public class Main {
    public static void main(String[] args) {

        Endereço endereco = new Endereço.Builder("Rua 1", "Setor A", "12345-678", "10")
                .cidade("Cidade X")
                .estado("Estado Y")
                .bloco("Bloco Z")
                .quadra("Quadra W")
                .build();

        System.out.println(endereco.toString());
    }
}