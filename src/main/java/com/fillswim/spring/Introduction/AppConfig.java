package com.fillswim.spring.Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// Данный способ не использует сконирование пакета и поиск бинов
// При данном способе конфигурации аннотация @ComponentScan, @Component, @Autowired не нужны
@Configuration
public class AppConfig {

    // Описание бина
    // Id у создаваемого бина будет "catBean"
    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    // Описание бина c внедрением бина
    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
