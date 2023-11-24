import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class Sudoku {

    private static final int BOARD_SIZE = 9;
    private static final int SUBSECTION_SIZE = 3;
    private static final int BOARD_START_INDEX = 0;

    private static final int NO_VALUE = 0;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 9;

    private static int[][]Board;

    private static int[][] board = {
            {8, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 3, 6, 0, 0, 0, 0, 0},
            {0, 7, 0, 0, 9, 0, 2, 0, 0},
            {0, 5, 0, 0, 0, 7, 0, 0, 0},
            {0, 0, 0, 0, 4, 5, 7, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 3, 0},
            {0, 0, 1, 0, 0, 0, 0, 6, 8},
            {0, 0, 8, 5, 0, 0, 0, 1, 0},
            {0, 9, 0, 0, 0, 0, 4, 0, 0}
    };

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Sudoku solver = new Sudoku();
        if(!solver.isSolvableBoard(board)){
            System.out.println("Invalid board");
        }
        solver.Create_Boards(5,75);
        long end = System.currentTimeMillis();
        float sec = (end - start) / 1000F;
        System.out.println(sec + " seconds");
        //solver.Print_Board(solver.CreateBoard(10));
        //solver.solve(board);
        //solver.printBoard();
    }

    public void Print_Board(int[][] brd){
        for (int row = BOARD_START_INDEX; row < BOARD_SIZE; row++) {
            for (int column = BOARD_START_INDEX; column < BOARD_SIZE; column++) {
                System.out.print(brd[row][column] + " ");
            }
            System.out.println();
        }
    }

    public void Create_Boards(int N, int x){
        int i=0;
        int invalid_count=0;
        if(x>=0 && x<=81){
            CreateBoard(x);
            while(i<N) {
                System.out.println("Board " + (i + 1));
                Print_Board(Board);
                if (isSolvableBoard(Board)) {
                    System.out.println("Solution of Board " + (i + 1));
                    Print_Board(Board);
                    i++;
                } else {
                    invalid_count++;
                }
                CreateBoard(x);
            }
            System.out.println("Invalid boards: " + invalid_count);
            System.out.println("Valid boards: " + i);
        }else {
            System.out.println("Wrong input for x");
        }
    }
    public int[][] CreateBoard(int x){
        Board = new int[9][9];
        int col = 0;
        int row = 0;
        Random randomGenerator = new Random();
        for(int i = 0; i<81-x; i++){
            int randomInt = randomGenerator.nextInt(MAX_VALUE-MIN_VALUE+1) + MIN_VALUE;
            int randomI = randomGenerator.nextInt(MAX_VALUE-MIN_VALUE) + MIN_VALUE;
            int randomJ = randomGenerator.nextInt(MAX_VALUE-MIN_VALUE) + MIN_VALUE;
            while (Board[randomI][randomJ] != 0){
                randomI = randomGenerator.nextInt(MAX_VALUE-MIN_VALUE) + MIN_VALUE;
                randomJ = randomGenerator.nextInt(MAX_VALUE-MIN_VALUE) + MIN_VALUE;
            }
            Board[randomI][randomJ] = randomInt;
        }
        return Board;
    }
    public boolean isSolvableBoard(int[][] brd){
        if(solve(brd) && isValidBoard(brd)) {
            return true;
        }
        return false;
    }

    public boolean isValidBoard(int[ ][ ] brd){
        for(int i = 0; i < 9; i++){                 //checks rows
            for(int j = 0; j < 9; j++){
                if(brd[i][j]<0 || brd[i][j]>9){
                    return false;
                }else if(brd[i][j]!=0){
                    for(int k = j+1; k < 9; k++){
                        if(brd[i][j] == brd[i][k]){
                            return false;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < 9; i++){                 //checks columns
            for(int j = 0; j < 9; j++){
                if(brd[i][j]<0 || brd[i][j]>9){
                    return false;
                }else if(brd[i][j]!=0){
                    for(int k = i+1; k < 9; k++){
                        if(brd[i][j] == brd[k][j]){
                            return false;
                        }
                    }
                }
            }
        }
        for(int i=0; i<9; i++){                         //checks 3x3 box
            for(int j=0; j<9; j++){
                int count=0;
                int row,col;
                row = i - i%3;
                col = j - j%3;
                for(int k = row; k<row+3; k++){
                    for(int g = col; g<col+3; g++){
                        if(brd[i][j] == brd[k][g] && brd[k][g]!=0){
                            count++;
                        }
                    }
                }
                if(count>1){
                    return false;
                }
            }
        }
        return true;
    }

    private void printBoard() {
        for (int row = BOARD_START_INDEX; row < BOARD_SIZE; row++) {
            for (int column = BOARD_START_INDEX; column < BOARD_SIZE; column++) {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }

    private boolean solve(int[][] board) {
        for (int row = BOARD_START_INDEX; row < BOARD_SIZE; row++) {
            for (int column = BOARD_START_INDEX; column < BOARD_SIZE; column++) {
                if (board[row][column] == NO_VALUE) {
                    for (int k = MIN_VALUE; k <= MAX_VALUE; k++) {
                        board[row][column] = k;
                        if (isValid(board, row, column) && solve(board)) {
                            return true;
                        }
                        board[row][column] = NO_VALUE;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int[][] board, int row, int column) {
        return rowConstraint(board, row) &&
                columnConstraint(board, column) &&
                subsectionConstraint(board, row, column);
    }

    private boolean subsectionConstraint(int[][] board, int row, int column) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        int subsectionRowStart = (row / SUBSECTION_SIZE) * SUBSECTION_SIZE;
        int subsectionRowEnd = subsectionRowStart + SUBSECTION_SIZE;

        int subsectionColumnStart = (column / SUBSECTION_SIZE) * SUBSECTION_SIZE;
        int subsectionColumnEnd = subsectionColumnStart + SUBSECTION_SIZE;

        for (int r = subsectionRowStart; r < subsectionRowEnd; r++) {
            for (int c = subsectionColumnStart; c < subsectionColumnEnd; c++) {
                if (!checkConstraint(board, r, constraint, c)) return false;
            }
        }
        return true;
    }

    private boolean columnConstraint(int[][] board, int column) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        return IntStream.range(BOARD_START_INDEX, BOARD_SIZE)
                .allMatch(row -> checkConstraint(board, row, constraint, column));
    }

    private boolean rowConstraint(int[][] board, int row) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        return IntStream.range(BOARD_START_INDEX, BOARD_SIZE)
                .allMatch(column -> checkConstraint(board, row, constraint, column));
    }

    private boolean checkConstraint(int[][] board, int row, boolean[] constraint, int column) {
        if (board[row][column] != NO_VALUE) {
            if (!constraint[board[row][column] - 1]) {
                constraint[board[row][column] - 1] = true;
            } else {
                return false;
            }
        }
        return true;
    }
}