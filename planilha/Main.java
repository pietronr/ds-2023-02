import java.util.ArrayList;
import java.util.List;

import classes.Célula;
import classes.Planilha;

public class Main {
    public static void main(String[] args) {
        Planilha planilha = new Planilha();

        List<Célula> células = new ArrayList<>();

        Célula celulaA = new Célula("A", "Valor 1", planilha);
        Célula celulaB = new Célula("B", "Valor 2", planilha);
        Célula celulaC = new Célula("C", "Valor 3", planilha);

        células.add(celulaA);
        células.add(celulaB);
        células.add(celulaC);

        planilha.setNome("Teste");
        planilha.setCelulas(células);

        System.out.println(planilha.toString());

        celulaA.setConteudo("Novo valor para A");
    }
}
