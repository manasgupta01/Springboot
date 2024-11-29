package Pr1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String city,Integer pincode){};
@Configuration
public class HelloWorldConfiguration {

    String name = "manasgupta";

    @Bean
    public String name(){
        return name;
    }
    @Bean
    public Address address(){
        return new Address("indore",22);
    }

}
