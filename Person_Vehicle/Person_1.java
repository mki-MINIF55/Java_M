import java.lang.Math;
import java.util.Scanner;

/* ҿ��ޏW��׽
 * �萔�׽ Consta_Person
 * A ���������͂��郁�\�b�h Q_Input()
 * B csv����ǂݍ���ArrayList�̔z��ɂ��i�[���g��for���œǂݍ��񂾑S�Ă�ArrayList��ݿ�قɕ\������ҿ��� array_List()
 * C csv����ǂݍ���ArrayList��z��ɂ��i�[����ArrayList[]���画�肵�����ʂ�ݿ�قɕ\������ҿ��� arry_Serch_Data()
 *
 * @author Miyashita m
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

  //���͎�t�p��Scanner��p��
  Scanner scanner = new Scanner(System.in);

  // ----------------------------------------------------------------
  /**
   * A �l�����̕\���l���A���O�A�����A�N��A�g���A�̏d�̓��͏�����t��
   * ��ȰсABMI�l���Z�o�����Nor���N�ł͂Ȃ�����
   * ����ɁA���͂��󂯕t�����l������ō��N���
   * ���ϔN��𔻒肵�ݿ�ق֏o�͂���ҿ���
   *
   *�� �g�pҿ��ނ���
   * print_Data() �Aage_Judge(int age, int AGE_JUDGE)�A bmi_Judge()
   * @param �Ȃ�
   * @return �Ȃ�
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
   * B ���͂Ŏ󂯕t������ȰсA�N���ݿ�قɕ\������ҿ��� ��̫�Ēl�Ƃ��ĺݿ�ق֕\������

   *
   *�g�pҿ��ނ���
   * full_Name(first_Name, last_Name)
   * @param �Ȃ�
   * @return �Ȃ�
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
   * C ���͂Ŏ󂯕t�������O����N��疢���N�A���N�𔻒肵�ݿ�قɕ\������ҿ���
   *
   * �g�pҿ��ނ���
   * full_Name(first_Name, last_Name)
   * @param age AGE_JUDGE
   * @return �Ȃ�
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
   * D BMIҿ��ށAis_Healthy���\�b�h���g�p���u���N�v�u���N�ł͂Ȃ��v�̔��肵�ݿ�قɕ\������ҿ���
   *
   * �g�pҿ��ނ���
   * bmi(height, weight)�Ais_Healthy(bmi)
   * @param �Ȃ�
   * @return �Ȃ�
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
   * E ���͂Ŏ󂯕t�������O�A�������������邷��ҿ���
   *
   * @param first_Name,last_Name
   * @return first_Name + last_Name
   */
  public static String full_Name(String first_Name, String last_Name) {
    return first_Name + last_Name;
  }

  /**
   * F ���͂Ŏ󂯕t�����g���A�̏d����BMI���Z�o���邷��ҿ���
   *
   * @param height,weight
   * @return weight / height / height
   */
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  /**
   * F bmi�l���r����ҿ���
   *
   * @param bmi
   * @return bmi >= BMI_MIN && bmi < BMI_MAX
   */
  public static boolean is_Healthy(double bmi) {
    return bmi >= BMI_MIN && bmi < BMI_MAX;
  }

  /**
   * G ��蕨�̏��L�҂�Set���龯��ҿ���
   *
   * @param Vehicle vehicle
   * @return �Ȃ�
   */
  public void buy(Vehicle vehicle) {
    vehicle.setOwner(this);
  }
}
