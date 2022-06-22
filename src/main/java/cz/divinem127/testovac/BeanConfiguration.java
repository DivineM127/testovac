package cz.divinem127.testovac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ToeManager buildBuilder() {
        return new ToeManager();
    }
}
