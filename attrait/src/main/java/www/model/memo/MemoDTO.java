package www.model.memo;

public class MemoDTO { // 테이블과 매핑되게 해라

	// 테이블 컬럼명들을 가져옴
	private int memono;
	private String title;
	private String content;
	private String wdate;
	private int viewcnt;
	private int grpno;
	private int indent;
	private int ansnum;


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getGrpno() {
		return grpno;
	}

	public void setGrpno(int grpno) {
		this.grpno = grpno;
	}

	public int getIndent() {
		return indent;
	}

	public void setIndent(int indent) {
		this.indent = indent;
	}

	public int getAnsnum() {
		return ansnum;
	}

	public void setAnsnum(int ansnum) {
		this.ansnum = ansnum;
	}

	// 필드 get,set
	public int getMemono() {
		return memono;
	}

	public void setMemono(int memono) {
		this.memono = memono;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public int getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}

}
