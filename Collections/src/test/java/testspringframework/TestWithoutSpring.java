package testspringframework;

import springframework.WithoutSpring;
import springframework.WithoutSpringImpl;
import springframework.WithoutSpringInterface;
import org.junit.Assert;
import org.junit.Test;

/*

*/
public class TestWithoutSpring {

    @Test
    public void strings()
    {
        WithoutSpring spring = new WithoutSpring();
        String c = (String) spring.add("Name","Surname");
        Assert.assertEquals("","NameSurname",c);
    }

    @Test
    public void interf()
    {
        WithoutSpringInterface inter = new WithoutSpringImpl();
        String c = inter.add("Java","Interface");
        Assert.assertEquals("","JavaInterface",c);
    }

}
