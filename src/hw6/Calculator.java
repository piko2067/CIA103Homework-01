package hw6;

public class Calculator {
	private double x;
	private double y;
	
	public  Calculator() {}
	
    public double powerXY(int x, int y) throws CalException {
        if (x == 0 && y == 0) {
            throw new CalException("x 與 y 同時為 0，無法計算次方!");
        }
        if (x < 0 || y < 0) {
            throw new CalException("次方為負值，結果回傳不為整數!");
        }
        return Math.pow(x, y);
    }
}