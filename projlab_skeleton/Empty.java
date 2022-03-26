package projlab_skeleton;

import java.util.List;

public class Empty extends Field{

    public Empty(Virologist v, List<Field> n) {
        super(v, n);
    }

    @Override
    public void Accept(Virologist v){
        System.out.println("Moved to an Empty Field.");
    }
}
