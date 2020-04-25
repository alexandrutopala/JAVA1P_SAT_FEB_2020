import exemplu.Pret;
import exemplu.Produs;
import sun.misc.Unsafe;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Exemplu2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Produs> produsClass = Produs.class;

        Field pretField = produsClass.getDeclaredField("pret");

        Annotation[] annotations = pretField.getDeclaredAnnotations();

        Arrays.stream(annotations).forEach(System.out::println);

        pretField.setAccessible(true);

        Pret pretAnnotation = pretField.getAnnotation(Pret.class);

        Produs p = new Produs();

        pretField.setInt(p, pretAnnotation.value());

        p.printPret();
    }
}
