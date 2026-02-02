//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
void main() {
    Random rand = new Random();
    int num = rand.nextInt(10) + 1;
    double num2 = rand.nextDouble() * (8.5 - 5.5) + 5;
    System.out.println(num);
    System.out.println(num2);
    int a = 19;
    if (a > 18) {
        System.out.println("Eligible to drive\n");
    } else {
        System.out.println("Not eligible to drive\n");
        switch (a) {
            case 1:
                System.out.println(a);
                break;
            default:
                System.out.println("Default");
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i * i);
                }
                int b = 0;
                Scanner input = new Scanner(System.in);
                do {
                    b = input.nextInt();
                    System.out.println(b);
                } while (b < 10);
                }
        }
    }
