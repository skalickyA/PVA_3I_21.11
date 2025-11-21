package org.example;

public class User extends Entita{
    int id;

    public User(String name, boolean isAdmin, int age, int id) {
        super(name, isAdmin, age);
        this.id = id;
    }

    @Override
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(isAdmin);
        System.out.println(id);
    }
}
