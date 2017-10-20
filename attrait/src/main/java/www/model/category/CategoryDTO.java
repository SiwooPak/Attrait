package www.model.category;

public class CategoryDTO {
	
	private String ccode;		//pk
	private String title;		//이름
	private String parent_id;	//부모pk
	private char use_yn;		//사용여부
	private String url;			//주소
	private String c_class;		//icon
	private char division;		//메뉴인지 카테고리인지 구분
	private int depth;			//메뉴깊이
	private int sort_no;		//정렬순서
	
	public CategoryDTO(String ccode, String title, String parent_id, char use_yn, String url, String c_class,
			char division, int depth, int sort_no) {
		super();
		this.ccode = ccode;
		this.title = title;
		this.parent_id = parent_id;
		this.use_yn = use_yn;
		this.url = url;
		this.c_class = c_class;
		this.division = division;
		this.depth = depth;
		this.sort_no = sort_no;
	}

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public char getUse_yn() {
		return use_yn;
	}

	public void setUse_yn(char use_yn) {
		this.use_yn = use_yn;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getC_class() {
		return c_class;
	}

	public void setC_class(String c_class) {
		this.c_class = c_class;
	}

	public char getDivision() {
		return division;
	}

	public void setDivision(char division) {
		this.division = division;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getSort_no() {
		return sort_no;
	}

	public void setSort_no(int sort_no) {
		this.sort_no = sort_no;
	}

	@Override
	public String toString() {
		return "CategoryDTO [ccode=" + ccode + ", title=" + title + ", parent_id=" + parent_id + ", use_yn=" + use_yn
				+ ", url=" + url + ", c_class=" + c_class + ", division=" + division + ", depth=" + depth + ", sort_no="
				+ sort_no + "]";
	}
}
