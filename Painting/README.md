# Palindrome Checker

This Java program checks whether a given sentence is a palindrome or not. It removes diacritical marks, converts the sentence to lowercase, and removes non-alphanumeric characters before checking for palindrome property.

## Table of Contents

- [Usage](#usage)
- [Functionality](#functionality)
- [Dependencies](#dependencies)

## Usage

1. **Compile and Run:** Compile the program and run it with the following command:

    ```bash
    javac Ask2.java
    java Ask2
    ```

2. **Input:** Enter a sentence when prompted.

3. **Output:** The program will output whether the entered sentence is a palindrome or not and the execution time in nanoseconds.

## Functionality

The program employs the following steps to determine if a sentence is a palindrome:
   - Removes diacritical marks from characters.
   - Converts the sentence to lowercase.
   - Removes non-alphanumeric characters.
   - Checks if the modified sentence reads the same backward as forward.

## Dependencies

- Java Development Kit (JDK)
