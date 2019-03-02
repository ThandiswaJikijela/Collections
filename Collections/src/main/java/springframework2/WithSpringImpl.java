package springframework2;

public class WithSpringImpl implements WithSpringInterface {
    @Override
    public String add(String a, String b) {
        return a + b;
    }
}
