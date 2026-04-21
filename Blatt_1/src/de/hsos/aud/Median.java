package de.hsos.aud;

public class Median extends Sequence{
    public Median(int size) {
        super(size);
    }

    public Median(String fName) {
        super(fName);
    }

    public int find_kth (int a[], int k) { /* Feld a[1...n] */
        int l = 1; /* linke Bereichsgrenze */
        int r = n; /* rechte Bereichsgrenze = n */
        do {
            int p = super.split(a, l, r);
            if (p < k) {
                /* k-tes im oberen Teilbereich suchen */
                /* linke Suchbereichsgrenze anpassen */
                l = p + 1;
            } else if (p == k) {/* jetzt Volltreffer, d.h. p == k: */
                return (p);
            } else {
                /* k < p -> im unteren Bereich suchen */
                /* rechte Suchbereichsgrenze anpassen */
                r = p - 1;
            }
        } while (true);
    }

    @Override
    public void sort() {
        int k = super.n/2;
        int index = find_kth(a, k);
        int median = a[index];
        System.out.print("N is: " + Integer.toString(super.n) + " Index of Median is: "+ Integer.toString(index)+ "\n");
        System.out.print("Median is: " + Integer.toString(median) + "\n");
        
    }
    
    public static void run_test(String fName){
        Median qs = new Median(fName);
        qs.run_sort(fName);
    }
    
}
