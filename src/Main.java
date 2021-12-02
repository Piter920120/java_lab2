import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        ArrayList<String>  lista1 = new ArrayList<>();
        dodajZwierze(lista1);
        zlapZwierze(lista1);
        sortujZwierze(lista1);

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        Set<Integer> numery = new TreeSet<>();
        dodajNumer(numery);
        sortujNumer(numery);
        zlapNumer(numery);

    }

    public static void dodajZwierze(List<String> lista1){
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0 ; i < 6; i++)
        {
            System.out.println("podaj zwierze : ");
            String zwierze = scanner.nextLine();
            lista1.add(zwierze);
        }


    }

    public static void zlapZwierze(List<String> lista1){
        System.out.println("\nZwierze : ");
        for(String zmienna : lista1){
            System.out.print(zmienna);
        }
    }

    public static void sortujZwierze(List<String>lista1){
        Collections.sort(lista1, Collections.reverseOrder());
    }


    public static void dodajNumer(Set<Integer> numery)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i  = 0; i < 10; i++){
            System.out.println("Podaj numer: ");
            int numer = scanner.nextInt();
            numery.add(numer);
        }
    }

    public static void sortujNumer(Set<Integer> numery)
    {
        Iterator<Integer> i = numery.iterator();
        while (i.hasNext());
        i.next();
    }

    public static void zlapNumer(Set<Integer> numery){
        System.out.println("\nLiczby: ");
        for(Integer a: numery){
            System.out.println(a);
        }
    }
}
