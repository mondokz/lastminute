package projlab_skeleton;

import java.util.Scanner;

//Ide még kell egy visszalépés!!!
public class Main {
    public static void main(String[] args){
        boolean active = true;
        int input;
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        Virologist v0= new Virologist();
        Virologist v1= new Virologist();
        Equipment e = new Equipment();
        Agent a = new Agent();
        Material m = new Material();

        while(active) {
            System.out.println("1. Start Game\n" +
                    "2. Move a virologist\n" +
                    "3. Use agent on virologist\n" +
                    "4. Rob\n" +
                    "5. Make agent\n" +
                    "6. Move on shelter\n" +
                    "7. Move on storage\n" +
                    "11. Pick up material\n" +
                    "12. Move on laboratory\n" +
                    "13. Learn genetic code\n" +
                    "14. Quit\n");

            input = sc.nextInt();
            switch (input){
                case(1): game.StartGame(); break;
                case(2): v0.Move(v0.getField()); break;
                case(3): v0.Use(v1); break;
                case(4): v0.StealItem(v1, e); break;
                case(5): v0.Make(m, a); break;
                case(7): v0.PickUpItem(e); break;
                case(14): active = false; break;

            }

        }
    }
}
