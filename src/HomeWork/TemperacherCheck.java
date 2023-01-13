package HomeWork;

public class TemperacherCheck {
    public static void main(String[] args) {

        int temperature = 32; // overhear temp is not below 32, our output will not be freeze water


        if (temperature<32) {
            System.out.println("Water will freeze with temperature " +temperature);
        }
        else if (temperature>=32)
        {
            System.out.println("Water will not freeze with temperature "+temperature); // tem is not below 32, it equals to or greater than 32, that's why we get this output
        }


    }}
