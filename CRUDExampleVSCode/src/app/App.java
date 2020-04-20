package app;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import model.Person;
import model.PersonDAO;

public class App {
    public static void main(String[] args) throws Exception {


        PersonDAO model = new PersonDAO();

        int menu = Integer.parseInt(JOptionPane.showInputDialog("CRUD EXAMPLE\n"+
                                                               "1- Insert Data.\n"+
                                                               "2- Select Data.\n"+
                                                               "3- Update Data.\n"+
                                                               "4- Delete Data.\n"+
                                                               "5- Exit."));

        switch(menu){

            case 1:
                
                Person person = new Person();

                person.setIdNumber(1345);
                person.setIdType("Cedula de Ciudadania");
                person.setName("Andrea Carolina");
                person.setLastName("Perez");
                person.setDateBirth("1994/05/09");
                person.setEmail("Example@gmail.com");
                person.setPhone("340567");
                person.setGender("Femenino");
        
                if(model.addPerson(person)){
                    System.out.println("Guardado");
                }else{
                    System.out.println("No Guardado");
                }

            break;

            case 2:

                ArrayList<String> data=new ArrayList<>();
                data.add("Cedula de Ciudadania");
                data.add("1345");
                
                ArrayList<Person> list = model.selectPerson("", null);

                for(int i=0; i<list.size(); i++){

                    System.out.println(list.get(i).getIdNumber() + " " + list.get(i).getName() + " "+ list.get(i).getLastName());
                
                }
                
            break;

            case 3:

                person = new Person();

                person.setId(14);
                person.setIdNumber(1345);
                person.setIdType("Cedula de Ciudadania");
                person.setName("Maria Carolina");
                person.setLastName("Perez");
                person.setDateBirth("1994/05/09");
                person.setEmail("ExampleT@gmail.com");
                person.setPhone("876544");
                person.setGender("Femenino");
        
                if(model.updatePerson(person)){
                    System.out.println("Los datos han sido modificados de manera exitosa");
                }else{
                    System.out.println("No se pudo modificar la informacion");
                }

            break;

            case 4:

                int confirm = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea realizar el proceso?\n"
                                                                 +"Todos los datos se perderan");

                if(confirm == JOptionPane.YES_OPTION){
                    if(model.deletePerson(4)){
                        System.out.println("Los datos han sido eliminados de manera exitosa");
                    }else{
                        System.out.println("No se pudo eliminar la información");
                    }
                }

            break;

            case 5:
                System.out.println("Saliendo del sistema...");
                System.out.println("Proceso finalizado");
            break;

        }



    }
}