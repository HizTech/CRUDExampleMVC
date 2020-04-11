package model;

public class Person {

    private int id;
    private int idNumber;
    private String idType;
    private String name;
    private String lastName;
    private String dateBirth;
    private String gender;
    private String email;
    private String phone;

    public Person(){}

    public Person(int id, int idNumber, String idTyoe, String name, String lastName, String dateBirth, String gender, 
                 String email, String phone){

        this.id=id;
        this.idNumber=idNumber;
        this.idType = idTyoe;
        this.name = name;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.email = email;
        this.phone = phone;

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getIdNumber(){
        return this.idNumber;
    }

    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }

    public String getIdType(){
        return this.idType;
    }

    public void setIdType(String idType){
        this.idType = idType;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getDateBirth(){
        return this.dateBirth;
    }

    public void setDateBirth(String dateBirth){
        this.dateBirth = dateBirth;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }



    


}