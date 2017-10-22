package www.model.pdt;

public class PdtDTO {
	private String pcode;
	private String ccode;
	private String pname;
	private int price;
	private String content;
	private int amount;
	private int inprice;
	private String date;
	
	public PdtDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PdtDTO(String pcode, String ccode, String pname, int price, String content, int amount, int inprice,
			String date) {
		super();
		this.pcode = pcode;
		this.ccode = ccode;
		this.pname = pname;
		this.price = price;
		this.content = content;
		this.amount = amount;
		this.inprice = inprice;
		this.date = date;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getInprice() {
		return inprice;
	}

	public void setInprice(int inprice) {
		this.inprice = inprice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "PdtDTO [pcode=" + pcode + ", ccode=" + ccode + ", pname=" + pname + ", price=" + price + ", content="
				+ content + ", amount=" + amount + ", inprice=" + inprice + ", date=" + date + "]";
	}
	
}
