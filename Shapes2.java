/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes2;

import java.util.Scanner;

/**
 *
 * @author Wojciech Tworzydło, F11
 */
public class Shapes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userWidth = new Scanner(System.in);
        int width;

        System.out.println("\"Flaga Wielkiej Brytanii\"");
        System.out.print("Podaj szerokość: ");
        width = userWidth.nextInt();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0 || i == width - 1 || j == width - 1 // Borders
                        || j == Math.floor((float) (width - 1) / 2) || j == Math.ceil((float) (width - 1) / 2)// Vertical line
                        || i == Math.floor((float) (width - 1) / 2) || i == Math.ceil((float) (width - 1) / 2)// Horizontal line
                        || j == i// "\" diagonal
                        || j == width - i - 1 // "/" diagonal
                        ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("Dwa amalowane kwadraty");
        System.out.print("Podaj szerokość: ");
        width = userWidth.nextInt();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0 || i == width - 1 || j == width - 1 // Borders
                        || (width % 2 == 1 && j == Math.ceil((float) (width - 1) / 2)) // Vertical line, only when width is not an even number
                        || (width % 2 == 1 && i == Math.ceil((float) (width - 1) / 2)) // Horizontal line, only when width is not an even number
                        || (j < Math.floor((float) (width) / 2) && i >= Math.floor((float) (width) / 2)) // Filling out lower square
                        || (j >= Math.floor((float) (width) / 2) && i < Math.floor((float) (width) / 2)) // Filling out upper square
                        ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("Cztery zamalowane trójkąty");
        System.out.print("Podaj szerokość: ");

        width = userWidth.nextInt();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0 || i == width - 1 || j == width - 1 // Borders
                        || j == Math.floor((float) (width - 1) / 2) || j == Math.ceil((float) (width - 1) / 2)// Vertical line
                        || i == Math.floor((float) (width - 1) / 2) || i == Math.ceil((float) (width - 1) / 2)// Horizontal line
                        || ( j > i && j < width / 2) // Upper left triangle
                        || ( j > (width - i - 1) && i < width / 2) // Upper right triangle
                        || ( j < (width - i - 1) && i > width / 2) // Lower left triangle
                        || ( j < i && j > width / 2) // Lower right triangle
                        ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

}
