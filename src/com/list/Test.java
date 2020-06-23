package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer data [] = {1,2,3,4,5};
		List<Integer> asList2 = Arrays.asList(data);
		List<Integer> asList = new ArrayList<Integer>();
		data[4] = 100;
		asList.add(500);
		asList.forEach(System.out::println);
	}

}
