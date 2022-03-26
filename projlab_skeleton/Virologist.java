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

	public Field getField(){
		return field;
	}

	//Move->l�p�s v�laszt�sa-> l�p�s -> mez� ki�r�sa ->elem felv�tele?
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
