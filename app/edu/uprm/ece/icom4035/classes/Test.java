package edu.uprm.ece.icom4035.classes;

import java.util.Random;
import edu.uprm.ece.icom4035.list.*;
public class Test {

	public static void main(String[] args) {
		SortedCircularDoublyLinkedList<String> test2= new SortedCircularDoublyLinkedList();
		String[] names={"Cristian", "Manuel","Apu","Ned","Carlos","Bob","Daniel"};
		for(int i=0;i<names.length;i++)
			test2.add(names[i]);
		System.out.println(test2);
		

	}
}
