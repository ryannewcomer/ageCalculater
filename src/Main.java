import java.time.Year;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your birth year:");
        int birth = scanner.nextInt();
        int year = Year.now().getValue();
        int age = year - birth;
        System.out.println("You are: " + age + " years old");
    }
}
