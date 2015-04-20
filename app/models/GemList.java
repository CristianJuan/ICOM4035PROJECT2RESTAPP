package models;

import java.util.ArrayList;

import edu.uprm.ece.icom4035.list.SortedCircularDoublyLinkedList;

public class GemList {
	private SortedCircularDoublyLinkedList<Gem> gemList;
	int counter = 1;
	private GemList(){
		this.gemList = new SortedCircularDoublyLinkedList<Gem>();
		this.gemList.add(new Gem("D", 14, 110.0, 7, "#CC", 16,(long) 1));
		
	}
	public Gem addGem(Gem obj){
		long id = this.counter++;
		obj.setId(id);
		this.gemList.add(obj);
		return obj;
	}
	
	public Gem getGemById(long id){
		for (Gem p : this.gemList){
			if (p.getId() == id){
				return p;
			}
		}
		return null;
	}
	
	public Gem[] getAllGems(){
		Gem result[] = new Gem[this.gemList.size()];
		for (int i=0; i < this.gemList.size(); ++i){
			result[i] = this.gemList.get(i);
		}
		return result;
	}
	
	public boolean deleteGem(long id){
		int target = -1;
		
		for (int i=0; i< this.gemList.size(); ++i){
			if (this.gemList.get(i).getId() == id){
				target = i;
				break;
			}
		}
		if (target == -1){
			return false;
		}
		else {
			this.gemList.remove(target);
			return true;
		}
	}
	
	public Gem updateGem(Gem obj){
		int target = -1;
		
		for (int i=0; i< this.gemList.size(); ++i){
			if (this.gemList.get(i).getId() == obj.getId()){
				target = i;
				break;
			}
		}
		if (target == -1){
			return null;
		}
		else {
			Gem P = this.gemList.get(target);
			P.setColor(obj.getColor());
			P.setDescription(obj.getDescription());
			P.setFaces(obj.getFaces());
			P.setName(obj.getName());
			P.setPrice(obj.getPrice());
			P.setRarity(obj.getRarity());
			P.setShine(obj.getShine());

			return P;
		}
	}
	private static GemList singleton = new GemList();
	public static GemList getInstance(){
		return singleton;
	}
	
	public String printList()
	{
		 String result="";
		 while(!this.gemList.isEmpty())
		 {
			 result = result + "" + this.gemList;
		 }
		return result;
	}
}
