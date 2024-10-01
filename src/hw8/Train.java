package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	Train() {
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getStart() {
		return start;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getDest() {
		return dest;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double price() {
		return price;
	}

	Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	// 覆寫 toString() 方法以方便輸出
	@Override
	public String toString() {
		return number + " " + type + " " + start + " " + dest + " " + price;
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Train train = (Train) obj;
        return number == train.number;
    }

	@Override
    public int hashCode() {
        return Objects.hash(number);
    }

	@Override
	public int compareTo(Train o) {
		return Integer.compare(o.number, this.number); // 由大到小
	}

}