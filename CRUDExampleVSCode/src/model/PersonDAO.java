package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PersonDAO {

    private PreparedStatement pst;
    
    public boolean addPerson (Person person){

        boolean state = false;
        Connection connect = null;

        try{

            connect = ConnectionPool.getInstance().getConnection();

            if(connect != null){

                String sql = "INSERT INTO persona (id_number, id_type, name, last_name, date_of_birth, gender, email, phone) VALUES (?,?,?,?,?,?,?,?)";

                pst = connect.prepareStatement(sql);

                pst.setInt(1, person.getIdNumber());
                pst.setString(2, person.getIdType());
                pst.setString(3, person.getName());
                pst.setString(4, person.getLastName());
                pst.setString(5, person.getDateBirth());
                pst.setString(6, person.getGender());
                pst.setString(7, person.getEmail());
                pst.setString(8, person.getPhone());

                int res = pst.executeUpdate();

                state = res > 0;

            }else{
                System.out.println("Conexión Fallida");
            }


        }catch(Exception ex){

            System.out.println(ex.getMessage());
        
        }finally{
            try {
                ConnectionPool.getInstance().closeConnection(connect);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        return state;
    }


}