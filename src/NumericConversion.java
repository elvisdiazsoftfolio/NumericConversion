import java.util.Scanner;

public class NumericConversion {
    public static void menu(){
       System.out.println("Decoding Menu \n-------------");
       System.out.println("1. Decode hexadecimal");
       System.out.println("2. Decode binary");
       System.out.println("3. Convert binary to hexadecimal");
       System.out.println("4. Quit");
       System.out.println("\nPlease enter an option:");
    }

    public static long hexStringDecode(String hex) {
        if (hex.startsWith("0x")){
           hex = hex.substring(2);
    }
        return Integer.parseInt(hex,16); 
    }
    public static short hexCharDecode(char digit) {
        String newDigit=String.valueOf(digit);
        return (short) Integer.parseInt(newDigit,16);
    }
    public static short binaryStringDecode(String binary){
        return (short) Integer.parseInt(binary,2);
    }
    public static String binaryToHex(String binary) {
        int newBinary = Integer.parseInt(binary, 2);
        return (String) Integer.toHexString(newBinary);
    }

       public static void main(String[] args) {
         Scanner menuOption = new Scanner(System.in);
         int operation = 0;
         String numStr = "";

          while (true) {
             menu();
             operation = menuOption.nextInt();
             if (operation == 4)
             {System.exit(0);}
             System.out.println("Please enter the numeric string to convert: ");
             numStr = menuOption.next();
             switch (operation) {
                 case 1:
                         System.out.println("Result: " + hexStringDecode(numStr));
                     break;
                 case 2:
                     System.out.println("Result: " + binaryStringDecode(numStr));
                     break;
                 case 3:
                     System.out.println("Result: " + binaryToHex(numStr));
                     break;
                 default:
                     System.out.println("Please enter a valid option");
             }
          }
       }
    }


