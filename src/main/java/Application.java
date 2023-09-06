import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    /**
     * You may use this main method to manually test your code in any way you like
     * This will not impact test results.
     * @param args
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(0);
        System.out.println("Here is the starting list: ");
        System.out.println(list);
        System.out.println("Here is the list with all values squared: ");
        System.out.println(lab.square(list));
        System.out.println("Here is the list with all values squared: ");
        System.out.println(lab.filter(list));
    }
}
