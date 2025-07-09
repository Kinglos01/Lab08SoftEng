package com.mycompany.factorydeseign;

public class productSetFactory {

    public Product newproduct(int x){

        // Factory to determine which type of object this will be
        switch(x){
            case 1:
                System.out.println("professional");
                return Main.prof;
            case 2:
                System.out.println("casual");
                return Main.casual;
            case 3:
                System.out.println("party");
                return Main.party;
            case 4:
                Main.listAllClothes();
                break;
            case 5:
                System.out.println("Shutting Down");
                System.exit(0);
            default:
                return null;
        }
    return null;
    }
}
