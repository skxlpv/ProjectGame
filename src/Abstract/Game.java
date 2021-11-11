package Abstract;

public class Game {
    State s = new State();

    public void showState(){
        System.err.println(" ________________________________\n" +
                "|    __________     _______      |\n" +
                "|    SANITY: "+s.lives+"     FEAR:"+s.fear+"      |\n" +
                "|________________________________|\n");
    }

}
