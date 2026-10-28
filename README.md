# Student Grade Calculator

A small Java program that displays a student's name, major, and course, averages three assignment grades, and reports whether the student passed (average of 70 or higher).

## Requirements

- Java Development Kit (JDK) 17 or newer ([download](https://adoptium.net))
- Visual Studio Code with the **Extension Pack for Java**

Check your JDK is installed by running `java -version` and `javac -version` in a terminal.

## How to run in VS Code

1. Open VS Code and choose **File > Open Folder**, then select this project folder.
2. Open `StudentGradeCalculator.java`.
3. Click the **Run** button (the play icon at the top right of the editor), or click **Run** above the `main` method.
4. The output appears in the **Terminal** or **Debug Console** panel.

## How to run from a terminal

```bash
javac StudentGradeCalculator.java   # compiles the source into StudentGradeCalculator.class
java StudentGradeCalculator         # runs the compiled bytecode on the JVM
```

## Expected output

```
Student: Marcus Rivera
Major: Information Systems
Course: Mobile Application Development

Grade 1: 78.5
Grade 2: 64.0
Grade 3: 83.0
Average: 75.17
Status: Passed
```

## Testing

Change the three grade values near the top of `main`, run again, and compare:

| Grade 1 | Grade 2 | Grade 3 | Average | Expected status |
|---|---|---|---|---|
| 78.5 | 64 | 83 | 75.17 | Passed |
| 60 | 55 | 68 | 61.00 | Failed |
| 70 | 70 | 70 | 70.00 | Passed (exactly 70 counts as passing) |
| 70 | 70 | 69 | 69.67 | Failed |
