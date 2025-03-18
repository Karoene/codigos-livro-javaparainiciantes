package capitulo4;

import java.util.Scanner;

public class Helper {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int option;

        HelpClass first = new HelpClass();

        do {
            first.showMenu();
            option = keyboard.nextInt();
            if (!first.isValid(option)) break;
            first.helpOn(option);
        } while (first.isValid(option));


    }


}
