package Class6;

public class SwichCaseDemo {
    public static void main(String[] args) {

        String country = "afghanistan";

        switch (country.toLowerCase()){  // converts text to lower case ex. USA-->usa

            case "usa":
                System.out.println("Burgers"); break;
            case "Itly":
                System.out.println("Pasta");break;

            case "afghanistan":
                System.out.println("Kabob");break;

            default:
                System.out.println("Wrong Country");



        }








    }
}
