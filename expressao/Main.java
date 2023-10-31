import classes.Constante;
import classes.Multiplica;
import classes.Subtrai;

public class Main {
    public static void main(String[] args) {
        Subtrai subtrai = new Subtrai(new Multiplica(new Constante(4), new Constante(3)), new Multiplica(new Constante(2), new Constante(3)));

        System.out.println(subtrai.valor());
    }
}