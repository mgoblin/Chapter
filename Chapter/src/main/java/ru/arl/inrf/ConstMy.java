package ru.arl.inrf;

public class ConstMy extends Base implements IMyIntreface{
    @Override
    public String greeting(String name) {
        return "Привет, " + name;
    }
}
