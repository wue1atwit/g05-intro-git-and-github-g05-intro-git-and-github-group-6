import java.util.Scanner;

<<<<<<< HEAD
public class main
{
    //TODO: main method, game loop
    public static void main(String[] args)
    {
        System.out.println("You are in a house");
        System.out.println("You need to find your keys before leaving");
        System.out.println("You have seemingly forgotten where you placed them");
=======
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    
        System.out.println("PARAGRAPH EXPLAINING THE GAME AND RULES");

        boolean keyFound = false;
        int x = 1;
        while (true) {
            System.out.println(x);
            String input = scan.nextLine();
            System.out.println(input);
            if (input.equals("move")) {
                System.out.println("MOVE TO...");
            }
            else if (input.equals("search")) {
                System.out.println("SEARCHING...");
            }
            else if (input.equals("fail")) {
                System.out.println("YOU GAVE UP :(");
                break;
            }
            x++;
        }
>>>>>>> origin/hahaidkwhatimdoinglol
    }
}
