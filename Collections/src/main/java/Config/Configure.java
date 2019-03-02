package Config;

import springframework2.WithSpringImpl;
import springframework2.WithSpringInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {
    @Bean(name="inter")
public WithSpringInterface getService(){
        return new WithSpringImpl();
    }
}

