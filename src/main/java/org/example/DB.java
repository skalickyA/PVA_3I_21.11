package org.example;

import java.util.ArrayList;

public class DB {
    ArrayList<Entita> entitaArrayList;

    public DB() {
        this.entitaArrayList = new ArrayList<>();
        generate();
    }

    private void generate(){
        for (int i = 0; i <= 10; i++){
            entitaArrayList.add(new User("test"+i, false, 10, i));
        }

        for (int i = 0; i <= 2; i++){
            entitaArrayList.add(new Admin("test"+i, true, 10));
        }

    }


    public void addEntita(Entita entita){
        entitaArrayList.add(entita);
    }

    public void printArrayList(){
        for (Entita x: entitaArrayList){
            x.printInfo();
        }
    }
}
