package model;

public class Board73Bean {

	/* struts 프레임웍과 ibatis를 사용할 때 반드시 지켜야할 규칙
	 * 1. board_write.jsp의 파라미터이름과 
	 *    Board73Bean.java의 Bean클래스의 변수명이 같아야 한다.
	 * 
	 * 2. 데이터베이스 연동 ORM ibatis를 사용하려면
	 *    반드시 테이블 필드명과 변수명이 같아야 한다.
	 *    다르면 1:1 매핑이 안되서 에러가
	 *    발생한다.
	 * 
	 * 3. 테이블 필드명 자료형과 변수 자료형이 같아야 한다.
	 * 
	 */

	private int board_no;
	private String board_name;
	private String board_title;
	private String board_pwd;
	private String board_cont;
	private int board_hit;
	private String board_date;

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public String getBoard_name() {
		return board_name;
	}

	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_pwd() {
		return board_pwd;
	}

	public void setBoard_pwd(String board_pwd) {
		this.board_pwd = board_pwd;
	}

	public String getBoard_cont() {
		return board_cont;
	}

	public void setBoard_cont(String board_cont) {
		this.board_cont = board_cont;
	}

	public int getBoard_hit() {
		return board_hit;
	}

	public void setBoard_hit(int board_hit) {
		this.board_hit = board_hit;
	}

	public String getBoard_date() {
		return board_date;
	}

	public void setBoard_date(String board_date) {
		this.board_date = board_date.substring(0, 10);
	}

}
