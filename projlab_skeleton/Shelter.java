package projlab_skeleton;

import java.util.List;
import java.util.Scanner;

public class Shelter extends Field{
    private Equipment equipment;

    public Shelter(Virologist v, List<Field> n) {
        super(v, n);
    }

    @Override
    public void Accept(Virologist v){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Moved to a Shelter.");
        System.out.println("Do you want to pick up equipment? 1: yes/ 2: no");
        x= sc.nextInt();
        if(x==1){
            equipment.takeEquip(v);
        }
    }
}
