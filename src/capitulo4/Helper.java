package capitulo4;

import java.util.Scanner;

public class Helper {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int option;
        HelpClass first = new HelpClass();

        for(;;) {
            first.showMenu();
            do {
            option = teclado.nextInt();
            //System.out.println(option);
            }while(!first.isValid(option));
            first.helpOn(option);

        }
    }
}
