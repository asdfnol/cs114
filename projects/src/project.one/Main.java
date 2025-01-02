package project.one;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private static class Point {
        private int x;
        private int y;
        private Point(int a, int b) {
            x = a;
            y = b;
        }
    }

    private static Point startPoint;

    public static void main(String[] args) {
        File in = new File("src/project.one/maze.dat");
        int x = 0; int y = 0;
        int[][] map = new int[0][0];

        // MAP ARRAY CREATION
        try (Scanner scan = new Scanner(in);) {
            while (scan.hasNextInt()) {
                y = scan.nextInt(); x = scan.nextInt();
            }
            map = new int[y][x];
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
        startPoint= new Point(0, 0);
        for ( int row = 0; row < map.length; row++ ) {
            for ( int col = 0; col < map[row].length; col++ ) {
                if ( map[row][col] == 2 ) {
                    startPoint.y = row; startPoint.x = col;
                } 
            }
        }

        if (step(startPoint, map)) {
            System.out.println("The end of the maze was reached!");
        } else {
            System.out.println("There was no end to the maze.");
        }
        mapToFile(map, "src/project.one/result.dat");
    }

    public static boolean step(Point currStep, int[][] map) {
        int x = currStep.x; // columns
        int y = currStep.y; // rows

        /* BASE CASES */

        // if out of bounds
        if ( y < 0 || y >= map.length || x < 0 || x >= map[y].length ) {
            return false;
        }
        // if point is wall
        if ( map[y][x] == 1 ) {
            return false;
        }
        // point has already been marked
        if ( map[y][x] == 2 && !(currStep.y == startPoint.y && currStep.x == startPoint.x)) {
            // ^^ so that it doesn't immediately return false for starting point
            return false;
        }
        // if point marks dead end
        if ( map[y][x] == 4 ) {
            return false;
        }
        // if point is goal
        if ( map[y][x] == 3 ) {
            return true;
        }

        map[y][x] = 2;
        
        if ( step(new Point(x, y - 1), map) ) { // up
            return true;
        } else if ( step(new Point(x, y + 1), map) ) { // down
            return true;
        } else if ( step(new Point(x - 1, y), map) ) { // left
            return true;
        } else if ( step(new Point(x + 1, y), map) ) { // right
            return true;
        }

        if (!(currStep.y == startPoint.y && currStep.x == startPoint.x)) {
            map[y][x] = 4;
        }
        return false;
    }

    private static void printMap(int[][] a) {
        for ( int[] i : a ) {
            for ( int j : i ) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
    private static void mapToFile(int[][] map, String fileName) {
        File file = new File(fileName);
        try (PrintWriter pw = new PrintWriter(file)) {
            for ( int[] row : map ) {
                for ( int col : row ) {
                    char symbol = ' ';
                    switch (col) {
                        case 0:
                            symbol = ' ';
                            break;
                        case 1:
                            symbol = 'X';
                            break;
                        case 2:
                            symbol = '+';
                            break;
                        case 3:
                            symbol = '-';
                            break;
                        case 4:
                            symbol = '.';
                            break;
                    }
                    pw.print(symbol);
                }
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
