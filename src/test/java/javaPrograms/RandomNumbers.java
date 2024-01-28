package javaPrograms;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		for(int i=0; i<3;i++) {
		
		//System.out.println("Random Integer number is:"+rd.nextInt());
		//System.out.println("Random Double number is:"+rd.nextDouble());
			System.out.println("Random numbers using math:"+Math.round(i));

	}

	}}
