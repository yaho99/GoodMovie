package cinema;

public class Ticketing {
	private String tknum;	//예매번호		
	private String memID;	//회원id
	private Boolean discount;	//할인여부
	private String payMethod;	//결제 방법
	private int pNum;	//인원수
	private int total;	//총금액
	private String rsvDate;	//예매날짜 Date??
	private String enno;		//등록번호
	private String reno;	//리뷰번호
	private String reContent;	//리뷰 내용
	private String revDate;	//리뷰 작성날짜 Date??
	private double score;	//평점
	public String getTknum() {
		return tknum;
	}
	public void setTknum(String tknum) {
		this.tknum = tknum;
	}
	public String getMemID() {
		return memID;
	}
	public void setMemID(String memID) {
		this.memID = memID;
	}
	public Boolean getDiscount() {
		return discount;
	}
	public void setDiscount(Boolean discount) {
		this.discount = discount;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getRsvDate() {
		return rsvDate;
	}
	public void setRsvDate(String rsvDate) {
		this.rsvDate = rsvDate;
	}
	public String getEnno() {
		return enno;
	}
	public void setEnno(String enno) {
		this.enno = enno;
	}
	public String getReno() {
		return reno;
	}
	public void setReno(String reno) {
		this.reno = reno;
	}
	public String getReContent() {
		return reContent;
	}
	public void setReContent(String reContent) {
		this.reContent = reContent;
	}
	public String getRevDate() {
		return revDate;
	}
	public void setRevDate(String revDate) {
		this.revDate = revDate;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}
