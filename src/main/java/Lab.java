import java.util.List;
import java.util.stream.Collectors;

/**
 * Streams, which were introduced in Java version 8, offer an alternate syntax for applying a piece of code to many
 * items in a collection. In theory, any such problem can be solved with a for loop, but in lengthy, multi-step
 * problems, a streams solution may be more elegant, and the syntax is more familiar to developers who work
 * extensively in the functional-programming style, such as JavaScript and Scala.
 *
 * A stream statement must always be written on a single line. You must convert a collection to a stream, perform
 * an operation, and then convert the stream back to a collection, if you're intending to use the values later.
 * Here's an example of forEach, map, filter, and reduce methods. There are more useful stream methods, but we won't be
 * touching them yet:
 *
 * Printing out all the items in a List individually:
 * list.stream().forEach(item -> {
 *          System.out.println(item)
 *      });
 * Doubling every number in a List:
 * list.stream().map(item -> {
 *          return item*2;
 *      }).collect(Collectors.toList());
 * Filtering all null values:
 * list.stream().filter(item -> {
 *          return item != null;
 *      }).collect(Collectors.toList());
 * Adding all numbers:
 * int total = list.stream().reduce(0, (subtotal, item) -> {
 *          subtotal = subtotal + item;
 *      });
 *
 * The syntax within the forEach, map, and filter methods might look unfamiliar to you; these are lambda expressions.
 * A lambda expression is a way for us to pass a method as a parameter to a function - you might notice that the
 * portion of code within curly braces follows the basic structure of a method, such as the map method applying the
 * 1-line function return item*2; to every item in the list, or the filter function only keeping a value in a list
 * if the method return item != null; returns true.
 *
 * This works, because a lambda expression is actually just implementing an interface in these lines of code, and the
 * object that implements the interface is actually what is passed into the forEach, map, and filter methods. This is a
 * interface with a single method definition, known as a functional interface. The 'item' in the stream examples
 * is actually just the parameter that is passed into this single method.
 */
public class Lab {
    /**
     * TODO: Given an ArrayList of integers,
     * return an ArrayList of all the integers squares (n*n).
     *
     * Solve this problem with Streams. One of the stream methods shown is a clear choice for this problem.
     * @param list
     * @return
     */
    public List<Integer> square(List<Integer> list){
        return null;
    }

    /**
     * TODO: Filter all zeroes from an ArrayList. Keep order of elements intact.
     * Solve this problem with Streams. One of the stream methods shown is a clear choice for this problem.
     * @param list an ArrayList of ints.
     * @return an ArrayList of all the ints of nums, but with all 0 values removed.
     */
    public List<Integer> filter(List<Integer> list){
        return null;
    }
}
