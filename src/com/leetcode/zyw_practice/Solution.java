package com.leetcode.zyw_practice;
/**
 * 
 * @author YW
 * @version 1.0 2018-05-22
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 */
public class Solution {
	/**
	 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
	 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
	 * @param nums
	 * @param target
	 * @return 两个数值的位置
	 */
    public int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            	if(nums[i]+nums[j]==target){
            		a[0] = i;
            		a[1] = j;
            		return a;
            	}
            		
            }
        }
        return a;
    }
    /**
     * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
	 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     * @param J
     * @param S
     * @return
     */
    public static int numJewelsInStones(String J, String S) {
    	String tmp = J;
		int JLength = J.length();
		int SLength = S.length();
		int count = 0;
		for(int s = 0;s<SLength;s++){
			String sbs = S.substring(S.length()-1);
			J=tmp;
			for(int j = 0;j<JLength;j++){
				String sbj = J.substring(J.length()-1);
				if(sbs.equals(sbj)){
					count++;
				}
				J=J.substring(0, J.length()-1);
			}
			S = S.substring(0, S.length()-1);
		}
    return count; 
}
    /**
     * 判断路线成圈
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
    	int pos=0;
		char[] m = moves.toCharArray();
		for(int i=0;i<m.length;i++){
			switch(m[i]){
			case 'R':pos++;break;
			case 'U':pos++;break;
			case 'L':pos--;break;
			case 'D':pos--;break;
			default:System.out.println("含有非法字符，请重新输入");break;
			}
		}
		if(pos==0)
			return true;
		else
			return false;
    }    
}
