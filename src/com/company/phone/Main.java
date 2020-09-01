package com.company.phone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

 /*       Phone a = new Phone(123, " Айфон 10", 15);
        Phone z = new Phone(321, "айфон 5", 25);
        Phone q = new Phone(777, "Айфон 11", 50);

        z.receiveCall("Дмитрий");
        a.receiveCall("Артур");
        q.receiveCall("Илья");

        Phone c = new Phone();
        c.addContact("Артур", 1234);
        c.addContact("Илья", 777);
        c.receiveCall("Артур", 321);
        c.receiveCall("Дима", 55);
        c.showSubscriber();
        c.sendMessages(333, 252, 998);*/

      /*  Person m = new Person();
        Person p = new Person("Иван","Иванов",50);
        p.talk();
        p.move();
        m.move();*/

        Matrix a = new Matrix(4,4);
        a.showMatrix();
        Matrix b = new Matrix(4,4);
        b.showMatrix();
        Matrix c = a.matrixAddition(b);
        c.showMatrix();
        Matrix d = c.multiplication(-1);
        d.showMatrix();

    }
}
