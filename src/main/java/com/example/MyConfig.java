package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration // означает, что данный класс - конфигурационный
@ComponentScan("package com.example") // показываем какой пакет нужно сканировать
@PropertySource(value = "classpath:application.properties")
public class MyConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        System.out.println("--ноунейм bean класса для пропертис--" );
        return new PropertySourcesPlaceholderConfigurer();
    }

}
