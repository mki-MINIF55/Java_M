/**
 * Bicycle,Car�̐e�׽�ł��B
 *
 **/

/* @author Miyashita m
 * @version 2023 1/6
 */

abstract class Vehicle {

  private String name;
  private String color;
  protected int distance = 0;
  private Person_1 owner;

  /**
   * A ��蕨�̺ݽ�׸�
   *
   * @param name,color
   * @return �Ȃ�
   */
  Vehicle(String name, String color) {
    this.name = name;
    this.color = color;
  }

  /**
   * B ���� get set
   *
   * @param name,color,distance,owner,owner(Person_1 person)
   * @return name,color,distance,owner
   */
  public String getName() {
    return this.name;
  }

  public String getColor() {
    return this.color;
  }

  public int getDistance() {
    return this.distance;
  }

  public Person_1 getOwner() {
    return this.owner;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public void setOwner(Person_1 person) {
    this.owner = person;
  }

  /**
   * C �ް��o�͗pҿ��� ��̫�Ēl�Ƃ��ĺݿ�ق֕\������
   *
   * @param �Ȃ�
   * @return �Ȃ�
   */

  public void printData() {
    System.out.println(Consta.NAME_INFO + this.name);
    System.out.println(Consta.COLOR_INFO + this.color);
    System.out.println(
      Consta.DISTANCE_INFO + this.distance + Consta.DISTANCE_REC_K
    );
  }

  /**
   * D ���s�������󂯎�钊��ҿ���
   *
   * @param distance ���s����
   *                 (�P�ʂ�km)
   *
   * @param distance ���s����
   * @param
   * @return �Ȃ�
   */
  public abstract void run(int distance);
}
