package array;
/**
 * LeetCode 27: 移除元素
 * Category: 数组
 * 给定一个数组 nums 和一个值 val，你需要 移除 所有数值等于 val 的元素，
 * 并返回移除后数组的新长度。
 * 
 * Approach: 
 * 
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int slowIndex=0;
        for(int fastIndex=0;fastIndex<nums.length;fastIndex++){
            if(nums[fastIndex]!=val){
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;

    }
}
