package com.mycompany.factorydeseign;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        // Make the product instances so we can call them
        static Professional prof = new Professional();
        static Casual casual = new Casual();
        static Party party = new Party();

    public static void main(String[] args) {


        // While loop to add as many objects as possible
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of the product Type: ");
            System.out.println("1: Professional ");
            System.out.println("2: Casual ");
            System.out.println("3: Party ");
            System.out.println("4: Find Clothes by Type");
            System.out.println("5: Exit");
            int type = sc.nextInt();



            Product myproduct = new productSetFactory().newproduct(type);

            if(myproduct != null) {
                myproduct.display();
            }
        }
    }

    // Created a method to remove redundant code
    public static int clothingType(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the product type you would like");
        System.out.println("1 : Top\n2 : Pants\n3 : Shoes");
        int type = sc.nextInt();
        return type;
    }

    // Created a method to remove redundant code
    public static String itemDescription(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item description: ");
        return sc.nextLine();
    }

    public static int clothingStyle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of what style you would like: ");
        System.out.println("1: Professional \n2: Casual \n3: Party");
        int style = sc.nextInt();
        return style;
    }

    // Allows user to see all clothes added
    public static void listAllClothes(){

        int x =  Main.clothingStyle();
        int y =  Main.clothingType();

        switch (x){
            case 1: { Professional p = Main.prof;

                switch (y) {
                    case 1:
                        System.out.println("The professional tops are: ");
                        for (String item : p.getprofTop())
                            System.out.println(item +", ");
                        break;
                    case 2:
                        System.out.println("The professional pants are: ");
                        for (String item : p.getprofPants())
                            System.out.println(item +", ");
                    case 3:
                        System.out.println("The professional shoes are: ");
                        for(String item : p.getprofShoes())
                            System.out.println(item +", ");
                        break;
                    }

                }
                break;
            case 2: {
                Casual c = Main.casual;
                switch (y) {
                    case 1:
                        System.out.println("The professional tops are: ");
                        for (String item : c.getCasTop())
                            System.out.println(item + ", ");
                        break;
                    case 2:
                        System.out.println("The professional pants are: ");
                        for (String item : c.getCasPants())
                            System.out.println(item + ", ");
                    case 3:
                        System.out.println("The professional shoes are: ");
                        for (String item : c.getCasShoes())
                            System.out.println(item + ", ");
                        break;
                  }
                }
                case 3: {
                    Party pt = Main.party;
                    switch (y) {
                        case 1:
                            System.out.println("The professional tops are: ");
                            for (String item : pt.getPartyTop())
                                System.out.println(item + ", ");
                            break;
                        case 2:
                            System.out.println("The professional pants are: ");
                            for (String item : pt.getPartyPants())
                                System.out.println(item + ", ");
                        case 3:
                            System.out.println("The professional shoes are: ");
                            for (String item : pt.getPartyShoes())
                                System.out.println(item + ", ");
                            break;

                    }
                }
        }
    }

}