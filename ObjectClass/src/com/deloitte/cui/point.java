package com.deloitte.cui;

public class point {
	public static int x;
	public static int y;
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x+" "+y;
	}
	
	@Override
	public boolean equals(Object target) {
		// TODO Auto-generated method stub
		if(target != null) {
			if(target instanceof point) {
				point p3 = (point)target;
				if((x == point.x) && (y == point.y))
				{
					return true;
				}
							}
			}
		}
		
	}

