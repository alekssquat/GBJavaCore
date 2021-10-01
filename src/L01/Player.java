package L01;

public class Player {
    static int currentNumber=0;

    String playerName;
    boolean isFinished=false;
    int distance;

    public Player() {
        currentNumber++;
        this.playerName = "Player #"+ currentNumber;
        this.distance= 0+(int) (Math.random()*10);
}
}
