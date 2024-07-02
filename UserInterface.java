
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Birds> bird;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.bird = new ArrayList<Birds>();
    }

    public void start() {
        
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                askName();
            }
            
            if (command.equals("Observation")) {
                observ();
            }
            
            if (command.equals("All")) {
                printAll();
            }
            
            if (command.equals("One")) {
                printOne();
            }
            
        }
        
    }
    
    public void askName() {
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Name in Latin:");
        String latin = scanner.nextLine();
        bird.add(new Birds(name, latin));
    }
    
    public void observ() {
        System.out.println("Bird?");
        String obs = scanner.nextLine();
        int count = 0;
        for (Birds item : bird) {
            if (item.getName().equals(obs)) {
                item.addObservation();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not a bird!");
        }
    }
    
    public void printAll() {
        for (Birds item : bird) {
            System.out.println(item);
        }
    }
    
    public void printOne() {
        System.out.println("Bird?");
        String one = scanner.nextLine();
        for (Birds item : bird) {
            if (item.getName().equals(one)) {
                System.out.println(item);
            }
        }
    }
}
