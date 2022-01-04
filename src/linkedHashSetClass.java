import java.util.LinkedHashSet;

public class linkedHashSetClass {
    public static void main(String[] args){
        LinkedHashSet<Integer> linkedOne = new LinkedHashSet<>();
        linkedOne.add(1);
        linkedOne.add(2);
        linkedOne.add(3);
        System.out.println("Set One: "+linkedOne);
        LinkedHashSet<Integer> linkedTwo = new LinkedHashSet<>();
        linkedTwo.add(3);
        linkedTwo.add(4);
        linkedTwo.add(5);
        linkedTwo.add(6);
        System.out.println("Set Two: "+linkedTwo);
        linkedTwo.addAll(linkedOne);
        System.out.println("Union of two sets: "+linkedTwo);
        //intersection of two sets
        LinkedHashSet<Integer> linkedHashOne = new LinkedHashSet<>();
        for(int i=7; i<=11; i++){
            linkedHashOne.add(i);
        }
        LinkedHashSet<Integer> linkedHashTwo = new LinkedHashSet<>();
        for(int j=10; j<=13; j++){
            linkedHashTwo.add(j);
        }
        linkedHashTwo.retainAll(linkedHashOne);
        System.out.println("Intersection of two sets: "+ linkedHashTwo);
        LinkedHashSet<Integer> linkedHashThree = new LinkedHashSet<>();
        linkedHashThree.add(1);
        linkedHashThree.add(3);
        linkedHashThree.add(4);
        LinkedHashSet<Integer> linkedHashFour = new LinkedHashSet<>();
        linkedHashFour.add(2);
        linkedHashFour.add(3);
        linkedHashFour.add(5);
        linkedHashFour.containsAll(linkedHashThree);
        System.out.println("Subset of: "+linkedHashFour);

        linkedHashFour.removeAll(linkedHashThree);
        System.out.println("Differance of two sets: "+linkedHashFour);
    }
}
