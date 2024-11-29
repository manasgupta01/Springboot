package Pr1;

import Pr1.game.GameRunner;
import Pr1.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {
    public static void main(String[] args) {

            //Launch Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

            //Configure
        //HelloWorldConfiguration class - using @Configuraiton
        // name - @Bean

        // retrieving beans managed by spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("address"));

    }
}
