public class BJKdemo extends  ESporDemo{

    private int tacNumber;
    private int penalti;

    BJKdemo(String teamName ,int  goalNumber,String formColour,int playerNumber,int goalGS,int goalBJK,int tacNumber,int penalti){
        super(teamName,goalNumber,formColour,playerNumber,goalBJK,goalGS);
        this.tacNumber = tacNumber;
        this.penalti = penalti;
    }
    public int getTacNumber(){
        return tacNumber;
    }
    public void setTacNumber(){
        this.tacNumber = tacNumber;
    }
    public int getPenalti(){
        return penalti;
    }
    public void setPenalti(){
        this.penalti = penalti;
    }
    public void tac(){
        System.out.println(this.getTeamName() + " derbi maçında " + this.getTacNumber()+ " tane taç yapmıştır.");
    }
    public void penalti(){
        System.out.println(this.getTeamName() + " derbi maçında " + this.getPenalti() + " tane penaltı atmıştır.");
    }
}
