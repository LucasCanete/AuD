package de.hsos.aud;

public class MedianQuickSort extends Sequence{

    //declase median objtect as attribute
    private Median qs;

    public MedianQuickSort(int size) {
        super(size);
        qs = new Median(size);
    }

    public MedianQuickSort(String fName) {
        super(fName);
        qs = new Median(fName);
    }

    //Aus QuickSortRekursiv
    @Override
    public void sort() {
        this.sort(1, super.getN());
        //this.sort(0, super.getN() - 1);
    }


    public void sort(int start, int end) {
        System.out.print("Start: " +Integer.toString(start)+" End: "+Integer.toString(end)+ "\n");
        int no_elem = (end - start) + 1;
        if (no_elem <= 1){
            return;
        }

        int[] sub = new int[no_elem];
        for (int i = 0; i < no_elem; i++) {
            sub[i] = a[i];
        }
       
        /* Wichtig: Pivot-Element merken */
        //int pivot = super.a[start + (no_elem / 2)]; //original
        int pivotIndex = qs.find_kth(sub, no_elem / 2);
        System.out.print("Found pivot Index :" +Integer.toString(pivotIndex) + "\n");
        //int pivot = super.a[pivotIndex];
         int pivot = sub[pivotIndex];
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


    public static void run_test(String fName){
        MedianQuickSort qs = new MedianQuickSort(fName);
        qs.run_sort(fName);
    }
}
