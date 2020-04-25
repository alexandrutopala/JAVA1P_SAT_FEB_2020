import exemplu.Caine;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Exemplu1 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class caineClass = Class.forName("exemplu.Caine");

        Field[] fields = caineClass.getDeclaredFields();

        //Arrays.stream(fields).forEach(System.out::println);

        Constructor[] constructors = caineClass.getDeclaredConstructors();

        Arrays.stream(constructors).forEach(System.out::println);

        Constructor c = constructors[0];

        c.setAccessible(true);

        Caine caine = (Caine) c.newInstance();

        System.out.println(caine);

        Method[] methods = caineClass.getDeclaredMethods();

        Arrays.stream(methods).forEach(System.out::println);

        Method spuneVarsta = methods[0];

        spuneVarsta.setAccessible(true);

        spuneVarsta.invoke(caine);
    }
}
