import serviceC.HelloService;
import serviceD.EnglishHelloService;

module D {
    requires C;

    // expunem o implemntare a interfetei HelloService
    provides HelloService with EnglishHelloService;
}