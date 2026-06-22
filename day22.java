public class day22 {
    class Car {
        private int speed; // 速度(Km/h)

        // speedの値を1増やす。ただし最大でも80までとする
        public void speedUp() {
            if (speed < 80) {
                speed++;
            }
        }

        // speedの値を1減らす。ただし0以下にはならない
        public void speedDown() {
            if (speed > 0) {
                speed--;
            }
        }

        // speedを取得するメソッド
        public int getSpeed() {
            return speed;
        }
    }

    public static void main(String[] args) {
        day22 d = new day22();
        Car car = d.new Car();

        System.out.println("現在の速度は" + car.getSpeed() + "Km/hです。");
        car.speedUp();
        car.speedUp();
        car.speedUp();
        System.out.println("現在の速度は" + car.getSpeed() + "Km/hです。");
        car.speedDown();
        System.out.println("現在の速度は" + car.getSpeed() + "Km/hです。");
    }
}