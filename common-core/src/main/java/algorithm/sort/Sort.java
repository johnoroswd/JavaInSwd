package algorithm.sort;

public interface Sort {
    /**
     * 根据nums进行排序，返回后nums应为正序排列的数组
     * @param nums 待排序数组
     * */
    void sort(int[] nums);
    /**
     * @return 排序序号
     * */
    int order();
}
