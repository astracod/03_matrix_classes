package com.company.phone;

/*Класс Phone.
a) Создайте класс Phone, который содержит переменные number, model и weight.
б) Создайте три экземпляра этого класса.
в) Выведите на консоль значения их переменных.
г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
 Вызвать эти методы для каждого из объектов.
д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
ж) Добавить конструктор без параметров.
з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
к) Создать метод sendMessageс аргументами переменной длины.
 Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.*/

public class Phone<T> {


    private MyVector<SubscriberBook> subscriber;
    private int number;
    private String model;
    private int weight;


    public Phone() {
        subscriber = new MyVector<>();
    }

    public Phone(int number, String model) {
        subscriber = new MyVector<>();
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        subscriber = new MyVector<>();
        this.weight = weight;
        this.number = number;
        this.model = model;
    }

    public void heading(String a) {
        System.out.println();
        System.out.println(a);
        System.out.println("---------------------");
    }

    public void myShow() {
        heading(" Вызов конструктора с 3 параметрами : ");
        System.out.println(" Номер : " + number + " | Модель : " + model + " | Ширина : " + weight);
        System.out.println("=====================");
    }

// Показать абонентскую книжку.

    public void showSubscriber() {
        heading(" Абонентская книга :");
        for (int i = 0; i < subscriber.size(); i++) {
            subscriber.get(i).showSubscriber();
        }
    }

    public int getNumber() {
        return number;
    }


// Метод записи конткта в абонентскую книжку.

    public void addContact(String name, int number) {
        subscriber.addSubscriber(new SubscriberBook(name, number));
    }

// Метод receiveCall выводящий имя и синхронизирующий номер по создаваемому объекту.

    public void receiveCall(String name) {
        subscriber.addSubscriber(new SubscriberBook(name, getNumber()));

        for (int i = 0; i < subscriber.size(); i++) {
            heading("| Имя : " + name + "| Номер : " + number);
        }
    }

    // Метод проверки имени на повторяемость.
    public boolean checkName(String name) {
        boolean x = false;
        for (int i = 0; i < subscriber.size(); i++) {
            if (name.equals(subscriber.get(i).getName())) {
                x = true;
                break;
            }
        }
        return x;
    }

    // Перегруженный метод receiveCall с функцией записи в абонентскую книжку.
    public void receiveCall(String name, int number) {
        int nameRecurrenceCounter = 1;
        if (checkName(name)) {
            subscriber.addSubscriber(new SubscriberBook(name + " - " + nameRecurrenceCounter++, number));
        } else {
            subscriber.addSubscriber(new SubscriberBook(name, number));
        }
        for (int i = 0; i < subscriber.size(); i++) {
            if (subscriber.get(i) != subscriber.get(i)) {
                heading("| Имя : " + name + "| Номер : " + number);
            }
        }
    }
// метод sendMessages аргументами переменной длины.

    public void sendMessages(T... message) {
        heading(" Поочередный вывод номеров для отправки на них сообщений : ");
        MyVector<T> messages = new MyVector<>();
        int num = 0;
        for (int i = 0; i < message.length; i++) {
            messages.addMessages(message[i]);
        }
        for (int i = 0; i < messages.size(); i++) {
            num++;
            System.out.println(" Вывод номера № " + num);
            System.out.println(" Сообщение отправлено : -> " + messages.get(i));
        }
    }

}



