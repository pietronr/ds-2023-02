import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Para que a anotação seja retida em tempo de execução
@Target(ElementType.TYPE) 
public @interface ObserverAnnotation {
    String observado();
}
