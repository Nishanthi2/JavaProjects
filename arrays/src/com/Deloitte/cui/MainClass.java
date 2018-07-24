package com.Deloitte.cui;

public class MainClass {
public static void main(String[] args) {
	int n[];
	n = new int[10];
	n[0]= 1;

	//System.out.println(n[0]);
    //for(int target:n) {
	//System.out.println(target);
	
	int num[][];
	num = new int[3][4];
	num[0][0] = 4;
	num[0][1] = 7;
	num[0][2] = 4;
	num[0][3] = 7;
	num[1][0] = 4;
	num[1][1] = 7;
	num[1][2] = 4;
	num[1][3] = 7;
	num[2][0] = 4;
	num[2][1] = 7;
	num[2][2] = 4;
	num[2][3] = 7;
	
	for(int [] target1 : num) {
		for(int target2 : target1) {
		System.out.println("the elements of the array are: " + target2);
	}
}
}
}
