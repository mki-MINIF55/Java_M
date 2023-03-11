/**
   * 親ｸﾗｽ Vehicle
   * Bycleｺﾝｽﾄﾗｸﾀ name color
   * Bycycleで走行する距離を入力から受付けし、表示するﾒｿｯﾄﾞ run() distance
  
  /* @author Miyashita m
   * @version 2023 1/6
   */
// ----------------------------------------------------------------

class Bicycle extends Vehicle {

  /* @param name,color
   * @return なし
   */

  Bicycle(String name, String color) {
    super(name, color);
  }

  /**
   * D 走行距離を受け取るﾒｿｯﾄﾞ
   *
   * @param distance 走行距離
   *                 (単位はkm)
   *
   * @param distance 走行距離
   * @return なし
   */
  public void run(int distance) {
    System.out.println(distance + Consta.DISTANCE_REPO_INFO);
    this.distance += distance;
    System.out.println(
      Consta.DISTANCE_INFO + this.distance + Consta.DISTANCE_REC_K
    );
  }
}
