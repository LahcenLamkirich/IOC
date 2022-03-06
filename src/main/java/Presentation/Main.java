package Presentation;

import Metier.School;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Metier", "Dao");
        School sc = context.getBean(School.class);
        sc.person.Work();
    }
}
