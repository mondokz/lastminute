package projlab_skeleton;

import java.util.List;
import java.util.Scanner;

public class Virologist {
	private String name;
	private boolean mobility;
	private List<Agent> agentsOwned;
	private List<Agent> agentsKnown;
	private List<Equipment> equipmentsOwned;
	private List<Material> materialsOwned;
	private Field field;

	public Virologist(String n) {
		this.name = n;
		this.mobility = true;
		this.agentsOwned = new List<Agent>();
		this.agentsKnown = new List<Agent>();
		this.equipmentsOwned = new List<Equipment>();
		this.materialsOwned = new List<Material>();
		this.field = new Field();
	}
	
	public Field getField(){
		return field;
	}

	//Move->lépés választása-> lépés -> mezõ kiírása ->elem felvétele?
	public void Move(Field f1) {
		if(field.IsNeighbour(f1)) {
			field.Remove(this);
			f1.Accept(this);
		}
	}
	
	public void Use( Virologist v) {
		int x;
		Scanner sc = new Scanner(System.in);

		equipmentsOwned.search(glove);
		equipmentsOwned.search(cape);
		System.out.println("Use agent on 1: myself/2: other virologist");
		x= sc.nextInt();
		if(x==1) {
			Apply(this);
		}
		else {
			Apply(v);
		}
	}
	
	public void PickUpItem(Equipment e) {
		e.TakeEquip(this);
	}
	
	public void Make(Material m, Agent a) {
		if(agentsKnown.contains(a)) {
			if (materialsOwned.size() < 3)
				agentsOwned.add(a);
		}
	}
	
	public void Paralyze() {
		System.out.println("A virológus lebénult.");
	}
	
	public void RandomMove() {
		Dance(this);
	}
	
	public void Untouchable() {
		System.out.println("A virológus érinthetetlenné vált!");
	}
	
	public void Forget() {
		System.out.println("A virológus elfelejtette az összes genetikaikódot!");
	}
	
	public void Extend() {
		System.out.println("A virológus raktára növekedett!");
	}
	
	public void Defense() {
		System.out.println("A virológust nem érte el az ágens!");
	}
	
	public void Reverse() {
		System.out.println("A virológus visszakente az ágenst a másik virológusra!");
	}
	
	public void PickUpMaterial(Material m) {
		m.store();
		materialsOwned.Add(m);
	}
	
	public void RemoveEffect(Agent a) {
		Unapply(a);
	}
	
	public void DropItem(Equipment e) {
		DropEquip(this, field);
		equipmentsOwned.remove(e);
		System.out.println("DropItem()");
	}
	
	public void StealItem(Virologist v, Equipment e) {
		v.DropItem(e);
		System.out.println("StealItem()");
		this.PickUpItem(e);

	}
}
