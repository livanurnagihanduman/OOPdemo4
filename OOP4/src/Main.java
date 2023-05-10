public class Main {
    public static void main(String[] args) {

        System.out.println("================================\n" +
                           "GS & BJK DERBİ WELCOME\n" +
                           "===============================\n");
        ESporDemo spor = new ESporDemo("Maç",1,"Sarı-KIrmızı,Siyah-Beyaz",11,2,3);
        spor.getGoalNumber();

        System.out.println("Derbi maçında GS kaç tane faul yapmıştır?");
        GSdemo mac = new GSdemo("GALATASARAY",1,"Sarı-Kırmızı",11,3,2,4,8);
        mac.mac2();
        mac.getGoalNumber();

        BJKdemo mac1 = new BJKdemo("BEŞİKTAŞ",1,"Siyah-Beyaz",11,1,4,3,5);
        System.out.println("Derbi maçında BEŞİKTAŞ kaç tane taç yapmıştır?");
        mac1.tac();
        System.out.println("Derbi maçında BEŞİKTAŞ kaç tane penaltı atmıştır?");
        mac1.penalti();
        mac1.getGoalNumber();





    }
}