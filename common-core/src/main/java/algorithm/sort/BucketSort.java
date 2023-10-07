package algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort implements Sort{
    /**
     * 桶排序（Bucket Sort）
     * 桶排序是一种非比较排序算法，它的基本思想是将待排序的数组分到有限数量的桶里，然后对每个桶进行排序，最后依次将所有桶中的元素取出来，组成有序的数组。
     * */
    public void bucketSort(){

    }

    @Override
    public void sort(int[] nums) {
        int bucketSize = 4;
        if (nums.length == 0) {
            return;
        }
        // 循环数组，先找到最小值和最大值
        int minValue = nums[0];
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            } else if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        // 根据桶的大小，计算桶个数，并初始化桶
        int bucketCount = (maxValue - minValue) / bucketSize + 1;
        List<List<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int i = 0; i < nums.length; i++) {
            int bucketIndex = (nums[i] - minValue) / bucketSize;
            buckets.get(bucketIndex).add(nums[i]);
        }
        int currentIndex = 0;
        for (int i = 0; i < bucketCount; i++) {
            List<Integer> bucket = buckets.get(i);
            // 对桶内数据进行排序
            Collections.sort(bucket);
            // 将数据逐个从桶内取出，并存入数组
            for (int j = 0; j < bucket.size(); j++) {
                nums[currentIndex++] = bucket.get(j);
            }
        }
    }

    @Override
    public int order() {
        return 1;
    }
}
