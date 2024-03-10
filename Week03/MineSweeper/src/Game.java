// Mine sweeper game

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Game {
    int row, col, size, mine, rowMine, colMine, rowGame, colGame;
    String[][] gameMap;
    String[][] gameBoard;
    boolean isGameOver = false;

    public Game() {
        // Default constructor
    }

    public Game(int row, int col, int mine) {
        this.row = row;
        this.col = col;
        this.mine = mine;
        this.gameMap = new String[row][col];
        this.gameBoard = new String[row][col];
        initializeBoards(row,col);
        createMine(row,col);
        // Constuctor with parameters
    }

    public void initializeBoards(int row, int col) {
        // Initialize the game boards with " - "
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                gameMap[i][j] = " - "; // Initialize all cells with " - " for gameMap
                gameBoard[i][j] = " - "; // Initialize all cells with " - " for gameBoard
            }
        }
    }

    public void createMine(int r, int c) {
        // Create mines randomly on the game board
        Random random = new Random();
        int count = 0;

        while (count < mine) {
            rowMine = random.nextInt(r);
            colMine = random.nextInt(c);
            if (!Objects.equals(gameMap[rowMine][colMine], " * ")) {
                gameMap[rowMine][colMine] = " * ";
                count++;
            }
        }
        writeMapBoard();
        // Write the gameMap to the console
    }


    public void startGame() {
        // Start the game
        Scanner input = new Scanner(System.in);
        do {
            // Ask the user to enter the row and column
            System.out.print("Please write your game's row info: ");
            row = input.nextInt();
            System.out.print("Please write your game's col info: ");
            col = input.nextInt();
            System.out.print("Please write your game's mine info: ");
            mine = input.nextInt();
            size = row * col;
            // Check if the user input is valid
            if (row <= 2 || col <= 2 || mine < 0 || mine >= size) {
                System.out.println("Invalid input! Please try again!");
                System.out.println("\n....................");
                return;
            } else {
                // If the user input is valid, start the game
                runGame();

            }
        } while (row <= 2 || col <= 2 || mine < 0 || mine >= size); // Keep asking the user to enter the row and column until the input is valid
    }

    public int countMinesAround(int rowGame, int colGame) {
        // Count the number of mines around a cell
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = rowGame + i;
                int newCol = colGame + j;
                if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col) {
                    if (" * ".equals(gameMap[newRow][newCol])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public void runGame(){
        Game game = new Game(row, col, mine); // map board and game board are initialized
        game.writeGameBoard(); // write the game board to the console
        game.playGame(); // play the game

    }
    public void writeMapBoard() {
        // Write the gameMap to the console
        System.out.println("Map Board");
        for (String[] strings : gameMap) {
            for (String col : strings) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public void writeGameBoard() {
        // Write the gameBoard to the console
        System.out.println("Game Board");
        for (String[] strings : gameBoard) {
            for (String col : strings) {
                System.out.print(col);
            }
            System.out.println();
        }
    }


    public void playGame() {
        // Play the game
        Scanner input = new Scanner(System.in);
        boolean isGameOver = false;
        do {
            // Ask the user to enter the row and column
            System.out.print("Please write row info: ");
            rowGame = input.nextInt();
            System.out.print("Please write col info: ");
            colGame = input.nextInt();

            // Check if the user input is valid
            if (rowGame < 0 || colGame < 0 || rowGame >= row || colGame >= col) {
                System.out.println("Invalid input! Please write another row & col info!");
                System.out.println("\n....................");
                continue;
            }
            // Duplication check
            if (!Objects.equals(gameBoard[rowGame][colGame], " - ")) {
                System.out.println("You have already chosen this index, please try again!");
                System.out.println("\n....................");
                continue;
            }
            // If the user input is valid, play the game
            if (" * ".equals(gameMap[rowGame][colGame])) {
                failedGame();
                isGameOver = true;
            } else {
                // Count the number of mines around the cell
                int minesAround = countMinesAround(rowGame, colGame);
                gameBoard[rowGame][colGame] = " " + minesAround + " "; // Update the cell with the number of mines around it
                writeMapBoard();
                writeGameBoard();
                // Check if the user has won the game
                if (checkWin()) {
                    System.out.println("Yayy, you won!");
                    isGameOver = true;
                }
            }
        } while (!isGameOver); // Keep playing the game until the user wins or loses
    }


    public boolean checkWin() {
        // Check if the user has won the game
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!" * ".equals(gameMap[i][j]) && " - ".equals(gameBoard[i][j])) {
                    return false; // If there is a cell that is not a mine and is not revealed, the user has not won the game
                }
            }
        }
        return true; // If all cells except mines are revealed, the user has won the game
    }

    public void failedGame() {
        // Failed game
        System.out.println("Game Over! You hit a mine.");
        isGameOver = true; // Set the isGameOver flag to true to end the game
        writeMapBoard(); // Write the gameMap to the console
    }
}