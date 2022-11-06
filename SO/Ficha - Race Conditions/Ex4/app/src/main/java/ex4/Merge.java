package ex4;

public class Merge {

    public static void Merge_arrays(int[] ar1, int[] ar2) {

        int m = ar1.length;
        int n = ar2.length;


        for (int i=n-1; i>=0; i--)
        {
            /* Find the smallest element greater than ar2[i]. Move all
               elements one position ahead till the smallest greater
               element is not found */
            int j, last = ar1[m-1];
            for (j=m-2; j >= 0 && ar1[j] > ar2[i]; j--)
                ar1[j+1] = ar1[j];
      
            // If there was a greater element
            if (last > ar2[i])
            {
                ar1[j+1] = ar2[i];
                ar2[i] = last;
            }
        }
    }
}
