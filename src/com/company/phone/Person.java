package com.company.phone;

/*a) поля fullName, age.
б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
в) Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).*/

import java.util.Arrays;

public class Person {

    private MyVector<User> fullName;
    private int age;


    public Person() {
        fullName = new MyVector<>();
    }


    public Person(String name, String surname, int age) {
        fullName = new MyVector<>();
        addUser(name, surname);
        this.age = age;
    }


    public void addUser(String name, String surname) {
        fullName.addSubscriber(new User(name, surname));
    }


    public int getAge() {
        return age;
    }

    public void showPerson() {
        for (int i = 0; i < fullName.size(); i++) {
            System.out.println(" Объект : "+ fullName.get(i));
            System.out.println(" Возраст : "+getAge());
        }
    }

    public void move(){
        System.out.println("----------------------------");
        if (fullName.size()==0){
            System.out.println(" Объект отсутствует");
        }
        showPerson();
    }
    public void talk(){
        System.out.println("----------------------------");
        if (fullName.size()==0){
            System.out.println(" Объект отсутствует");
        }
        showPerson();
    }
}
