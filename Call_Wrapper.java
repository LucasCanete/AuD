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
        SelectionSort.run_test("data/TestSuite1/sample3_no_dups.txt");
        SelectionSort.run_test("data/TestSuite1/sample4_no_dups.txt");
        SelectionSort.run_test("data/TestSuite1/sample5_no_dups.txt");
        SelectionSort.run_test("data/TestSuite1/sample6_no_dups.txt");
        SelectionSort.run_test("data/TestSuite1/sample7_no_dups.txt");
        SelectionSort.run_test("data/TestSuite1/sample8_no_dups.txt");
        SelectionSort.run_test("data/TestSuite1/sample9_no_dups.txt");
        SelectionSort.run_test("data/TestSuite1/sample10_no_dups.txt");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        run_selection_sort();
        // run_quick_sort();
    }
}
