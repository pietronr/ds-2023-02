import classes.*;

public class Main {
    public static void main(String[] args) {
        Texto t1 = new Texto("Título");

        Título titulo = new Título(t1);

        Texto t2 = new Texto("Uma simples linha com");
        Texto t3 = new Texto("negrito");
        Texto t4 = new Texto("e");
        Texto t5 = new Texto("itálico");

        Negrito negrito = new Negrito(t3);
        Itálico italico = new Itálico(t5);

        Concatena linha = new Concatena(new Concatena(t2, negrito), new Concatena(t4, italico));

        Texto t6 = new Texto("Primeiro item da linha com");

        Item item = new Item(new Concatena(t6, italico));

        System.out.println(titulo.exibe());
        System.out.println(linha.exibe());
        System.out.println(item.exibe());
    }
}