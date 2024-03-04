import java.util.Scanner;

public class Esercizio3 {

    public static double perimetroRettangolo(double lunghezza1, double lunghezza2){
        return 2 * (lunghezza1 + lunghezza2);
    }

    public static int pariDispari(int numero){
        if(numero % 2 == 0){
            return 0;
        } else{
            return 1;
        }
    }

    public static double perimetroTriangolo(double lato1, double lato2, double lato3){
        double semiperimetro = (lato1 + lato2 + lato3) /2;
        return 2 * semiperimetro;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la lunghezza del primo lato del rettangolo: ");
        double lunghezza1 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del rettangolo: ");
        double lunghezza2 = scanner.nextDouble();
        double perimetroRettangolo = perimetroRettangolo(lunghezza1, lunghezza2);
        System.out.println("Il perimetro del rettangolo è:" + perimetroRettangolo);

        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt();
        int risultatoPariDispari = pariDispari(numero);
        if (risultatoPariDispari == 0){
            System.out.println("Il numero è pari.");
        }else {
            System.out.println("Il numero è dispari.");
        }
        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double lato1 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double lato2 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del terzo lato del triangolo");
        double lato3 = scanner.nextDouble();
        double perimetroTriangolo = perimetroTriangolo(lato1, lato2, lato3);
        System.out.println("Il perimetro del triangolo è: "+perimetroTriangolo);

        scanner.close();
    }
}
