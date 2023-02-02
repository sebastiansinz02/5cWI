package Dogs;

public class DogMain {
    public static void main(String[] args) {
        BarkStrategy b1= new Wuff();
        BarkStrategy b2= new WuffWuff();
        Dog d1 = new Boxer("hans",1, b1);

        d1.run();
    }
}
