import java.util.Scanner;

public class ConsoleUIManager {
    //Scanner to interact with the user in the Console
    private final Scanner scanner;

    public ConsoleUIManager(){scanner = new Scanner(System.in);};

    private static final String ENTER_POSSIBLE_OPTION = "Enter an option:";
    private static final String MAIN_MENU_MESSAGE =
            "1.Serie by the average score\n" +
            "2.Serie by the date of the premiere\n" +
            "3.Serie by priority combination\n" +
            "4.Exit";
    private static final String ERROR_MESSAGE = "Error, the entered option is not a valid option.Please try again.";
    private static final String AVERAGE_MESSAGE = "This option uses the Merge Sort algorithm to sort the scores:\n";
    private static final String DATA_PREMIERE_MESSAGE =  "This option uses the Quick Sort algorithm to sort the dates of the premiere:\n";
    private static final String DATA_PRIORITY_MESSAGE = "This option uses the Bucket Sort algorithm to sort the priorities:\n";

    public int askForOption(){
        return scanner.nextInt();
    }

    public void showMainMenu(){
        System.out.println(ENTER_POSSIBLE_OPTION);
        System.out.println(MAIN_MENU_MESSAGE);
    }

}
