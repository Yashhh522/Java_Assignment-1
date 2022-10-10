/*
    Name-Yash Gohil
    ID-21CE034
    Aim - Create a generic method for sorting an array of Comparable objects.
 */
public class ArraySorting
{
    public static void main(String[] args)
    {
        Integer[] list = {34, 17, 23, 35, 45, 9, 1};
        System.out.println("Original Array : ");
        printArray(list);
        selectionSort(list);
        System.out.println();
        System.out.println("After sorting :");
        printArray(list);
        Float[] flist = {34.4f, 17.6f, 23.0f};
        selectionSort(list);
    }
    public static <E extends Comparable<E>> void selectionSort(E[] list)
    {
        for(int i=0;i<list.length-1;i++)
        {
            int iSmallest = i;
            for(int j=i+1;j<list.length;j++)
            {
                if(list[iSmallest].compareTo((list[j])) > 0  )
                {
                    iSmallest = j;
                }
            }
            E iSwap = list[iSmallest];
            list[iSmallest] = list[i];
            list[i] = iSwap;
        }
    }
    public static <E> void printArray(E[] list)
    {
        for(int i=0; i<list.length; i++)
        {
            System.out.print(list[i] + ", ");
        }
    }
}
