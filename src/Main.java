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
            System.out.print("1) Calcola la base\n2) Calcola il volume\n3) Imposta l'altezza\n4) Imposta il raggio\n5) Esci\nScelta: ");
            do {
                scelta = input.nextInt();
            } while (scelta > 5 || scelta < 1);

            switch (scelta) {
                case 1:
                    System.out.println("Ecco la base: " + tubo.calcoloBase());
                    break;
                case 2:
                    System.out.println("Ecco il volume: " + tubo.volume());
                    break;
                case 3:
                    System.out.print("Imposta l'altezza: ");
                    altezza = input.nextFloat();
                    tubo.setAltezza(altezza);
                    break;
                case 4:
                    System.out.print("Imposta il raggio: ");
                    raggio = input.nextFloat();
                    tubo.setRaggio(raggio);
                    break;
                case 5:
                    System.out.println("Grazie per aver usato il programma!");
                    break;
            }
        } while (scelta != 5);





    }
}