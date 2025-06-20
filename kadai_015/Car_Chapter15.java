package text.kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	// ギアの値により速度を変える
	public void gearChange(int afterGear) {
		switch (afterGear) {
			case 1 -> {
				this.speed = 10;
			}
			case 2 -> {
				this.speed = 20;
			}
			case 3 -> {
				this.speed = 30;
			}
			case 4 -> {
				this.speed = 40;
			}
			case 5 -> {
				this.speed = 50;
			}
			default -> {
				this.speed = 10;
			}
		}
		
		System.out.println("ギア" + this.gear + "から" + afterGear +"に切り替えました");		
		
		this.gear = afterGear;
		
	}
	
	// ギアチェンジ語の速度を表す
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
