package com.ocaj_exam.ch2;

import java.util.*;

public class EnhancedForLoop{
	public static void main(String[] args){
		List<Float> fishLengthList = new ArrayList<>();
		fishLengthList.add(10.0f);
		fishLengthList.add(15.5f);
		fishLengthList.add(18.0f);
		fishLengthList.add(29.5f);
		fishLengthList.add(45.5f);
		for(float size: fishLengthList){
			if(size > 28){
				System.out.println(size);
			}
		}
	}
}
