import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Tubo tubo = null;
        float raggio = 0;
        float altezza = 0;
        boolean flag = false;

        do {
            System.out.print("Inserire il raggio del tubo: ");
            raggio = input.nextFloat();
            System.out.print("\n\nInserire l'altezza delo tubo: ");
            altezza = input.nextFloat();
            try {
                tubo = new Tubo(raggio,altezza);
                flag = true;
            } catch (Exception e) {
                System.out.println("Valori non validi");
            }
        } while (!flag);







    }
}