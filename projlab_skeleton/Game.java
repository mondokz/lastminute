package projlab_skeleton;

public class Game {
    private int rounds;
    private Map map;
    private boolean gameActive;

    public Game(){

        map = new Map();
        gameActive=false;

    }

    public void StartGame(){
        System.out.println("StartGame()");
        gameActive = true;
        map.LoadMap();


    }

    public void EndGame(){
        System.out.println("EndGame()");
        gameActive= false;

    }

    public void NextRound(){
        System.out.println("NextRound()");
        rounds++;
    }
}
