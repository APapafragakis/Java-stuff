# Sudoku Solver

This Java program is a Sudoku solver that can generate Sudoku boards and check their solvability. It uses a backtracking algorithm to solve Sudoku puzzles and ensures the generated boards are valid.

## Table of Contents

- [Usage](#usage)
- [Functionality](#functionality)
- [Dependencies](#dependencies)

## Usage

1. **Compile and Run:** Compile the program and run it with the following command:

    ```bash
    javac Sudoku.java
    java Sudoku
    ```

2. **Generating and Solving Sudoku Boards:**
    - The program includes a sample Sudoku board that you can modify in the `main` method (`board` array).
    - The `Create_Boards` method generates and solves multiple Sudoku boards with specified parameters.
    - The `CreateBoard` method generates a Sudoku board with a specified number of empty cells.

## Functionality

The program provides the following functionalities:

- **Sudoku Solving:** The program uses a backtracking algorithm to solve Sudoku puzzles.
- **Board Generation:** It can generate Sudoku boards with a specified number of empty cells.
- **Board Validity Check:** The program ensures that generated boards are valid Sudoku puzzles.

## Dependencies

- Java Development Kit (JDK)
