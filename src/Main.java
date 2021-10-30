public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int i = 1000;
        System.out.println("\n");

        do
        {
            if (i % 77 == 0)
            {
                System.out.printf( " liczba %d - podzielna przez 77 \n",i);
            }
            System.out.println(i);

        } while (--i > 0);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        int tab1[] = new int[5];
        int j = tab1[0];
        tab1[0] = 29;
        tab1[1]=21;
        tab1[2]=3;
        tab1[3]=100;
        tab1[4]=1;
        System.out.println("\n");
        while (tab1[j] > 0) {
            System.out.println(tab1[j]);
            j++;
        }







        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


        }
    }
