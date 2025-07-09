package com.mycompany.factorydeseign;

import java.util.ArrayList;

public class Professional implements Product {

    // Different objects to separate them by clothing type
    ArrayList<String> profTop = new ArrayList<>();
    ArrayList<String> profPants = new ArrayList<>();
    ArrayList<String> profShoes = new ArrayList<>();

    //Allows the adding of multiple garments of different types
    @Override
    public void display() {

      int x =  Main.clothingType();

        switch (x) {
            case 1:
                profTop.add(Main.itemDescription());
                System.out.println("added new item " + profTop.get(profTop.size()-1));
                break;
            case 2:
                profPants.add(Main.itemDescription());
                System.out.println("added new item " + profPants.get(profPants.size()-1));
                break;
            case 3:
                profShoes.add(Main.itemDescription());
                System.out.println("added new item " + profShoes.get(profShoes.size()-1));
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    //Getters for usage of finding the items
    public ArrayList<String> getprofTop(){
        return profTop;
    }

    public ArrayList<String> getprofPants() {
        return profPants;
    }
    public ArrayList<String> getprofShoes() {
        return profShoes;
    }


}

