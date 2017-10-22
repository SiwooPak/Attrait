package www.model.sale;

public class MSaleDTO {
	private int mno;                  
    private String mon;               
    private int mon_qty;              
    private int mon_total;
    
	public MSaleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MSaleDTO(int mno, String mon, int mon_qty, int mon_total) {
		super();
		this.mno = mno;
		this.mon = mon;
		this.mon_qty = mon_qty;
		this.mon_total = mon_total;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMon() {
		return mon;
	}

	public void setMon(String mon) {
		this.mon = mon;
	}

	public int getMon_qty() {
		return mon_qty;
	}

	public void setMon_qty(int mon_qty) {
		this.mon_qty = mon_qty;
	}

	public int getMon_total() {
		return mon_total;
	}

	public void setMon_total(int mon_total) {
		this.mon_total = mon_total;
	}

	@Override
	public String toString() {
		return "MSaleDTO [mno=" + mno + ", mon=" + mon + ", mon_qty=" + mon_qty + ", mon_total=" + mon_total + "]";
	}
}
