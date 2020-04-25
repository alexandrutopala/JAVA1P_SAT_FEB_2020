import adnotari.MyAnnotation;

public class Main {

    // suprascriu valorea default a proprietatii "message"
    // daca am un array cu un singur element, pot sa nu mai folosesc acoladele
    @MyAnnotation(value = 4, message = "Buna", array = {3.14, 2.56})
    private int x;

    // pot subintelege numele proprietatii daca
    // singura care o cere o valoare si se numeste
    // exact "value"
    @MyAnnotation(3) // subintelege value = 3
    @MyAnnotation(5)
    private int y;

    @MyAnnotation.MyAnnotations({
            @MyAnnotation(3),
            @MyAnnotation(5)
    })
    private int z;

//    @MediaType("mp3")
//    @MediaType("mp4")
//    private File file;

    public static void main(String[] args) {

    }
}
