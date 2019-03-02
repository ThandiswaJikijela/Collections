package springframework;

public class WithoutSpringImpl implements WithoutSpringInterface {
    @Override
    public String add(String a, String b) {
        return a + b;
    }
}
