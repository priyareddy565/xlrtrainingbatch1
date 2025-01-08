package Core_Java;
class Bowler{
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;
    //defalut
    public Bowler(){
        this.name = "";
        this.wickets=0;
        this.matches=0;
        this.balls_bowled=0;
        this.runs_conceded=0;
    }
    //parameterized
    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded){
        this.name = name;
        this.wickets=wickets;
        this.matches=matches;
        this.balls_bowled=balls_bowled;
        this.runs_conceded=runs_conceded;
    }
    public void computeBowlingAverage(){
        if(wickets<=0||runs_conceded<0||balls_bowled<0||matches<0){
            System.out.println("Invalid input");
            return;
        }
        if(runs_conceded>0&&matches==0){
            System.out.println("Invalid input");
            return;
        }
        double bowling_avg=(double) runs_conceded/wickets;
        System.out.println("Name: "+name);
        System.out.println("Bowling Average: "+bowling_avg);
    }
    public void showStatistics(){
        if(wickets<0||runs_conceded<0||balls_bowled<0||matches<0){
            System.out.println("Invalid input");
            return;
        }
        if(runs_conceded>0 && matches==0){
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Name : "+name);
        System.out.println("Wickets : "+wickets);
        System.out.println("balls bowled : "+balls_bowled);
        System.out.println("Matchs : "+matches);
        System.out.println("Runs conceded : "+runs_conceded);
    }
    public void computeStrikeRate(){
        if(wickets<=0||balls_bowled<0||matches<0){
            System.out.println("Invalid input");
            return;
        }
        if(balls_bowled>0 && matches==0){
            System.out.println("Invalid input");
            return;
        }
        double strike_rate=(double) balls_bowled/wickets;
        System.out.println("Name : "+name);
        System.out.println("Strike_Rate : "+strike_rate);
    }
}

public class PS003 {
    public static void main(String[] args) {
        Bowler bowler1 = new Bowler("John", 10, 5,750,463);
        bowler1.computeBowlingAverage();
        bowler1.showStatistics();
        bowler1.computeStrikeRate();
    }
    
}
