import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LabTest {
    public static Lab lab;
    @BeforeClass
    public static void setUp(){
        lab = new Lab();
    }

    /**
     * {1, 2, 3, 4} with squared values is {1, 4, 9, 16}
     */
    @Test
    public void squareTest1(){
        Integer[] nums = {1,2,3,4};
        Integer[] target = {1,4,9,16};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(lab.square(numsAL), targetAL);
    }

    /**
     * {16, 4, 2, 8} with squared values is {256, 16, 4, 64}
     */
    @Test
    public void squareTest2(){
        Integer[] nums = {16, 4, 2, 8};
        Integer[] target = {256, 16, 4, 64};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(lab.square(numsAL), targetAL);
    }

    /**
     * {1, 2, 3, 4, 5} with all zeroes removed should produce {1, 2, 3, 4, 5}.
     */
    @Test
    public void filterZeroesNoZeroesTest(){
        Integer[] nums = {1, 2, 3, 4, 5};
        Integer[] target = {1, 2, 3, 4, 5};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(targetAL, lab.filter(numsAL));
    }

    /**
     * {1, 0, 2, 3, 0, 4, 5} with all zeroes removed should produce {1, 2, 3, 4, 5}.
     */
    @Test
    public void filterZeroesTest1(){
        Integer[] nums = {1, 0, 2, 3, 0, 4, 5};
        Integer[] target = {1, 2, 3, 4, 5};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(targetAL, lab.filter(numsAL));
    }

    /**
     * {6, 0, 4, 0, 2} with all zeroes removed should produce {6, 0, 4, 0, 2}.
     */
    @Test
    public void filterZeroesTest2(){
        Integer[] nums = {6, 0, 4, 0, 2};
        Integer[] target = {6, 4, 2};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(targetAL, lab.filter(numsAL));
    }

    /**
     * {6, 4, 2, 0, 0, 0} with all zeroes removed should produce {6, 4, 2}.
     */
    @Test
    public void filterZeroesTest3(){
        Integer[] nums = {6, 4, 2, 0, 0, 0};
        Integer[] target = {6, 4, 2};
        List<Integer> numsAL = new ArrayList<>(Arrays.asList(nums));
        List<Integer> targetAL = new ArrayList<>(Arrays.asList(target));
        Assert.assertEquals(targetAL, lab.filter(numsAL));
    }
}
