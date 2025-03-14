package capitulo4;

import java.util.Scanner;

public class Helper {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int option;
        HelpClass first = new HelpClass();

        //for(;;) {
            first.showMenu();
            option = scan.nextInt();
            System.out.println(option);
            first.isValid(option);
            first.helpOn(option);
        //}
    }
}
