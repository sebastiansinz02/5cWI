package Dogs;

public class Boxer extends AbstractDog {


    public Boxer(String name, int age, BarkStrategy barkStrategy) {
        super(name, age, barkStrategy);
    }



    @Override
    public void run() {
        System.out.println("hello i am a Boxer" + this.name );
        this.barkStrategy.bark();

    }
}
