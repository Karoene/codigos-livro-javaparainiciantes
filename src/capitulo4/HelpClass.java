package capitulo4;

public class HelpClass {

    void helpOn(int opc){
        switch (opc){
            case 1:
                System.out.println("The if/else: ");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case 2:
                System.out.println("The switch: ");
                System.out.println("switch(expression){");
                System.out.println("    case const:");
                System.out.println("        statement;");
                System.out.println("        break;");
                System.out.println("    default: //optional");
                System.out.println("}");
                break;
            case 3:
                System.out.println("The for classic: ");
                System.out.println("for(inizialization;condition;index) statement;");
                break;
        }

    }

    void showMenu(){
        System.out.println();
        System.out.println("---------HELPER MENU---------");
        System.out.println("1 - if/else");
        System.out.println("2 - switch");
        System.out.println("3 - for");
        System.out.println("Choise an Number (press 0 to quit)");

    }

    boolean isValid(int opc){
        if( ((opc >= 4) || (opc <= 0)) )return false;
        return true;
    }

}
