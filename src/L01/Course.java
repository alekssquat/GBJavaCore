package L01;

public class Course {
    int[]myTrail;

    public Course() {
       myTrail=new int[4];
        for (int i = 0; i < myTrail.length; i++) {
            myTrail[i]=makeTrail();
        }
    }

    private int makeTrail(){
        int start=1;
        int finish=10;
        int trail=start+(int)(Math.random()*finish);
        return trail;
    }

    void showTrail(){
        for (int i = 0; i < myTrail.length; i++) {
            System.out.println("Дистанция №"+(i+1)+" - "+ myTrail[i]+" км.");
        }
    }

    void doIt(Team myTeam){
        for (int i = 0; i < myTrail.length; i++) {
            myTeam.canDoIt(myTrail[i]);
        }
    }
}
