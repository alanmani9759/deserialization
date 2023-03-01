package org.lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListProg {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("alan");
		arr.add("mani");
		arr.add("alan");
		arr.add(1, "neel");
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		LinkedList<String> li = new LinkedList<>();
		li.add("susa");
		li.add("alan");
		li.add("susa");
		System.out.println(li);
	}
}
