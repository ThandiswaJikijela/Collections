package testspringframework2;

import Config.Configure;
import springframework2.WithSpringInterface;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWithSpring {
    private WithSpringInterface inter;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Configure.class);
        inter = (WithSpringInterface) ctx.getBean("inter");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testInterf() throws Exception
    {
        String c = inter.add("Thandiswa","Jikijela");
        Assert.assertEquals("","ThandiswaJikijela",c);
    }


}
