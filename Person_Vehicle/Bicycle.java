/**
   * �e�׽ Vehicle
   * Bycle�ݽ�׸� name color
   * Bycycle�ő��s���鋗������͂����t�����A�\������ҿ��� run() distance
  
  /* @author Miyashita m
   * @version 2023 1/6
   */
// ----------------------------------------------------------------

class Bicycle extends Vehicle {

  /* @param name,color
   * @return �Ȃ�
   */

  Bicycle(String name, String color) {
    super(name, color);
  }

  /**
   * D ���s�������󂯎��ҿ���
   *
   * @param distance ���s����
   *                 (�P�ʂ�km)
   *
   * @param distance ���s����
   * @return �Ȃ�
   */
  public void run(int distance) {
    System.out.println(distance + Consta.DISTANCE_REPO_INFO);
    this.distance += distance;
    System.out.println(
      Consta.DISTANCE_INFO + this.distance + Consta.DISTANCE_REC_K
    );
  }
}
