package com.company.phone;

public class User {
    private String name;
    private String surname;

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return  name;
    }
    public String getSurname(){
        return surname;
    }

    @Override
    public String toString() {
        return " "+getName()+" "+getSurname();
    }
}
