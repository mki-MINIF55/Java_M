import java.util.Scanner;

/* 
 * メインメソッド 出力するクラス 
 * 
 * @author Miki
 * @version 2023 1/6
 */
// ----------------------------------------------------------------

public class BicycleExe {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Person_1 person = new Person_1();
    Bicycle bicycle = new Bicycle(Consta.BICYCLE_NAME, Consta.BICYCLE_COLOR);
    Car car = new Car(Consta.CAR_NAME, Consta.BICYCLE_COLOR);

    person.Q_Input();

    System.out.println();
    System.out.print(Consta_Person.Q_VEH);
    System.out.println(
      Consta_Person.Q_VEH_NUM_BICYCLE + Consta_Person.Q_VEH_NUM_CAR
    );

    int q_Veh = scanner.nextInt();

    if (q_Veh == 1) {
      System.out.println(Consta_Person.ANS_BICYCLE + Consta_Person.ANS_SELECT);
      person.buy(bicycle);
      System.out.println(Consta_Person.ANS_BICYCLE);

      System.out.println(Consta.BICYCLE_INFO);
      bicycle.printData();
      System.out.println(Consta.LINE);
      System.out.println(Consta.BICYCLE_OWNER);
      bicycle.getOwner().print_Data();

      System.out.print(Consta.DISTANCE_MSG);
      int input_Distance_Bycycle = scanner.nextInt();

      bicycle.run(input_Distance_Bycycle);

      System.out.println(Consta.LINE_TWIN);
    } else {
      if (q_Veh == 2) {
        System.out.println(Consta_Person.ANS_CAR);
        person.buy(car);
        System.out.println(Consta_Person.ANS_CAR);

        System.out.println(Consta.CAR_INFO);
        car.printData();
        System.out.println(Consta.LINE);
        System.out.println(Consta.CAR_OWNER);
        car.getOwner().print_Data();

        System.out.print(Consta.DISTANCE_MSG);
        int input_Distance_Car = scanner.nextInt();

        car.run(input_Distance_Car);
        System.out.println(Consta.LINE);

        System.out.println(car.getFuel());
        System.out.print(Consta.CAR_FUEL_CHRAGE);
        int input_Charge = scanner.nextInt();

        car.charge(input_Charge);
      } else {
        System.out.println(Consta_Person.ANS_NG);
      }
    }
  }
}
