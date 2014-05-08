package action;

import model.Board73Bean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.BoardDao;


@SuppressWarnings({ "serial", "rawtypes" })
public class WriteAction extends ActionSupport implements Preparable,
		ModelDriven {

	@SuppressWarnings("unused")
	private BoardDao dao;//데이터베이스 연동 레퍼런스(BoardDao)
	private Board73Bean boardVo;
	
	public WriteAction(){
		dao=BoardDao.getInstance();//싱글톤 연동객체 생성
	}//기본생성자 정의
		
	/*게시판 글쓰기 폼*/
	public String form() throws Exception{
		return SUCCESS;//리절트 코드 문자열 상수값 SUCCESS를 리턴하면
		               //struts.xml에서 result name="success"로 받는다.
	}
	
	//게시판 저장 액션
	public String execute() throws Exception{
		dao.insertB(boardVo);//저장메서드 호출
		return SUCCESS;//리절트 코드문자열 상수값 SUCCESS를 반환하면 struts.xml에서 받는다.
	}
	
	@Override
	public Object getModel() {
		return boardVo;
	}

	@Override
	public void prepare() throws Exception {
         boardVo=new Board73Bean();
         //prepare()추상메서드는 Prepareable인터페이스추상메서드로
         //미리 객체를 생성하게한다.
         
	}
}