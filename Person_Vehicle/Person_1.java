import java.lang.Math;
import java.util.Scanner;

/* ﾒｿｯﾄﾞ集約ｸﾗｽ
 * 定数ｸﾗｽ Consta_Person
 * A 文字列を入力するメソッド Q_Input()
 * B csvから読み込みArrayListの配列にし格納し拡張for分で読み込んだ全てのArrayListをｺﾝｿｰﾙに表示するﾒｿｯﾄﾞ array_List()
 * C csvから読み込みArrayListを配列にし格納したArrayList[]から判定した結果をｺﾝｿｰﾙに表示するﾒｿｯﾄﾞ arry_Serch_Data()
 *
 * @author Miki
 * @version 2022 12/6
 */

class Person_1 {

  private static String first_Name;
  private static String last_Name;
  private static int age;
  private static double height;
  private static double weight;

  private static final int AGE_JUDGE = 20;
  private static final double BMI_MIN = 18.5;
  private static final double BMI_MAX = 25.0;
  private static int count = 0;
  private static int max_Age = 0;
  private static int totalAge = 0;

  //入力受付用のScannerを用意
  Scanner scanner = new Scanner(System.in);

  // ----------------------------------------------------------------
  /**
   * A 人数分の表示人数、名前、名字、年齢、身長、体重の入力情報を受付し
   * ﾌﾙﾈｰﾑ、BMI値を算出し健康or健康ではない判定
   * さらに、入力を受け付けた人数から最高年齢と
   * 平均年齢を判定しｺﾝｿｰﾙへ出力するﾒｿｯﾄﾞ
   *
   *他 使用ﾒｿｯﾄﾞあり
   * print_Data() 、age_Judge(int age, int AGE_JUDGE)、 bmi_Judge()
   * @param なし
   * @return なし
   */
  public void Q_Input() {
    System.out.println(Consta_Person.Q_SERACH);
    int qSerarch = scanner.nextInt();

    for (int i = 1; i <= qSerarch; i++) {
      System.out.println();
      System.out.println(i + Consta_Person.Num_count);
      count++;

      System.out.print(Consta_Person.NAME);
      first_Name = scanner.next();

      System.out.print(Consta_Person.LAST_NAME);
      last_Name = scanner.next();

      System.out.print(Consta_Person.AGE);
      age = scanner.nextInt();

      age_Judge(age, AGE_JUDGE);

      System.out.print(Consta_Person.HEIGHT);
      height = scanner.nextDouble();

      System.out.print(Consta_Person.WEIGHT);
      weight = scanner.nextDouble();

      System.out.println();
      print_Data();
      System.out.println();
      bmi_Judge();
    }
    System.out.println();
    System.out.println(
      Consta_Person.AGE_MAX_MSG + max_Age + Consta_Person.AGE_LAST_MSG
    );

    System.out.println(
      Consta_Person.AGE_AVE_MSG +
      totalAge /
      qSerarch +
      Consta_Person.AGE_LAST_MSG
    );
  }

  /**
   * B 入力で受け付けたﾌﾙﾈｰﾑ、年齢をｺﾝｿｰﾙに表示するﾒｿｯﾄﾞ ﾃﾞﾌｫﾙﾄ値としてｺﾝｿｰﾙへ表示する

   *
   *使用ﾒｿｯﾄﾞあり
   * full_Name(first_Name, last_Name)
   * @param なし
   * @return なし
   */
  public void print_Data() {
    System.out.println(
      Consta_Person.NAME +
      full_Name(first_Name, last_Name) +
      Consta_Person.FULLNAME_LAST_MSG
    );
    System.out.println(
      Consta_Person.AGE_MSG + age + Consta_Person.AGE_LAST_MSG
    );
  }

  /**
   * C 入力で受け付けた名前から年齢から未成年、成年を判定しｺﾝｿｰﾙに表示するﾒｿｯﾄﾞ
   *
   * 使用ﾒｿｯﾄﾞあり
   * full_Name(first_Name, last_Name)
   * @param age AGE_JUDGE
   * @return なし
   */
  public void age_Judge(int age, int AGE_JUDGE) {
    if (age >= AGE_JUDGE) {
      max_Age = age;
      totalAge += age;
      System.out.println(Consta_Person.HAGE_MSG);
    } else {
      System.out.println(Consta_Person.LAGE_MSG);
    }
  }

  /**
   * D BMIﾒｿｯﾄﾞ、is_Healthyメソッドを使用し「健康」「健康ではない」の判定しｺﾝｿｰﾙに表示するﾒｿｯﾄﾞ
   *
   * 使用ﾒｿｯﾄﾞあり
   * bmi(height, weight)、is_Healthy(bmi)
   * @param なし
   * @return なし
   */
  public static void bmi_Judge() {
    System.out.println(
      Consta_Person.HEIGHT_MSG + height + Consta_Person.HEIGHT_LAST_MSG
    );
    System.out.println(
      Consta_Person.WEIGHT_MSG + weight + Consta_Person.WEIGHT_LAST_MSG
    );

    double bmi = bmi(height, weight);
    System.out.println(
      Consta_Person.BMI_MSG + Math.round(bmi) + Consta_Person.FULLNAME_LAST_MSG
    );

    if (is_Healthy(bmi)) {
      System.out.println(Consta_Person.HEALTHY_MSG);
    } else {
      System.out.println(Consta_Person.HEALTHY_NG_MSG);
    }
  }

  /**
   * E 入力で受け付けた名前、名字を結合するするﾒｿｯﾄﾞ
   *
   * @param first_Name,last_Name
   * @return first_Name + last_Name
   */
  public static String full_Name(String first_Name, String last_Name) {
    return first_Name + last_Name;
  }

  /**
   * F 入力で受け付けた身長、体重からBMIを算出するするﾒｿｯﾄﾞ
   *
   * @param height,weight
   * @return weight / height / height
   */
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  /**
   * F bmi値を比較するﾒｿｯﾄﾞ
   *
   * @param bmi
   * @return bmi >= BMI_MIN && bmi < BMI_MAX
   */
  public static boolean is_Healthy(double bmi) {
    return bmi >= BMI_MIN && bmi < BMI_MAX;
  }

  /**
   * G 乗り物の所有者をSetするｾｯﾀｰﾒｿｯﾄﾞ
   *
   * @param Vehicle vehicle
   * @return なし
   */
  public void buy(Vehicle vehicle) {
    vehicle.setOwner(this);
  }
}
