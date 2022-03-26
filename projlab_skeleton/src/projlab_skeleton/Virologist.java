package projlab_skeleton;

public class Virologist {
	private String name;
	private boolean mobility;
	private Agent agentsOwned[];
	private Agent agentsKnown[];
	private Equipment equipmentsOwned[];
	private Material materialsOwned[];
	private Field field;
	
	public void Move(Field f1) {
		if(field.IsNeighbour(f1)) {
			field.Remove(this);
			f1.Accept(this);
		}
	}
	
	public void Use(Agent a, Virologist v) {
		equipmentsOwned.search(glove);
		equipmentsOwned.search(cape);
		Apply(this);
		Apply(v);
	}
	
	public void PickUpItem(Equipment e) {
		e.TakeEquip(this);
	}
	
	public void Make(Material m, Agent a) {
		agentsKnown.search(a);
		if(materialsOwned.size() < 3)
			agentsOwned.add(a);
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
	
	public void DropItem() {
		DropEquip(this, field);
		equipmentsOwned.remove(e);
	}
	
	public void StealItem(Virologist v) {
		v.DropItem();
	}
}
