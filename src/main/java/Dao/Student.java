package Dao;


import org.springframework.stereotype.Component;

@Component("student")
public class Student implements Person{
    @Override
    public void Work() {
        System.out.println("Studying ... ");
    }
}
