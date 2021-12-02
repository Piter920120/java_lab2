import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */  int tablica1 = 21;
            int tab1[] = new int[tablica1];
            dokonczTablice(tab1);
            wyswietlTablice(tab1);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        String[] tablica2 = new String[6];
        dokonczTablice2(tablica2);
        wyswietlTablice2(tablica2);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

            String imie = "Piotr";
            String nazwisko = "Rynkowski";
            int wiek = 29;
            wyswietlDane(imie);
            wyswietlDane(imie + nazwisko);
            wyswietlDane(imie + nazwisko + wiek);
        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        int a = 1;
        int b = 2;
        int c = 3;
        int sumaA = dodajSume(a,b);
        int sumaB = dodajSume(a , b, c);

        System.out.println("Suma wywołań obu metod: " + dodajSume(a,b) + " + " + dodajSume(a,b,c));
    }

    public static int[] dokonczTablice(int[] tab1)
    {
        int j = 0;
        for (int i = 40; i  >= 20; i-- )
        {
            tab1[j] = i;
            System.out.print(tab1[i] + " ");
            j++;
            if(j > tab1.length)
                break;
        }
        return tab1;
    }

    public static void wyswietlTablice(int[] tab1) {
        for (int i = 0; i < tab1.length; i++)
            System.out.print(tab1[i] + " ");
    }

    public static String[] dokonczTablice2( String[] tablica2)
    {
        Scanner scanner = new Scanner(System.in);
        int wyraz = 1;
        for(int i = 0; i < tablica2.length; i++)
        {
            System.out.println("Podaj wyraz nr " + wyraz + "i wcisnij enter" );
            tablica2[i] = scanner.nextLine();
            wyraz++;
        }
        return  tablica2;
    }
        public static void wyswietlTablice2(String[] tablica2)
        {
            System.out.println(" Słowa w odwrotnej kolejnosci : ");
                    for(int i = tablica2.length; i >= 0; i--)
                    {
                        System.out.print(tablica2[i]);
                    }
        }

        public static void wyswietlDane(String imie)
        {
            System.out.println("podaj imie " + imie);
        }
    public static void wyswietlDane(String imie, String nazwisko)
    {
        System.out.println("podaj imie  " + imie + " nazwisko " + nazwisko);
    }

    public static void wyswietlDane(String imie, String nazwisko, int wiek)
    {
        System.out.println("podaj imie " + imie + " nazwisko "+nazwisko + "wiek " + wiek);
    }


    public static int dodajSume(int a , int b)
    {
        return a + b;
    }
    public static int dodajSume(int a, int b, int c)
    {
        return a + b + c;
    }

}
