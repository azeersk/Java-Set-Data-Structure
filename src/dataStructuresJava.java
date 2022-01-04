import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class dataStructuresJava {
    public static void main(String[] args){
        ArrayList<Integer> arrayOne = new ArrayList<>();
        for(int i=1; i<5; i++){
            arrayOne.add(i);
        }
        System.out.println("ArrayList: "+arrayOne);
        Collections.reverse(arrayOne);
        System.out.println("Reverse of arrayList: "+arrayOne);
        Collections.shuffle(arrayOne);
        System.out.println("Shuffling of arrayList: "+arrayOne);
        Collections.sort(arrayOne);
        System.out.println("Sorted of arrayList: "+arrayOne);
        Collections.swap(arrayOne,1,2);
        System.out.println("Swap of the arrayList: "+arrayOne);
        //searching using binarySearch
        int num = Collections.binarySearch(arrayOne,4);
        System.out.println("searching a number using BinarySearch: "+ num);

        Collections.fill(arrayOne, 1);
        System.out.println("fill of ArrayList: "+arrayOne);

        ArrayList<Integer> arrayListTwo = new ArrayList<>();
        arrayListTwo.add(3);
        arrayListTwo.add(2);
        arrayListTwo.add(3);
        arrayListTwo.add(4);
        arrayListTwo.add(5);
        arrayListTwo.add(3);
        int a = Collections.frequency(arrayListTwo,3);
        System.out.println("count of repeat times: "+a);

        boolean value = Collections.disjoint(arrayListTwo,arrayOne);
        System.out.println("Disjoint of two arrayLists: "+ value);
        System.out.println("Maximum number: "+ Collections.max(arrayListTwo));
        System.out.println("Maximum number: "+ Collections.max(arrayOne));
        System.out.println("Minimum number: "+Collections.min(arrayListTwo));
        System.out.println("Minimum number: "+Collections.min(arrayOne));

    }
}
