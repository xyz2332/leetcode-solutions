package array;
/**
 * LeetCode 704: 二分查找
 * Category: 数组
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 
 * Approach: 标准二分查找
 */
public class BinarySearch {
    public int search(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int middle;
        while (left<=right) {
            middle=left+(right-left)/2;
            if(nums[middle]==target){
                return middle;
            }else if(nums[middle]>target){
                right=middle-1;
            }else{
                left=middle+1;
            }
            
        }
        return -1;
    }

}
