public class GSdemo extends ESporDemo{


    private int forvetPlayer;
    private int faulNumber;

    GSdemo(String teamName,int goalNumber,String formColour,int playerNumber,int goalGS,int goalBJK,int forvetPlayer,int faulNumber){
        super(teamName,goalNumber,formColour,playerNumber,goalGS,goalBJK);
        this.faulNumber = faulNumber;
        this.forvetPlayer = forvetPlayer;
    }
    public int getForvetPlayer(){
        return forvetPlayer = forvetPlayer;
    }
    public void setForvetPlayer(){
        this.forvetPlayer = forvetPlayer;
    }
    public int getFaulNumber(){
        return faulNumber;
    }
    public void setFaulNumber(){
        this.faulNumber = faulNumber;
    }
    public void mac(){
        System.out.println(this.getTeamName() + " maçında  " + this.getForvetPlayer() + " forvet oyuncusu bulunmaktadır.");
    }
    public void mac2(){
        System.out.println(this.getTeamName() + " maçta " + this.getFaulNumber() + " tane faul yapmıştır.");
    }
}
