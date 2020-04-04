package observer;

public class Exemplu6 {

    public static void main(String[] args) {
        Chat chat = new Chat();

        User gigel = new User("gigel");
        User costel = new User("costel");
        User maria = new User("maria");

        chat.addListener(gigel);
        chat.addListener(costel);
        chat.addListener(maria);

        chat.notifyListeners("hello de la gigel");
    }
}
