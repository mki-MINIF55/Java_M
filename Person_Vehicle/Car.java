/**
   * �e�׽ Vehicle
   * A Carݽ�׸� name color
   * B B fuel�ޯ��ҿ���  this.fuel
   * C fuel����ҿ���  fuel
   * D �ް��o�͗pҿ��� ��̫�Ēl�Ƃ��ĺݿ�ق֕\������ �e�׽Vehicle���絰�ްײ��
   * E ���s�������󂯎��ҿ���  distance ���s���� (�P�ʂ�km)�A fuel �K�\������(�P�ʂ�L)
   * F �����ʂ��v�Z���ݿ�ق֕\������ҿ���                 
   *   charge (�P�ʂ�L) 86�s�� �����ʔ��� ���������ꍇ��fuel��100���� ������ł��Ȃ��ꍇ��fuel�̒l���X�V
     
 
  /* @author Miyashita m
   * @version 2023 1/6
   */
// ----------------------------------------------------------------

class Car extends Vehicle {

  private int fuel = 100;
  private final int FUEL_MAX = 100;
  private final int LITRE_MIN = 0;

  /** �e�׽ Vehicle
   * A CAr�ݽ�׸�
   *
   * @param name,color
   * @return �Ȃ�
   */
  Car(String name, String color) {
    super(name, color);
  }

  /**
   * B fuel�ޯ��ҿ���
   *
   * @param �Ȃ�
   * @return this.fuel
   */
  public int getFuel() {
    return this.fuel;
  }

  /**
   * C fuel����ҿ���
   *
   * @param fuel
   * @return �Ȃ�
   */
  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  /**
   * D �ް��o�͗pҿ��� ��̫�Ēl�Ƃ��ĺݿ�ق֕\������
   * �e�׽Vehicle���絰�ްײ��
   * @param �Ȃ�
   * @return �Ȃ�
   */
  public void printData() {
    super.printData();
    System.out.println(Consta.FUEL_INFO + this.fuel + Consta.DISTANCE_REC_L);
  }

  /**
   * E ���s�������󂯎��ҿ���
   *
   * @param distance ���s����
   *                 (�P�ʂ�km)
   *
   *                 59�s�� ���s��������K�\�����ʂ����������ʂ���������źݿ�ق֕\��
   * @param distance ���s����
   * @param
   * @return �Ȃ�
   */
  public void run(int distance) {
    System.out.println(distance + Consta.DISTANCE_REPO_INFO);

    /* ���s����distance���K�\������fuel�ȉ����������A�l���X�V
     *���s�������K�\�����ʂ��������Ƃ� */

    if (distance <= this.fuel) {
      this.distance += distance;
      this.fuel -= distance;
    } else {
      System.out.println(Consta.DISTANCE_REPO_MSG);
    }
    System.out.println(
      Consta.DISTANCE_INFO + this.distance + Consta.DISTANCE_REC_K
    );
    System.out.println(Consta.FUEL_INFO + this.fuel + Consta.DISTANCE_REC_L);
  }

  //
  /**
   * F �����ʂ��v�Z���ݿ�ق֕\������ҿ���
   *
   * @param charge
   *               (�P�ʂ�L)
   *               86�s�� �����ʔ���
   *               ���������ꍇ��fuel��100����
   *               ������ł��Ȃ��ꍇ��fuel�̒l���X�V
   * @return �Ȃ�
   */
  public void charge(int litre) {
    System.out.println(litre + Consta.CHRGE_MSG);

    // �����ʔ���
    if (litre <= LITRE_MIN) {
      System.out.println(Consta.CHRGE_NG_MSG);
    } else if (litre + this.fuel >= FUEL_MAX) {
      System.out.println(Consta.CHRGE_FULL_MSG);
      this.fuel += FUEL_MAX - this.fuel;
    } else {
      this.fuel += litre;
    }
    System.out.println(Consta.FUEL_INFO + this.fuel + Consta.DISTANCE_REC_L);
  }
}
