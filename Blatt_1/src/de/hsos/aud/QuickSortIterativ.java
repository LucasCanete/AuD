package de.hsos.aud;

class QuickSortIterativ extends Sequence{
    

    //constructor
    public QuickSortIterativ (int size)   {
        super(size);
    }

    public QuickSortIterativ (String fName)   {

        super(fName);
    }

    @Override
    //aus der Vorlesung
    public void sort() {
        int stack_l[] = new int [10000];
        int stack_r[] = new int [10000];
        int k = 0; /* Anzahl der gespeicherten Bereiche */
        int l = 1;
        int r = super.n; /* Grenzen des aktuellen Bereichs */
        while ((l < r) || (k > 0)) { /* noch etwas zu sortieren? */
            if(!(l < r)) { /* also k>0 -> gespeicherten Bereich verarbeiten */
                l = stack_l[k]; 
                r = stack_r[k]; 
                k--;
            }
        int s = super.split (a, l, r); /* Aufteilung mit a[(l+r)/2] als Pivot */
            if ((r - l) >= 2) { /* mindestens drei Elemente */
                if ((s - l) > (r - s)) { /* grösseren -> linken Bereich merken */
                    k = k+1;
                    stack_l[k] = l;
                    stack_r[k] = s-1;
                    l = s + 1; /* rechten Bereich sofort verarbeiten */
                } 
                else { /* rechten Bereich merken */
                    k = k+1; 
                    stack_l[k] = s + 1;
                    stack_r[k] = r;
                    r = s - 1; /* linken Bereich sofort verarbeiten */
                }
        } 
        else {
            l = r; /* weniger als 3 Elemente: Folge nach split() sortiert! */
        }
        }

    }

    public static void run_test(String fName){
        QuickSortIterativ qs = new QuickSortIterativ(fName);
        qs.run_sort(fName);
    }

}
