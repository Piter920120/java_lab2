public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
    for (int i = 0; i <= 10; i++) {
            if (i % 4 == 0)
                continue;
            System.out.print(i + " ");
        }
        for (int i = 0; i <= 50; i++) {
            if (i == 18)
                break;
            System.out.print(i + " ");
        } for (int i = 0; i <= 60; i++) {
            if (i == 25)
                return;
            System.out.print(i + " ");
        }

    }
}
