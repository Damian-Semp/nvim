public class Robot {
  String model;
  int poziomBaterii = 90;


 public void przedstawSie() {
      system.out.println("Dane Robota")
 }
 public static void main(String[] args) {
        Robot mojRobot = new Robot();
        mojRobot.przedstawSie();  
 }
}
