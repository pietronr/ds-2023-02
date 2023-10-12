import classes.Célula;
import classes.Planilha;

public class Main {
    public static void main(String[] args) {
        Planilha planilha = new Planilha();

        Célula celulaA = new Célula("A", planilha);
        Célula celulaB = new Célula("B", planilha);
        Célula celulaC = new Célula("C", planilha);

        celulaA.setConteudo("Novo valor para A");
    }
}
