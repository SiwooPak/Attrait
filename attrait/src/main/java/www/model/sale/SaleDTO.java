package www.model.sale;

import www.model.pdt.PdtDTO;

public class SaleDTO {
	private String scode;
	private int sqty;
	private int stotal;
	private String sdate;
	private String pcode;
	private PdtDTO pdtdto;
	
	public SaleDTO(){
		super();
	}
	
	public SaleDTO(String scode, int sqty, int stotal, String sdate, String pcode, PdtDTO pdtdto) {
		super();
		this.scode = scode;
		this.sqty = sqty;
		this.stotal = stotal;
		this.sdate = sdate;
		this.pcode = pcode;
		this.pdtdto = pdtdto;
	}
	
	
	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	/**
	 * @return the sqty
	 */
	public int getSqty() {
		return sqty;
	}
	/**
	 * @param sqty the sqty to set
	 */
	public void setSqty(int sqty) {
		this.sqty = sqty;
	}
	/**
	 * @return the stotal
	 */
	public int getStotal() {
		return stotal;
	}
	/**
	 * @param stotal the stotal to set
	 */
	public void setStotal(int stotal) {
		this.stotal = stotal;
	}
	/**
	 * @return the sdate
	 */
	public String getSdate() {
		return sdate;
	}
	/**
	 * @param sdate the sdate to set
	 */
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public PdtDTO getPdtdto() {
		return pdtdto;
	}
	public void setPdtdto(PdtDTO pdtdto) {
		this.pdtdto = pdtdto;
	}

	@Override
	public String toString() {
		return "SaleDTO [scode=" + scode + ", sqty=" + sqty + ", stotal=" + stotal + ", sdate=" + sdate + ", pcode="
				+ pcode + ", pdtdto=" + pdtdto + "]";
	}
	
}
