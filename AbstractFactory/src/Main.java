import OperatingSystems.Linux;
import OperatingSystems.MacOS;
import OperatingSystems.Windows;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Object factory = null;
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println("What logging and notification system do you want?");
        System.out.println("[0] MacOS");
        System.out.println("[1] Windows");
        System.out.println("[2] Linux");
        switch(input){
            case 0:
                factory = new MacOS();
                break;
            case 1:
                factory = new Windows();
                break;
            case 2:
                factory = new Linux();
                break;
        }
    }
}
