package Dogs;

public class Wuff implements BarkStrategy {
    @Override
    public void bark() {
        System.out.println("Wuff");
    }
}
