package de.hsos.aud;

/**
 *
 * Konfiguration aus Ausfuehrung von Laufzeittest. Aufruf der Klassen erfolgt
 * ueber statische Methoden.
 * 
 * @author heikerli
 */
public class Call_Wrapper {

    public static void run_selection_sort() {
        /* TODO: Ggf. Pfade zu den Test-Dateien anpassen. */
        SelectionSort.run_test("data/TestSuite1/sample1_no_dups.txt");
        SelectionSort.run_test("data/TestSuite1/sample2_no_dups.txt");
        // SelectionSort.run_test("data/TestSuite1/sample3_no_dups.txt");
        // SelectionSort.run_test("data/TestSuite1/sample4_no_dups.txt");
        // SelectionSort.run_test("data/TestSuite1/sample5_no_dups.txt");
        // SelectionSort.run_test("data/TestSuite1/sample6_no_dups.txt");
        // SelectionSort.run_test("data/TestSuite1/sample7_no_dups.txt");
        // SelectionSort.run_test("data/TestSuite1/sample8_no_dups.txt");
        // SelectionSort.run_test("data/TestSuite1/sample9_no_dups.txt");
        // SelectionSort.run_test("data/TestSuite1/sample10_no_dups.txt");

        
    }

    public static void run_median() {
        /* TODO: Ggf. Pfade zu den Test-Dateien anpassen. */
        Median.run_test("data/TestSuite1/sample1_no_dups.txt");
        Median.run_test("data/TestSuite1/sample2_no_dups.txt");
        Median.run_test("data/TestSuite1/sample3_no_dups.txt");
        Median.run_test("data/TestSuite1/sample4_no_dups.txt");
        Median.run_test("data/TestSuite1/sample5_no_dups.txt");
        Median.run_test("data/TestSuite1/sample6_no_dups.txt");
        Median.run_test("data/TestSuite1/sample7_no_dups.txt");
        Median.run_test("data/TestSuite1/sample8_no_dups.txt");
        Median.run_test("data/TestSuite1/sample9_no_dups.txt");
        Median.run_test("data/TestSuite1/sample10_no_dups.txt");

        
    }

    public static void run_quick_sort_iterativ() {
        /* TODO: Ggf. Pfade zu den Test-Dateien anpassen. */
        QuickSortIterativ.run_test("data/TestSuite1/sample1_no_dups.txt");
        QuickSortIterativ.run_test("data/TestSuite1/sample2_no_dups.txt");
        QuickSortIterativ.run_test("data/TestSuite1/sample3_no_dups.txt");
        QuickSortIterativ.run_test("data/TestSuite1/sample4_no_dups.txt");
        QuickSortIterativ.run_test("data/TestSuite1/sample5_no_dups.txt");
        QuickSortIterativ.run_test("data/TestSuite1/sample6_no_dups.txt");
        QuickSortIterativ.run_test("data/TestSuite1/sample7_no_dups.txt");
        QuickSortIterativ.run_test("data/TestSuite1/sample8_no_dups.txt");
        QuickSortIterativ.run_test("data/TestSuite1/sample9_no_dups.txt");
        QuickSortIterativ.run_test("data/TestSuite1/sample10_no_dups.txt");

        
    }

    public static void run_quick_sort_rekursiv() {
        /* TODO: Ggf. Pfade zu den Test-Dateien anpassen. */
        QuickSortRekursiv.run_test("data/TestSuite1/sample1_no_dups.txt");
        QuickSortRekursiv.run_test("data/TestSuite1/sample2_no_dups.txt");
        // QuickSortRekursiv.run_test("data/TestSuite1/sample3_no_dups.txt");
        // QuickSortRekursiv.run_test("data/TestSuite1/sample4_no_dups.txt");
        // QuickSortRekursiv.run_test("data/TestSuite1/sample5_no_dups.txt");
        // QuickSortRekursiv.run_test("data/TestSuite1/sample6_no_dups.txt");
        // QuickSortRekursiv.run_test("data/TestSuite1/sample7_no_dups.txt");
        // QuickSortRekursiv.run_test("data/TestSuite1/sample8_no_dups.txt");
        // QuickSortRekursiv.run_test("data/TestSuite1/sample9_no_dups.txt");
        // QuickSortRekursiv.run_test("data/TestSuite1/sample10_no_dups.txt");

        
    }



    public static void run_median_quick_sort() {
        /* TODO: Ggf. Pfade zu den Test-Dateien anpassen. */
        MedianQuickSort.run_test("data/TestSuite1/sample1_no_dups.txt");
        MedianQuickSort.run_test("data/TestSuite1/sample2_no_dups.txt");
        // QuickSort.run_test("data/TestSuite1/sample3_no_dups.txt");
        // QuickSort.run_test("data/TestSuite1/sample4_no_dups.txt");
        // QuickSort.run_test("data/TestSuite1/sample5_no_dups.txt");
        // QuickSort.run_test("data/TestSuite1/sample6_no_dups.txt");
        // QuickSort.run_test("data/TestSuite1/sample7_no_dups.txt");
        // QuickSort.run_test("data/TestSuite1/sample8_no_dups.txt");
        // QuickSort.run_test("data/TestSuite1/sample9_no_dups.txt");
        // QuickSort.run_test("data/TestSuite1/sample10_no_dups.txt");

        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // System.out.print("Running SelectionSort\n");
        // run_selection_sort();
        // System.out.print("\n");

        System.out.print("Running Median\n");
        //find the element n/2 if array was ordered (but do not order it)
        run_median();
        System.out.print("\n");

        // System.out.print("Running QuickSort Iterativ\n");
        // run_quick_sort_iterativ();
        // System.out.print("\n");

        // System.out.print("Running QuickSort Rekursiv\n");
        // run_quick_sort_rekursiv();
        // System.out.print("\n");


        //System.out.print("Running MedianQuickSort\n");
        //run_median_quick_sort();

        
    }
}
