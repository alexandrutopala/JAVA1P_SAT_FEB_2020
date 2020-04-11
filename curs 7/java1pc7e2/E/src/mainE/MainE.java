package mainE;

import serviceC.HelloService;

import java.util.ServiceLoader;

public class MainE {

    public static void main(String[] args) {
        // caut toate implementarile interfetei HelloService
        // declarate in module-info.java, folosind provides
        ServiceLoader<HelloService> services =
                ServiceLoader.load(HelloService.class);

        services.stream()
                .map(provider -> provider.get())
                .forEach(helloService -> helloService.sayHello());
    }
}
