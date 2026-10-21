public class DataType {

    public static void main(String[] args) {

        // numerical DT - byte , short , int ,long
        byte num1 = 127;
        System.out.println(num1);
        short num2 = -32768;
        System.out.println(num2);

        int num3 = 500000;
        long num4 = 5000000;
        System.out.println(num3);
        System.out.println(num4);

        // floating
        float num5 = 3.545f;
        System.out.println(num5);
        double num6 = 3.54545346546;
        System.out.println(num6);

        // other char , boolean
        boolean check = true;
        System.out.println(check);

        char firstChar = 'a';
        System.out.println("My first charactor is " + (char) ((firstChar) + 2));

        long value1 = 12;
        int value2 = (int) value1;
        System.out.println(value2);
    }
}