package Metier;

import Dao.Person;
import Dao.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("school")
public class School {
    // Injection de dependance avec les Annotations :
    /*
        @Autowired
        @Qualifier("employe")
        public Person person;
    */

    // Injection des dependances avec le constructeur :
   public Person person ; // le nom "person" en doit le mettre dans le nom du component ou on veut Injecter
    public School(Person person){
        this.person = person ;
    }

}
