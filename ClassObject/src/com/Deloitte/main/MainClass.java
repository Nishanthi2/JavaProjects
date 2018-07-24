package com.Deloitte.main;
import com.Deloitte.livingbeings.Human;
public class MainClass {
	public static void main(String[] args) {
		Man man1 = new Man();
		man1.leftEye.color = "Black";
		man1.leftEye.power = 2.5f;
		System.out.println("the man's eye color is :" + man1.leftEye.color);
		System.out.println("the man's eye power is :" + man1.leftEye.power);
	}

}