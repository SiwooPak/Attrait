package www.model.sale;

public class DSaleDTO {
	private int dayno;				 
    private int day_qty;                
    private int day_total;               
    private String today;
     
	public DSaleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DSaleDTO(int dayno, int day_qty, int day_total, String today) {
		super();
		this.dayno = dayno;
		this.day_qty = day_qty;
		this.day_total = day_total;
		this.today = today;
	}

	public int getDayno() {
		return dayno;
	}

	public void setDayno(int dayno) {
		this.dayno = dayno;
	}

	public int getDay_qty() {
		return day_qty;
	}

	public void setDay_qty(int day_qty) {
		this.day_qty = day_qty;
	}

	public int getDay_total() {
		return day_total;
	}

	public void setDay_total(int day_total) {
		this.day_total = day_total;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	@Override
	public String toString() {
		return "DSaleDTO [dayno=" + dayno + ", day_qty=" + day_qty + ", day_total=" + day_total + ", today=" + today
				+ "]";
	} 
}
