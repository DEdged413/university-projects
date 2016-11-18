package shapes1;

import java.util.Scanner;

/**
 *
 * @author dedged
 */
public class Shapes1 {
    public static void main(String[] args) {
        // Variable storing the users' choice
        Scanner userInputSelection = new Scanner(System.in);
        int InputSelection;

        // Variable storing the shapes' width 
        Scanner userWidth = new Scanner(System.in);
        int width;

        System.out.println("Wybierz co wyrysować: ");
        System.out.println(" 1) Pusty kwadrat");
        System.out.println(" 2) Trójkąty...");
        // TODO System.out.println(" 3) Flagi... ");
        System.out.println();
        System.out.print("Twój wybór: ");
        InputSelection = userInputSelection.nextInt(); // Get users choice

        switch (InputSelection) {
            case 1: // Hollow square
                System.out.print("Wpisz długość boku kwadratu: ");
                width = userWidth.nextInt(); // Set squares' size
                System.out.println();

                hollowSquare(width); // Draw the square
                break;
                
            case 2: // Triangles
                System.out.println();
                System.out.println("Rodzaj trójkąta: ");
                System.out.println(" 1) |\\");
                System.out.println(" 2) |/");
                System.out.println(" 3) \\|");
                System.out.println(" 4) /|");
                System.out.println();
                System.out.print("Twój wybór: ");
                InputSelection = userInputSelection.nextInt(); // Select the triangle type
                System.out.println();
                
                System.out.print("Wpisz długość boku trójkąta: ");
                width = userWidth.nextInt(); // Set the triangles' width
                System.out.println();
                
                triangles(InputSelection, width); // Draw the selected triangle
                break;

            case 3: // Flags, TODO
                System.out.println();
                System.out.println("Rodzaj flagi: ");
                System.out.println(" 1) Polska");
                System.out.println(" 2) Czechy");
                System.out.println(" 3) USA");
                System.out.println(" 4) Anglia");
                System.out.println();
                System.out.print("Twój wybór: ");
                InputSelection = userInputSelection.nextInt(); // Select the flag type
                System.out.println();
                
                System.out.print("Wpisz długość flagi: ");
                width = userWidth.nextInt(); // Set the flags' width
                System.out.println();
                
                flags(InputSelection, width); // Draw the selected flag
                break;
        }

        System.out.println(); // separating application output from 
        // debug information

    }

    public static void hollowSquare(int size) { // Draws a hollow square of a given size
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == (size - 1) || j == 0 || j == (size - 1)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void triangles(int triangleType, int width) { // Draws a triangle of a given type and width

        switch (triangleType) {
            case 1: // A |\ triangle
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("#");
                    }
                    System.out.println();
                }
                break;

            case 2: // A |/ triangle
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < (width - i); j++) {
                        System.out.print("#");
                    }
                    System.out.println();
                }
                break;

            case 3: // A \| triangle
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j <= width; j++) {
                        if (j > i) {
                            System.out.print("#");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();

                }
                break;

            case 4: // A /| triangle
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < width; j++) {
                        if (j < (width - i - 1)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("#");
                        }
                    }
                    System.out.println();
                }
                break;
        }
    }

    public static void flags(int UserChoice, int width) {
    } // TODO
}
