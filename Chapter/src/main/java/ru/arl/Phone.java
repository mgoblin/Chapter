package ru.arl;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone() {
        new Phone ("нет","нет","нет");
    }

    public Phone(String n, String m, String w) {
        number = n;
        model = m;
        weight = w;
    }

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
                '}';
    }

    public static void main(String[] args) {
        Phone Iphone = new Phone("11","Pro Max","188 г");
        Phone Samsung = new Phone("20","S20 Ultra","220 г");
        Phone Xiomi = new Phone("10","Mi Note","208 г");
        Phone NoPhone = new Phone();

        System.out.println(Iphone);
        System.out.println(Samsung);
        System.out.println(Xiomi);
        System.out.println(NoPhone);

    }
}

