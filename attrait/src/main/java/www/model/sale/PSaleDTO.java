package www.model.sale;

public class PSaleDTO {
	private int pno;
	private String pcode;
	private int pdt_qty;
	private int pdt_total;
	
	public PSaleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PSaleDTO(int pno, String pcode, int pdt_qty, int pdt_total) {
		super();
		this.pno = pno;
		this.pcode = pcode;
		this.pdt_qty = pdt_qty;
		this.pdt_total = pdt_total;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public int getPdt_qty() {
		return pdt_qty;
	}

	public void setPdt_qty(int pdt_qty) {
		this.pdt_qty = pdt_qty;
	}

	public int getPdt_total() {
		return pdt_total;
	}

	public void setPdt_total(int pdt_total) {
		this.pdt_total = pdt_total;
	}

	@Override
	public String toString() {
		return "PSaleDTO [pno=" + pno + ", pcode=" + pcode + ", pdt_qty=" + pdt_qty + ", pdt_total=" + pdt_total + "]";
	}
}
