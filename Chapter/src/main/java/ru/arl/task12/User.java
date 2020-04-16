package ru.arl.task12;

public class User {
    public String login;
    public String password;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    Basket basket = new Basket();

    public static void main(String[] args) {
        User ruben = new User("akopyasha","qwerty",new Basket());
    }
}
