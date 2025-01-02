package project.one;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File in = new File("src/project.one/samp.dat");
        int x = 0; int y = 0;
        int[][] map = new int[0][0];

        // MAP ARRAY CREATION
        try (Scanner scan = new Scanner(in);) {
            while (scan.hasNextInt()) {
                x = scan.nextInt(); y = scan.nextInt();
            }
            map = new int[x][y];
        } catch (IOException e) {
            e.printStackTrace();
        }

        // making map from .dat file into array
        try ( Scanner scan = new Scanner(in); ) {
            scan.nextLine(); // to skip first (int containing) line
            int rowIndex = 0;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                int colIndex= 0;
                for ( int i = 0; i < line.length(); i++ ) {
                    char curr = line.charAt(i);
                    switch (curr) {
                        case ' ':
                            map[rowIndex][colIndex] = 0;
                            break;
                        case 'X':
                            map[rowIndex][colIndex] = 1;
                            break;
                        case '+':
                            map[rowIndex][colIndex] = 2;
                            break;
                        case '-':
                            map[rowIndex][colIndex] = 3;
                            break;
                    }
                    colIndex++;
                }
                rowIndex++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TESTING
        for ( int[] row : map ) {
            for ( int col : row ) {
                System.out.print(col + "");
            }
            System.out.println();
        }

    }
}
