
//Aufgabe 1:
//Use 2. Ansatz

// class MedianArray{
//     //attributes
//     int a []; //array
//     int n; //length


//     //constructor
//     public MedianArray(int[] arr) {
//         this.a = arr;
//         this.n = arr.length;
//     }

//     public void swap(int i, int j){
//         int tmp = a[i];
//         a[i] = a[j];
//         a[j] = tmp;
//     }

//     //from the Muster Protokoll
//     public void sort() {
//         for (int i = 1; i <= n - 1; i++) {
//             int min_i = i;
//             for (int j = i + 1; j <= n; j++) {
//                 if (a[j] < a[min_i]) {
//                     min_i = j;
//                 }
//             }
//             this.swap(min_i, i);
//         }
//     }
    
//     //only callable method
//     public int getMedian(){
//         this.sort();
//         return a[n/2];
//     }



// }

//Aufgabe 1
class MedianArray{

    //attributes
    int a []; //array
    int n; //length


    //constructor
    public MedianArray(int[] arr) {
        this.a = arr;
        this.n = arr.length;
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private int split(int a[], int l, int r) {
        int p = (l + r) / 2;  // pivot: central element
        this.swap(a, p, l);        // put pivot at the beginning
        p = l;
        for (int i = l + 1; i <= r; i++) {
            if (a[i] <= a[p]) {
                swap(a, i, p + 1);
                swap(a, p, p + 1);
                p = p + 1;
            }
        }
        return p;
    }


    public int find_kth(int a[], int k) { 
        int l = 0; //1;  // left
        int r = a.length -1; //a.length;  //(n) right
        do {
            int p = split(a, l, r);
            if (p < k) {
                l = p + 1;        // look on the right halfr
            } else if (p == k) {
                return p;         // pivot is the kth
            } else {
                r = p - 1;        // look on the left half
            }
        } while (true);
    }

}

//Aufgabe 2
// class QuickSort extends Sequence{
//     //attributes
//     int a []; //array
//     int n; //length

//     //constructor
//     public QuickSort (int size)   {
//         // this.a = arr;
//         // this.n = arr.length;
//         super(size);
//     }

//     public QuickSort (String fName)   {
//         // this.a = arr;
//         // this.n = arr.length;
//         super(fName);
//     }

//     private void swap(int[] a, int i, int j) {
//         int tmp = a[i];
//         a[i] = a[j];
//         a[j] = tmp;
//     }

//     //aus der Vorlesung
//     public void sort(int start, int end) {
//         int no_elem = (end - start) + 1;
//         if (no_elem <= 1) return;
//         /* Wichtig: Pivot-Element merken */
//         int pivot = a[start + (no_elem / 2)];
//         int low = start; int high = end;
//         do {
//             while (a[low] < pivot) low++;
//             while (a[high] > pivot) high--;
//             if (low <= high) {
//                 this.swap (a,low, high);
//                 low++; high--;
//             }
             
//         }while (high >= low);
//         this.sort(start, high);
//         this.sort(low, end);
//     }

//     public static void run_test(String fName){
//         QuickSort qs = new QuickSort(fName);
//         qs.run_sort(fName);
//     }

// }


//Aufgabe 3
//Median Algorithmus in Quicksort implementieren und verbessern
public class main {
    public static void main(String[] args) {
        //int[] data = {7, 2, 5, 3, 1};
        // int [] data = {7, 2, 5, 3, 1,4,12,11,15};
        // int n = data.length;
        // MedianArray arr = new MedianArray(data);

        // int k = data.length / 2;
        // int med_index = arr.find_kth(data, k); // +1 si estás usando 1-based indexing
        // System.out.println("Median: " + data[med_index]);

        // QuickSort q_array = new QuickSort(data);
        // q_array.sort(0,n-1);
        // System.out.println("Median: " + Arrays.toString(data));

        //Call_Wrapper.run_selection_sort();
        //Call_Wrapper.run_quick_sort();

        


    }
}