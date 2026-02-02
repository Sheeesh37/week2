//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main(String[] args) {
    //Random rand = new Random();
    //int num = rand.nextInt(10) + 1;
    // double num2 = rand.nextDouble() * (8.5 - 5.5) + 5;
    //System.out.println(num);
    // System.out.println(num2);
    //int a = 15;
    //if (a > 18) {
    // System.out.println("Eligible to drive\n");
    // } else {
    //System.out.println("Not eligible to drive\n");
    //switch (a) {
    //case 1:
    //  System.out.println(a);
    //break;
    //default:
    //System.out.println("Default");
    //for (int i = 0; i <= 10; i++) {
    //System.out.println(i * i);
    // }
    //int b;
    //Scanner input = new Scanner(System.in);
    // do {
    //  b = input.nextInt();
    //System.out.println(b);
    // } while (b < 10);
    //}
    //}

    //problem1
    int sum = 0;
    for (String num : args) {
        sum += Integer.parseInt(num);
    }
    System.out.println("Sum=" + sum);

    //problem2
    Scanner input = new Scanner(System.in);
    int r = input.nextInt(10 - 1);
    double l = 2 * (Math.PI) * r;
    double s = (Math.PI) * r * r;
    System.out.println("The circumference is" + l);
    System.out.println("The area is" + s);

//problem3
    int score = input.nextInt();
    if (score >= 90 && score <= 100) {
        System.out.println("Grade:A");
    }
    if (score >= 80 && score <= 89) {
        System.out.println("Grade:B");
    }
    if (score >= 70 && score <= 79) {
        System.out.println("Grade:C");
    }
    if (score >= 60 && score <= 69) {
        System.out.println("Grade:D");
    }
    if (score >= 0 && score <= 59) {
        System.out.println("Grade:F");
    }
    if (score > 100) {
        System.out.println("Invalid score");
    }

    //problem4
    double w = input.nextDouble();
    double h = input.nextDouble();
    double BMI = w / (h * h);
    if (BMI < 18.5) {
        System.out.println("Underweight");
    }
    if (BMI >= 18.5 && BMI <= 24.9) {
        System.out.println("Normal weight");
    }
    if (BMI >= 25 && BMI <= 29.9) {
        System.out.println("Overweight");
    }
    if (BMI >= 30) {
        System.out.println("Obese");


        //problem5
        int n;
        n = input.nextInt();
        int SUM = 0;
        System.out.println("Enter n(n>1)");
        for (int i = 1; i <= n; i++) {
            SUM += i * i;
        }
        System.out.println("Sum=" + SUM);


    }
}



