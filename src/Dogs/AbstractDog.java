package Dogs;

public abstract class AbstractDog implements Dog {
    public String name;
    public int age;
    public BarkStrategy barkStrategy;

    public AbstractDog(String name, int age, BarkStrategy barkStrategy) {
        this.name = name;
        this.age = age;
        this.barkStrategy = barkStrategy;
    }
}
