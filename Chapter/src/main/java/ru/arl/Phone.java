package ru.arl;

public class Phone {
    private String number;
    private String model;
    private int weight;


    public Phone(String n, String m, int w) {
        new Phone(n,m);
        model = m;
        number = n;
        weight=w;
    }

    public Phone(String n1, String m1) {
        number = n1;
        model = m1;
    }
    public Phone() {
        new Phone ("нет","нет",0);
    }

    public void receiveCall(String name,String num) {System.out.println("Звонит " + name + num);}

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                '}';

    }

    //Условие задачи

    public static void main(String[] args) {
        Phone iphone = new Phone("+79261248598","Pro Max 11",188);
        Phone samsung = new Phone("+79253208988","S20 Ultra",220);
        Phone xiaomi = new Phone("+79207403578","Mi Note 11",208);
        Phone noPhone = new Phone();

        Phone nokia = new Phone("+79264312345","3310");
//1
        iphone.receiveCall("Дядя Миша ", "+79261248598");
        iphone.getNumber();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(xiaomi);
        System.out.println(noPhone);
    }
}

