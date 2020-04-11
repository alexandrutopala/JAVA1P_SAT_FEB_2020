package serviceD;

import serviceC.HelloService;

public class EnglishHelloService implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
