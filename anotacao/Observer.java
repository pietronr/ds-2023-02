import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Observer {
    private List<Observable> observados = new ArrayList<>();

    public void attach(Observable observer) {
        observados.add(observer);
    }

    public void detach(Observable observer) {
        observados.remove(observer);
    }

    public void notifyObservers(String filter) {
        List<Observable> list = observados
                                .stream()
                                .filter(x -> x.tagObservada.equals(filter))
                                .collect(Collectors.toList());

        if (list.isEmpty()) {
            System.out.println("Não tem nenhum observador do tipo " + filter);
            return;
        }

        for (Observable item : list) {
            item.update();
        }
    }
}
