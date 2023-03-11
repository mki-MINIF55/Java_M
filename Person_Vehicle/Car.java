/**
   * 親ｸﾗｽ Vehicle
   * A Carﾝｽﾄﾗｸﾀ name color
   * B B fuelｹﾞｯﾀｰﾒｿｯﾄﾞ  this.fuel
   * C fuelｾｯﾀｰﾒｿｯﾄﾞ  fuel
   * D ﾃﾞｰﾀ出力用ﾒｿｯﾄﾞ ﾃﾞﾌｫﾙﾄ値としてｺﾝｿｰﾙへ表示する 親ｸﾗｽVehicleからｵｰﾊﾞｰﾗｲﾄﾞ
   * E 走行距離を受け取るﾒｿｯﾄﾞ  distance 走行距離 (単位はkm)、 fuel ガソリン量(単位はL)
   * F 給油量を計算しｺﾝｿｰﾙへ表示するﾒｿｯﾄﾞ                 
   *   charge (単位はL) 86行目 給油量判定 給油した場合はfuelに100を代入 いずれでもない場合はfuelの値を更新
     
 
  /* @author Miyashita m
   * @version 2023 1/6
   */
// ----------------------------------------------------------------

class Car extends Vehicle {

  private int fuel = 100;
  private final int FUEL_MAX = 100;
  private final int LITRE_MIN = 0;

  /** 親ｸﾗｽ Vehicle
   * A CArｺﾝｽﾄﾗｸﾀ
   *
   * @param name,color
   * @return なし
   */
  Car(String name, String color) {
    super(name, color);
  }

  /**
   * B fuelｹﾞｯﾀｰﾒｿｯﾄﾞ
   *
   * @param なし
   * @return this.fuel
   */
  public int getFuel() {
    return this.fuel;
  }

  /**
   * C fuelｾｯﾀｰﾒｿｯﾄﾞ
   *
   * @param fuel
   * @return なし
   */
  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  /**
   * D ﾃﾞｰﾀ出力用ﾒｿｯﾄﾞ ﾃﾞﾌｫﾙﾄ値としてｺﾝｿｰﾙへ表示する
   * 親ｸﾗｽVehicleからｵｰﾊﾞｰﾗｲﾄﾞ
   * @param なし
   * @return なし
   */
  public void printData() {
    super.printData();
    System.out.println(Consta.FUEL_INFO + this.fuel + Consta.DISTANCE_REC_L);
  }

  /**
   * E 走行距離を受け取るﾒｿｯﾄﾞ
   *
   * @param distance 走行距離
   *                 (単位はkm)
   *
   *                 59行目 走行距離からガソリン量を検査し結果を条件分岐でｺﾝｿｰﾙへ表示
   * @param distance 走行距離
   * @param
   * @return なし
   */
  public void run(int distance) {
    System.out.println(distance + Consta.DISTANCE_REPO_INFO);

    /* 走行距離distanceがガソリン量fuel以下だった時、値を更新
     *走行距離がガソリン量を上回ったとき */

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
   * F 給油量を計算しｺﾝｿｰﾙへ表示するﾒｿｯﾄﾞ
   *
   * @param charge
   *               (単位はL)
   *               86行目 給油量判定
   *               給油した場合はfuelに100を代入
   *               いずれでもない場合はfuelの値を更新
   * @return なし
   */
  public void charge(int litre) {
    System.out.println(litre + Consta.CHRGE_MSG);

    // 給油量判定
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
