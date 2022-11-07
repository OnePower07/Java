import java.util.*;
public class Insertion_sort {
    void insertion(int array[])
    {
        int size= array.length;
        for(int i=1;i<size;i++)
        {
            int key=array[i];
            int j=i-1;
            while(j>=0 && key<array[j])
            {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] y = {2,4,12,1,6};
        Insertion_sort s = new Insertion_sort();
        s.insertion(y);
        System.out.println(Arrays.toString(y));
    }
}
