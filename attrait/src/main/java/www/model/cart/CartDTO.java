package www.model.cart;

import www.model.pdt.PdtDTO;
import www.model.user.UserDTO;


public class CartDTO {
	private int cartno;
	
	private String u_id;
	private String pcode;
	private String pname;
	private String color;
	private String fname;
	private int psize;
	private int quantity;
	private int price;
	private int total;
	
	public CartDTO() {}
	
	public CartDTO(int cartno, String u_id, String pcode, String pname, String color, String fname, int psize,
			int quantity, int price, int total) {
		super();
		this.cartno = cartno;
		this.u_id = u_id;
		this.pcode = pcode;
		this.pname = pname;
		this.color = color;
		this.fname = fname;
		this.psize = psize;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
	}
	
	public int getCartno() {
		return cartno;
	}
	public void setCartno(int cartno) {
		this.cartno = cartno;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPsize() {
		return psize;
	}
	public void setPsize(int psize) {
		this.psize = psize;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}

	@Override
	public String toString() {
		return "CartDTO [cartno=" + cartno + ", u_id=" + u_id + ", pcode=" + pcode + ", pname=" + pname + ", color="
				+ color + ", fname=" + fname + ", psize=" + psize + ", quantity=" + quantity + ", price=" + price
				+ ", total=" + total + "]";
	}
	
}
