import java.util.HashSet;

public class hashSetClass {
    public static void main(String[] args){
        HashSet<String> hashOne = new HashSet<>();
        for(int i=1; i<5; i++){
            hashOne.add("Class"+i);
        }
        System.out.println("First set: "+ hashOne);
        HashSet<String> hashTwo = new HashSet<>();
        for(int j=1; j<5; j++){
            hashTwo.add("MyClass"+j);
        }
        System.out.println("Second set: "+ hashTwo);
        hashTwo.addAll(hashOne);
        System.out.println("Union of set: "+hashTwo);

        hashTwo.retainAll(hashOne);
        System.out.println("Intersection of: "+ hashTwo);

        HashSet<String> hashThree = new HashSet<>();
        hashThree.add("new1");
        hashThree.add("new2");
        hashThree.add("new3");
        hashThree.add("new4");
        HashSet<String> hashFour = new HashSet<>();
        hashFour.add("Old1");
        hashFour.add("Old2");
        hashFour.add("Old3");
        hashFour.add("Old4");
        hashFour.containsAll(hashThree);
        System.out.println("Subset of: "+ hashThree);
        hashTwo.removeAll(hashOne);
        System.out.println("Deference of: "+hashTwo);
        System.out.println("Empty check of: "+ hashTwo.isEmpty());
    }
}
