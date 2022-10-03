package ex02;

import java.util.Random;

public class GeraNum {
	private int num;

    public GeraNum() {
    }

    public int getNum() {
        return num;
    }

    public void setNum() {
        Random rand = new Random();
        this.num = rand.nextInt(1000 - 1) + 1;
    }

}
