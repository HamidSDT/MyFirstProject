package Class3;

public class TypeCasting_5 {
    public static void main(String[] args) {


        long number = 125;
        byte shortNumber=(byte) number;
        // if we try to store the contents of a smaller box in the larger box java don't complain , because the content easily fit in the larger box
        // but if we do the other way around java will complain, and we need the typecast to store the contents , here we do manually like () and put the available we wat to shift it too.

        float f=10.5f;
        int num =(int)f;
        System.out.println(f);
        System.out.println(num);
                                   // typecasting is used only when need to use it . conversion of one data to another data type is called Data type casting .
        byte b = 10;
        int number2 =b;
        short c = (short) number2;

        System.out.println(b);

        float egss =12.5f;
        int wholPart = (int) egss; //   types casting we are converting from float  to int .

        System.out.println(wholPart);








    }
}
