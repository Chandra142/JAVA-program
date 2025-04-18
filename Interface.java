interface cook{
    public void prepare_food();
}
interface drive{
    public void race_vehicle();
}
class multifunctional_roobt implements cook,drive{
        public void prepare_food(){
            System.out.println("The food is preparing. . . . . . . . . . .");
        }
        public void race_vehicle(){
            System.out.println("The vehicle is racing. . . . . . . . . . . ");
        }
}
class  Main{
    public static void main(String[] args){
        multifunctional_roobt robo = new multifunctional_roobt();
        robo.prepare_food();
        robo.race_vehicle();
    }
}
