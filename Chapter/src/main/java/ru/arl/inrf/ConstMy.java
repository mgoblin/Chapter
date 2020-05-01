package ru.arl.inrf;

public class ConstMy extends Base implements IMyIntreface, IIntrf2 {
    @Override
    public String greeting(String name) {
        return "Привет, " + name;
    }

    @Override
    public int age() {
        return 23;
    }
}
