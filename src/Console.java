

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Console {

    static final String INTRODUCTION = "Welcome to Pokemon! Can you help Ash catch them all?";

    static final String EXPLANATION = "Please insert the full path you want Ash to follow (N - North, S - South, E - east, W - west) " +
            " and press enter";

    static final String SUCCESSFUL_INPUT_MESSAGE = "Please insert another path for Ash to follow";

    static final String RESULT_MESSAGE = "Ash managed to catch %d pokemons!%n";


    public static void main(String[] args) {

        out.println(INTRODUCTION);
        out.println(EXPLANATION);

        Scanner inputReader = new Scanner(System.in);

        Tracker tracker = new Tracker();

        String input = inputReader.nextLine();

        while (!input.equals("exit")){
            char[] directions  = input.toCharArray();
            tracker.newPath();

            for (int i = 0; i < directions.length; i++) {
                tracker.followPath(directions[i]);
            }

            out.printf(RESULT_MESSAGE, tracker.getPathSize());
            out.println(SUCCESSFUL_INPUT_MESSAGE);
            input = inputReader.nextLine();

        }
    }



}
