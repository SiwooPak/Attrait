package www.model.sale;

import www.model.pdt.PdtDTO;

public class SaleDTO {
	private int ssno;
	private int spoint;
	private int sqty;
	private int stotal;
	private String sdate;
	private PdtDTO pdtdto;
	
	public SaleDTO(int ssno,int spoint, int sqty, int stotal, String sdate){
		this.ssno = ssno;
		this.spoint = spoint;
		this.sqty = sqty;
		this.stotal = stotal;
		this.sdate = sdate;
	}
	public int getSsno() {
		return ssno;
	}
	public void setSsno(int ssno) {
		this.ssno = ssno;
	}
	/**
	 * @return the spoint
	 */
	public int getSpoint() {
		return spoint;
	}
	/**
	 * @param spoint the spoint to set
	 */
	public void setSpoint(int spoint) {
		this.spoint = spoint;
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
	
}
