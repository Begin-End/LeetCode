package com.zyw.leetcode;
/**
 * 
 * @author YW
 * @version 1.0 2018-05-22
 * 万能的测试类
 *
 */
public class SolutionTest {
	public static void main(String[] args) {
		String moves = "RLUD";
		int pos=0;
		char[] m = moves.toCharArray();
		for(int i=0;i<m.length;i++){
			switch(String.valueOf(m[i])){
			case "R":pos++;break;
			case "U":pos++;break;
			case "L":pos--;break;
			case "D":pos--;break;
			default:System.out.println("含有非法字符，请重新输入");break;
			}
		}
		if(pos==0)
			System.out.println("true");
		else
			System.out.println("false");
    }
	}

