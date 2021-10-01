package L01;

public class Team {
    private String TeamName="Default";
    private Player [] myTeam;
    private int numberOfPlayers;

    public Team(int numberOfPlayers) {
        myTeam=new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            myTeam[i]=new Player();
        }
    }

    protected void canDoIt(int goal){
        for (int i = 0; i < myTeam.length; i++) {
            if(myTeam[i].distance>=goal){
                myTeam[i].isFinished=true;
            }
        }
    }
    protected void showTeamInfo(){
        for (int i = 0; i < myTeam.length; i++) {
            System.out.println(myTeam[i].playerName+ " reached "+ myTeam[i].distance +"km");
        }
    }

    protected void showResult(){
        for (int i = 0; i < myTeam.length; i++) {
            String result;
            if(myTeam[i].isFinished==true)result=" Преодолел все дистанции";
            else result=" Не смог, максимальная дистанция "+ myTeam[i].distance +"km";
            System.out.println(myTeam[i].playerName+result);
        }
    }
}

class Player{

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
