public class Observable {
    public String tagObservada;
    public Runnable acao;

    public boolean addObserver(Observer object) {
        Class<?> observadorClass = object.getClass();

        if (observadorClass.isAnnotationPresent(ObserverAnnotation.class)) {
            ObserverAnnotation observerAnnotation = observadorClass.getAnnotation(ObserverAnnotation.class);
            String observado = observerAnnotation.observado();

            if (observado.equals(tagObservada)) {
                System.out.println("Registrando observador para: " + observado);
                object.attach(this);
                return true;
            }
        }

        return false;
    }

    public void update() {
        System.out.println(tagObservada + " foi notificado");
    }
}
