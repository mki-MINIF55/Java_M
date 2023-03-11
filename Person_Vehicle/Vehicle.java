/**
 * Bicycle,Carの親ｸﾗｽです。
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
   * A 乗り物のｺﾝｽﾄﾗｸﾀ
   *
   * @param name,color
   * @return なし
   */
  Vehicle(String name, String color) {
    this.name = name;
    this.color = color;
  }

  /**
   * B ｱｸｾｻ get set
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
   * C ﾃﾞｰﾀ出力用ﾒｿｯﾄﾞ ﾃﾞﾌｫﾙﾄ値としてｺﾝｿｰﾙへ表示する
   *
   * @param なし
   * @return なし
   */

  public void printData() {
    System.out.println(Consta.NAME_INFO + this.name);
    System.out.println(Consta.COLOR_INFO + this.color);
    System.out.println(
      Consta.DISTANCE_INFO + this.distance + Consta.DISTANCE_REC_K
    );
  }

  /**
   * D 走行距離を受け取る抽象ﾒｿｯﾄﾞ
   *
   * @param distance 走行距離
   *                 (単位はkm)
   *
   * @param distance 走行距離
   * @param
   * @return なし
   */
  public abstract void run(int distance);
}
