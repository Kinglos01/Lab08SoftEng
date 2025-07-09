package com.mycompany.factorydeseign;

import java.util.ArrayList;

public class Casual implements Product {

    // Different objects to separate them by clothing type
    ArrayList<String> casTop = new ArrayList<>();
    ArrayList<String> casPants = new ArrayList<>();
    ArrayList<String> casShoes = new ArrayList<>();

    //Allows the adding of multiple garments of different types
    @Override
    public void display() {

        int x = Main.clothingType();



        switch (x) {
            case 1:
                casTop.add(Main.itemDescription());
                System.out.println("added new item " + casTop.get(casTop.size() - 1));
                break;
            case 2:
                casPants.add(Main.itemDescription());
                System.out.println("added new item " + casPants.get(casPants.size() - 1));
                break;
            case 3:
                casShoes.add(Main.itemDescription());
                System.out.println("added new item " + casShoes.get(casShoes.size() - 1));
                break;
            default:
                System.out.println("Error");
                break;
        }


    }
    //Getters for usage of finding the items
    public ArrayList<String> getCasTop(){
        return casTop;
    }

    public ArrayList<String> getCasPants() {
        return casPants;
    }
    public ArrayList<String> getCasShoes() {
        return casShoes;
    }


}
