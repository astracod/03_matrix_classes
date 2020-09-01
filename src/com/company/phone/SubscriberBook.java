package com.company.phone;

public class SubscriberBook {

    private String name;
    private int number;

    public SubscriberBook(String name, int number) {
        this.name = name;
        this.number = number;
    }



    public String getName(){
        return name;
    }
    public void showSubscriber(){
        System.out.println("| Имя : "+name+"| Номер : "+number);
    }

}
