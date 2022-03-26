package projlab_skeleton;

import java.util.List;

public class Map {
    private List<Field> fields;

    public Map(){}

    public void LoadMap(){
        System.out.println("LoadMap()");
        this.AddEquip();
        this.AddMaterial();
        this.AddVirologist();
    }
    public void AddVirologist(){
        System.out.println("AddVirologist()");
    }

    public void  AddEquip(){
        System.out.println("AddEquip()");
    }

    public void AddMaterial(){
        System.out.println("AddMaterial()");
    }
}
