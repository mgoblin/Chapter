package ru.arl.inrf;

public class ConstMy implements IMyIntreface{
    @Override
    public String greeting(String name) {
        return "Привет, " + name;
    }
}
