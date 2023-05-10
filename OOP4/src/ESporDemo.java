public class ESporDemo {

    private String teamName;
    private int goalNumber;
    private String formColour;
    private int playerNumber;
    private int goalGS;
    private int goalBJK;

    ESporDemo(String teamName , int goalNumber,String formColour,int playerNumber,int goalBJK,int goalGS){
        this.teamName = teamName;
        this.goalNumber = goalNumber;
        this.formColour = formColour;
        this.playerNumber = playerNumber;
        this.goalGS = goalGS;
        this.goalBJK = goalBJK;
    }
    public String getTeamName(){
        return teamName;
    }
    public void setTeamName(){
        this.teamName = teamName;
    }

    public int getGoalNumber(){
        if(this.goalGS == this.goalBJK){
            System.out.println("Maç berabere bitmiştir!");
        }else if(this.goalGS > this.goalBJK){
            System.out.println("Maçın kazananı GS'dir.  Galibiyet = GALATASARAY.  Mağduriyet = Beşiktaş");
        }else if(this.goalBJK > this.goalGS){
            System.out.println("Maçın kazananı BJK. Galibiyet = BEŞİKTAŞ.  Mağduriyet = Galatasaray");
        }
        return goalNumber;
    }
    public void setGoalNumber(){
        this.goalNumber = goalNumber;
    }

    public String getFormColoyur(){
        return formColour;
    }
    public void setFormColour(){
        this.formColour = formColour;
    }

    public int getPlayerNumber(){
        return playerNumber;
    }
    public void setPlayerNumber(){
        this.playerNumber = playerNumber;
    }
    public int getGoalGS(){
        return goalGS;
    }
    public void setGoalGS(){
        this.goalGS = goalGS;
    }
    public int getGoalBJK(){
        return goalBJK;
    }
    public void setGoalBJK(){
        this.goalBJK = goalBJK;
    }

}
