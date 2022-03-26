package projlab_skeleton;

import java.util.List;
import java.util.Scanner;

public class Storage extends Field{
   // private List<Material> materials
    private Material material;

    public Storage(Virologist v) {
        super(v);
    }

    @Override
    public void Accept(Virologist v){
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Moved to a Storage.");
        System.out.println("Do you want to pick up the material? 1: yes/ 2: no");
        x= sc.nextInt();
        if(x==1){
            v.PickUpMaterial(material);
        }
    }
}
