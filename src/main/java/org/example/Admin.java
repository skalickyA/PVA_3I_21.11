package org.example;

public class Admin extends Entita{
    boolean read;
    boolean write;

    public Admin(String name, boolean isAdmin, int age) {
        super(name, isAdmin, age);
        this.read = true;
        this.write = true;
    }

    @Override
    public void printInfo(){
        System.out.println("Jmeno je: " + name);
        System.out.println("Věk je: " + age);
        System.out.println("isAdmin: " + isAdmin);
        System.out.println("write: " + write);
        System.out.println("read: " + read);
    }
}
