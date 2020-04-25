package adnotari;

import java.lang.annotation.*;

@Repeatable(MyAnnotation.MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MyAnnotation {

    // se comporta ca o proprietate, nu ca o metoda
    int value();

    // daca nu este precizata valorea
    // proprietatii message, atunci ea
    // va fi implicit "Hello"
    String message() default "Hello";

    double[] array() default {};
    // double[] v = {1.2, 3.5}; <=> double[] v = new double[]{1.2, 3.5};

    Class<?> prop1() default String.class;

    // intr-o adnotare pot avea proprietati care au
    // - orice tip primit
    // - String
    // - Class
    // - array-uri ale tipurilor de mai sus

    // adnotarea container care suporta mai multe adnotari
    // de tip MyAnnotation peste acelasi element de limbaj
    // Trebuie sa aiba acelasi Retention si acelasi Target
    // Proprietatea care aduna toate adnotarile de tip
    // MyAnnotation trebuie sa se numeasca "value"
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface MyAnnotations {
        MyAnnotation[] value();
    }
}
