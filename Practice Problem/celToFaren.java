import java.util.Scanner;

public class celToFaren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cel = sc.nextDouble();
        System .out.println("Farenhite = "+ ((cel*9/5)+32));
    }
}
