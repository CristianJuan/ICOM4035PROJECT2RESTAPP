package models;
import edu.uprm.ece.icom4035.list.SortedCircularDoublyLinkedList;
public class Test {

	public static void main(String[] args) {
		SortedCircularDoublyLinkedList<Person> test1= new SortedCircularDoublyLinkedList<Person>();
		Person personone = new Person(1, "C", "A", 12);
		Person perstwo= new Person(2, "A", "J", 41);
		
		test1.add(personone);
		test1.add(perstwo);
		System.out.println(test1);
		
		SortedCircularDoublyLinkedList<Gem> test2= new SortedCircularDoublyLinkedList<Gem>();
		Gem gemone = new Gem("C", 1, 1.1, 7, "CC", 4, (long) 1);
		gemone.setDescription("FIRST DESCRIPTION");
		Gem gemtwo = new Gem("A", 1, 1.1, 7, "CC", 4, (long) 1);
		gemtwo.setDescription("SECOND DESCRIPTION");
		test2.add(gemone);
		test2.add(gemtwo);
		System.out.println(test2);

	}

}
