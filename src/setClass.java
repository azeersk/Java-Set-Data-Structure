import java.util.HashSet;
import java.util.Set;

public class setClass {
    public static void main(String[] args){
        Set<String> setOne = new HashSet<>();
        // add elements to set.
        setOne.add("Class1");
        setOne.add("Class2");
        setOne.add("Class3");
        setOne.add("Class4");
        System.out.println("Set is: "+ setOne);
        //iterator
//        for(int i=5; i<10; i++){
//            setOne.add("Class"+i);
//        }
        System.out.println("Final set is: "+ setOne);
        System.out.println("Remove the element: "+setOne.remove("Class5"));
        System.out.println("Set contains: "+setOne.contains("Class5"));
        System.out.println("Check size: "+ setOne.size());
        System.out.println("Address of the element is: "+ setOne.hashCode());
        Set<String> setTwo = new HashSet<>();
        for(int j=1; j<5; j++){
            setTwo.add("MyClass"+j);
        }
        System.out.println("set Two: "+setTwo);
        setTwo.addAll(setOne);
        System.out.println("Adding two class: "+setTwo);
        setTwo.clear();
        System.out.println("Cleared set: "+ setTwo);
    }
}
