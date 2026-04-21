package de.hsos.aud;

public class QuickSortRekursiv extends Sequence {
     public QuickSortRekursiv(int size) {
        super(size);
    }

    public QuickSortRekursiv(String fName) {
        super(fName);
    }

    @Override
    public void sort() {
        this.sort(1, super.getN());
    }

    public void sort(int start, int end) {
        int no_elem = (end - start) + 1;
        if (no_elem <= 1){
            return;
        }
        /* Wichtig: Pivot-Element merken */
        int pivot = super.a[start + (no_elem / 2)];
        int low = start;
        int high = end;
        do {
            while (super.a[low] < pivot){
                low++;
            }
            while (super.a[high] > pivot){
                high--;
            }
            if (low <= high) {
                super.swap(low, high);
                low++;
                high--;
            }
        } while (high >= low);
        this.sort(start, high);
        this.sort(low, end);
    }

    /**
     * @param fName Datei mit zu sortierenden Daten.
     */
    public static void run_test(String fName) {
        QuickSortRekursiv qs = new QuickSortRekursiv(fName);
        qs.run_sort(fName);
    }

    
}
