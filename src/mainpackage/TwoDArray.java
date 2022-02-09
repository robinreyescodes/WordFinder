package mainpackage;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first word: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter your second word: ");
        String string2 = scanner.nextLine();
        boolean[][]words = new boolean[string1.length()][string2.length()];


        int trueCounter = 0; //if there are the same number of trues this passes


        for (int i = 0; i < string1.length(); i++) { //loops over row
            for (int j = 0; j < string2.length(); j++) { //loops over column
                //checks if both characters match
                if (string1.charAt(i) == string2.charAt(j)) {
                    words[i][j] = true;
                    trueCounter++;  //increments trueCounter
                } else
                    words[i][j] = false; //essentially does nothing
            }

        }
        System.out.println(string1 + " " + string2);
        if (trueCounter > string1.length())

            System.out.println("these strings have the same letters");
        else
            System.out.println("these strings do NOT have the same letters");


//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                if (j != i) {
//                    System.out.print("" + "\t");
//                }
//                if (j == i)
//                    System.out.print(data[i][j] + "\t");
//
//            }
//            System.out.println("\n");
//        }

    }
}
