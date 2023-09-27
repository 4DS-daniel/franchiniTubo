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


        int scelta = 0;
        do {
            System.out.println("===========MENÙ===========\n");
            System.out.print("1) Calcola la base\n2) Calcola il volume\n3) Esci\nScelta: ");
            do {
                scelta = input.nextInt();
            } while (scelta > 3 || scelta < 1);
            
        } while (scelta != 3);





    }
}