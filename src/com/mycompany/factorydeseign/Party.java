package com.mycompany.factorydeseign;

import java.util.ArrayList;

public class Party implements Product{

    // Different objects to separate them by clothing type
    ArrayList<String> partyTop = new ArrayList<>();
    ArrayList<String> partyPants = new ArrayList<>();
    ArrayList<String> partyShoes = new ArrayList<>();

    //Allows the adding of multiple garments of different types
    @Override
    public void display() {

        int x = Main.clothingType();



        switch (x) {
            case 1:
                partyTop.add(Main.itemDescription());
                System.out.println("added new item " + partyTop.get(partyTop.size() - 1));
                break;
            case 2:
                partyPants.add(Main.itemDescription());
                System.out.println("added new item " + partyPants.get(partyPants.size() - 1));
                break;
            case 3:
                partyShoes.add(Main.itemDescription());
                System.out.println("added new item " + partyShoes.get(partyShoes.size() - 1));
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    //Getters for usage of finding the items
    public ArrayList<String> getPartyTop(){
        return partyTop;
    }

    public ArrayList<String> getPartyPants() {
        return partyPants;
    }
    public ArrayList<String> getPartyShoes() {
        return partyShoes;
    }
}
