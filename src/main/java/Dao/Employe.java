package Dao;

import org.springframework.stereotype.Component;

@Component("person")
public class Employe implements Person{

    @Override
    public void Work() {
        System.out.println("Working ... ");
    }

}
