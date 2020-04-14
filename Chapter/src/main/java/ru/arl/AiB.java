package ru.arl;

public class AiB {
    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public AiB(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void transferIf(int a,int b) {
        if (a > b) {
            for (b = 1; b>a; b++);
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        AiB j = new AiB(2,1);
        j.transferIf(4,1);
    }

}