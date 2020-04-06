package ru.arl;

import java.sql.SQLOutput;

public class Phone {
    private String number;
    private String model;
    private String weight;


    public Phone(String n, String m, String w) {
        number = n;
        model = m;
        weight = w;
    }
    public Phone(String n1, String m1) {
        number = n1;
        model = m1;
    }
    public Phone() {
        new Phone ("нет","нет","нет");
    }

    //Геттеры и Сеттеры

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                '}' + '\n' + "Вам звонит" + number;

    }

    //Условие задачи

    public static void main(String[] args) {
        Phone Iphone = new Phone("+79261248598","Pro Max 11","188 г");
        Phone Samsung = new Phone("+79253208988","S20 Ultra","220 г");
        Phone Xiomi = new Phone("+79207403578","Mi Note 11","208 г");
        Phone NoPhone = new Phone();

        System.out.println(Iphone);
        System.out.println(Samsung);
        System.out.println(Xiomi);
        System.out.println(NoPhone);
    }
}

