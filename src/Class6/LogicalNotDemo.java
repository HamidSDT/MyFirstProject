package Class6;

public class LogicalNotDemo {
    public static void main(String[] args) {

  // logical operators : is used to combine multiple  conditions .they only work with boolean values . (true,false) values

        System.out.println(false);
        System.out.println(!false);
        boolean condition = true;
        System.out.println(condition);


        String password = "Pass123";
        System.out.println(password.equals("Pass123"));

        if (password.equals("Pass123")){
            System.out.println("Wrong password");
        }








        boolean isRaining = true;

        if (!isRaining){
            System.out.println("lets go for a walk");

        }else {
            System.out.println("lets take the umbrella ");
        }









    }
}
