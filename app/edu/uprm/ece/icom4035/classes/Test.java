package edu.uprm.ece.icom4035.classes;

import java.util.Random;

import models.Gem;
import models.GemList;
import edu.uprm.ece.icom4035.list.*;
public class Test {

	public static void main(String[] args) {
		SortedCircularDoublyLinkedList<String> test2= new SortedCircularDoublyLinkedList();
		String[] names={"Cristian", "Manuel","Apu","Ned","Carlos","Bob","Daniel"};
		for(int i=0;i<names.length;i++)
			test2.add(names[i]);
		System.out.println(test2);
		SortedCircularDoublyLinkedList<Gem> test3= new SortedCircularDoublyLinkedList();
		test3.add(new Gem("C", 14, 10.2, 4, "C", 14, (long)1));
		test3.add(new Gem("A", 14, 10.2, 4, "C", 14, (long)1));
		test3.add(new Gem("D", 14, 10.2, 4, "C", 14, (long)1));
		test3.add(new Gem("B", 14, 10.2, 4, "C", 14, (long)1));
		System.out.println(test3);
		Gem newGem = new Gem("C", 14, 10.2, 4, "C", 14, (long)1);
		Gem newGem2 = new Gem("A", 14, 10.2, 4, "C", 14, (long)1);
		Gem newGem3 = new Gem("D", 14, 10.2, 4, "C", 14, (long)1);
		GemList theList = GemList.getInstance();
		newGem = theList.addGem(newGem);
		newGem = theList.addGem(newGem2);
		newGem = theList.addGem(newGem3);
		System.out.println(theList.printList());
		
		///////////// NO HAY TOSTRING
		
	}
}
