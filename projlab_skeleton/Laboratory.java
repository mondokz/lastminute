package projlab_skeleton;

import java.util.List;
import java.util.Scanner;

public class Laboratory extends Field{
    private Agent agent;


    public Laboratory(Virologist v, List<Field> n) {
        super(v,n);
    }

    @Override
    public void Accept(Virologist v){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moved to a Laboratory.");
        System.out.println("Do you want to learn the genetic code? 1: yes/ 2: no");
        x= sc.nextInt();
        if(x==1){
            agent.Learn();
        }
    }
}
