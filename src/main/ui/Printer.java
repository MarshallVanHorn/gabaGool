package ui;

import java.util.ArrayList;
import java.util.List;

/*** DO NOT ALTER THIS CLASS! ***/

// Represents a printer that records what has been printed to the screen
public class Printer {
    private static List<String> printed = new ArrayList<>();

    // EFFECTS: prints a string of the form:
    //          itemName on onTopOf
    //          to the screen and records that this string has been printed.
    //          So ui.Printer.print("jacket", "name tag") will print the following to the screen
    //          "name tag on jacket"
    //          and record that this string was printed to the screen
    public static void print(String onTopOf, String itemName) {
        String toPrint = itemName + " on " + onTopOf;
        System.out.println(toPrint);
        printed.add(toPrint);
    }

    public static List<String> getPrinted() {
        return printed;
    }

    // EFFECTS: clears recorded output
    public static void reset() {
        printed.clear();
    }

    public String changePi(String str) {

        // str has 0 chars or 1 char
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        // str has 2 or more chars,
        // and the two leftmost chars is exactly the same as "pi"
        if ( str.substring(0, 2).equals("pi") ) {
            return "3.14" + changePi( str.substring(2, str.length() ) ) ;
        }

        // str has 2 or more chars,
        // and the two leftmost chars is not exactly the same as "pi"
        return str.substring(0, 1) + changePi( str.substring(1, str.length() ) );

    }

}

