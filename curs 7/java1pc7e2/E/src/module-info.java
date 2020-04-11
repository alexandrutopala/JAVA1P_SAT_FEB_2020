import serviceC.HelloService;

module E {

    requires C;

    // modulul E cauta implemntari ale interfetei HelloService
    uses HelloService;
}