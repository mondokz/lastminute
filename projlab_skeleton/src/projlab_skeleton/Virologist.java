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
		System.out.println("A virol�gus leb�nult.");
	}
	
	public void RandomMove() {
		Dance(this);
	}
	
	public void Untouchable() {
		System.out.println("A virol�gus �rinthetetlenn� v�lt!");
	}
	
	public void Forget() {
		System.out.println("A virol�gus elfelejtette az �sszes genetikaik�dot!");
	}
	
	public void Extend() {
		System.out.println("A virol�gus rakt�ra n�vekedett!");
	}
	
	public void Defense() {
		System.out.println("A virol�gust nem �rte el az �gens!");
	}
	
	public void Reverse() {
		System.out.println("A virol�gus visszakente az �genst a m�sik virol�gusra!");
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
