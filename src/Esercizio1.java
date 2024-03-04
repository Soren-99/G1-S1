

public class Esercizio1 {


    public static void main(String[] args){
        int result1 = moltiplica(3,5);
        System.out.println("Risultato della moltiplicazone: " + result1);

        String result2 = concatena("Hello", 123);
        System.out.("Stringa concatenata: " + result2);

        String[] arrayOriginale = {"uno", "due", "tre", "quattro", "cinque" };
        String[] newArray = inserisciInArray(arrayOriginale, "nuovo");
        System.out.print("Nuovo array: ");
        for (String str: newArray){
            System.out.print(str +" ");
        }
    }

    public static int moltiplica(int a, int b){
        return a * b;
    }

    public static String concatena(String str, int num){
        return str + num;
    }

    public static String[] inserisciInArray(String[] array, String str){
        String[] newArray = new String[6];
        for (int i=0; i<6; i++){
            if (i<2) {
                newArray[i] = array[i];
            }else if (i == 2){
                newArray[i] = str;
            }else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }
}
