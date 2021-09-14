import java.util.Arrays;

public class BubbleSort<T>
{
 T[] array;
public static<T extends Comparable> void sort(T[] array)
 {
    for(int i = array.length; i > 1; i--)
      {
      for(int j = 0; j < i - 1; j++)
        {
       
        if(array[j].compareTo(array[j+1]) > 0)
         
         {
          T temp = array[j];
          array[j] = array[j+1];
         array[j+1] = temp;
        }
      }            
    }
    System.out.println("Sorted array- " + Arrays.toString(array));
    //System.out.println("Sorted array- " + array);
   
  }
public static void main(String[] args)

{ Integer[] arr = {16,89,54,23,42,11,32};
   BubbleSort<Integer> obj = new BubbleSort<Integer>();
   obj.sort(arr);

String[] arr2 = {"karthik","jobin","ramesh","mithu","arjun","bonitta"};
BubbleSort<String> obj2 = new BubbleSort<String>();
obj2.sort(arr2);  

Float[]  arr3= {18.0f,65.0f,45.0f,32.0f};
BubbleSort<Float>  obj3=new BubbleSort<Float>();
obj3.sort(arr3);

}

}
