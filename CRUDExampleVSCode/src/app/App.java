package app;

import model.Person;
import model.PersonDAO;

public class App {
    public static void main(String[] args) throws Exception {

        PersonDAO model = new PersonDAO();

        Person person = new Person();

        person.setIdNumber(1234);
        person.setIdType("Cedula de Ciudadania");
        person.setName("Juan Luis");
        person.setLastName("Guerra");
        person.setDateBirth("1994/05/09");
        person.setEmail("Example@gmail.com");
        person.setPhone("340567");
        person.setGender("Masculino");

        if(model.addPerson(person)){
            System.out.println("Guardado");
        }else{
            System.out.println("No Guardado");
        }

    }
}