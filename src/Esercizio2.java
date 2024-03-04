
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa:");
        String stringa1 = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String stringa2 = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String stringa3 = scanner.nextLine();

        String concatenazioneInserimento = stringa1 + stringa2 + stringa3;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneInserimento);

        String concatenazioneInserimentoInverso = stringa3 + stringa2 + stringa1;
        System.out.println("Concatenazione in ordine di inserimento inverso: " + concatenazioneInserimentoInverso);

        scanner.close();
    }


}
