import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}

// CW4: WAP to read a number and check number is +ve or -ve

// CW1: WAP to read name from command line argument and print
// Hello <Username>

// CW2: WAP to read 2 numbers and print addition in following format
// java Add.java 5 6
// 5 + 6 = 11

// CW3: WAP to read a number using Scanner and print cube of that number
// java Cube.java
// Enter a number: 5
// Cube of 5 is 125

// PascalCase => ClassName FileName.java
// camelCase => functionName
// snake_case => variable_name
// kebab-case => file-name.html company-log
