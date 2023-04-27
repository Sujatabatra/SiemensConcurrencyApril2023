package com.sujata.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemoClass {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		
		
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(45);
		treeSet.add(35);
		treeSet.add(67);
		treeSet.add(12);
		treeSet.add(19);
		treeSet.add(4);
		
		//which can traverse over linked list
		Iterator<Integer> linkedListIterator=linkedList.iterator();
		
		//which can traverse over treeset
		Iterator<Integer> treeSetIterator=treeSet.iterator();
		

	}

}
