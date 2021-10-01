package L01;

public class MAIN {
    public static void main(String[] args) {
        Team t=new Team(4);
        t.showTeamInfo();
        Course c=new Course();
        c.showTrail();
        c.doIt(t);
        t.showResult();
    }
}
