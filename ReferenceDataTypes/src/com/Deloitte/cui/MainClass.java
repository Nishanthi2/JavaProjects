package com.Deloitte.cui;

class Point{
	public int x;
	public int y;
}

public class MainClass {
	public static void main(String[] args) {
		Point[] P = new Point[3];
		
		P[0] = new Point();
		//P[1] = new Point();
		P[2] = new Point();
		
		P[0].x = 2;
		P[0].y = 3;
		//P[1].x = 4;
		//P[1].y = 5;
		P[2].x = 6;
		P[2].y = 7;
		
		for(Point P1 : P) {
			if(P1 != null) {
				System.out.println(P1.x + "," + P1.y);
			}
		}
	}
	
	
	
	

}
