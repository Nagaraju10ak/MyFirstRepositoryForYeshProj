package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.size());
		
		Integer integer = list.get(3);
		System.out.println(list.get(3));
	}

}
