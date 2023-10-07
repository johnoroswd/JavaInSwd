package algorithm.sort;

import java.util.Arrays;

public class SortMain {
    public static final int[] nums={1,7,2,6,3,87,-1,2,10,4,5,-5,100,56};

    public static void main(String[] args) {
        Sort sort=new BucketSort();
        sort.sort(nums);
        System.out.printf("排序后的数组为: %s 。", Arrays.toString(nums));
    }

}
