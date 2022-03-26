package projlab_skeleton;

import java.util.List;

public abstract class Field {
    private Virologist OnField;
    private List<Field> neighbours;

    public Field(Virologist v, List<Field> n){
        OnField = v;
        neighbours = n;

    }

    public abstract void Accept(Virologist v);

    public void Remove(Virologist v){
        System.out.println("Remove()");

    }

    public boolean IsNeighbour(Field f){
        System.out.println("IsNeighbor()");


    }

}
