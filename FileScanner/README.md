# FileStats

The `FileStats` program is a Java application that recursively scans a directory, counting the number of files and directories. Additionally, it identifies and collects image files, creating an HTML file with image tags for visualization.

## Table of Contents

- [Features](#features)
- [Usage](#usage)
- [Dependencies](#dependencies)
- [Output](#output)
- [Running the Program](#running-the-program)

## Features

1. **Counting Files and Directories:**
   - Recursively scans a directory and counts the number of files and directories.

2. **Identifying Images:**
   - Determines whether a file is an image based on its content type.
   - Creates an HTML file with image tags for visualization.

## Usage

The program can be used to analyze the structure of a directory, count files and directories, and generate an HTML file to display images.

## Dependencies

- Java
- [MimetypesFileTypeMap](https://docs.oracle.com/en/java/javase/11/docs/api/javax/activation/MimetypesFileTypeMap.html)
- [Swing (JFileChooser)](https://docs.oracle.com/javase/8/docs/api/javax/swing/JFileChooser.html)

## Output

The program outputs the following information:
- Number of directories.
- Number of files.

Additionally, it generates an HTML file (`images.html`) containing image tags for all identified images.

## Running the Program

1. **Compile the Program:**
   ```bash
   javac FileStats.java
