public class productSetFactory {

    public product newproduct(int x){

        switch(x){
            case 1:
                System.out.println("professional");
            case 2:
                System.out.println("casual");
            case 3:
                System.out.println("party");
            default:
                return null;
        }

    }
}
