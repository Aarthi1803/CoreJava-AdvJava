package module2;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorTest {

	public static void main(String[] args) {
		List<Integer> evenNum = new ArrayList<>();
        for(int i = 1; i<=50; i++){
            evenNum.add(i*2);
        }

        System.out.println(evenNum);

        Spliterator<Integer> mySpliterator = evenNum.spliterator();
        System.out.println("mySpliterator.estimateSize() value is : "+ mySpliterator.estimateSize());

        Consumer<Integer> a = x -> System.out.println("mySpliterator.forEachRemaining = " + x);

//        mySpliterator.forEachRemaining(a);

//        mySpliterator.tryAdvance(a); // both forEachRemaining() and tryAdvance() works in same manner because forEachRemaining() has tryAdvance method inside it --> do { } while (tryAdvance(action));

//        for(Spliterator<Integer> mySpliterator2 = evenNum.spliterator(); mySpliterator2.tryAdvance(a););

        Spliterator<Integer> secondHalf = evenNum.spliterator(); // get second half values
        Spliterator<Integer> firstHalf = secondHalf.trySplit(); // get first half values as we have used trySplit()

        secondHalf.forEachRemaining(ele -> System.out.println("Second Half : "+ele));
        System.out.println("/***********************/");
        firstHalf.forEachRemaining(ele -> System.out.println("First Half : "+ele));

	}

}
