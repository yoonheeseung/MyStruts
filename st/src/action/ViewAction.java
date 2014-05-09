package action;

import model.Board73Bean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.BoardDao;

public class ViewAction extends ActionSupport implements Preparable,ModelDriven{

	private BoardDao dao;//조회수 증가를 위한 dao
	private Board73Bean boardVo;//db에서 검색된 자료를 저장하기위한 객체
	private int num;//get방식으로 넘어온 글 번호를 저장하기 위한 변수
	private String pwdarg;//비번을 저장하기 위한 변수-저장하고 가져오기 위한 getter/setter를 만들어야함
	
	
	public ViewAction(){
		dao=BoardDao.getInstance();
	}//생성자 정의
	
	//내용보기 액션(기본 execute()메서드를 호출함)
	@Override
	public String execute() throws Exception {
		dao.updateHit(num);//조회수 증가
		boardVo=dao.getCont(num);
		//디비로부터 내용물 가져옴
		return SUCCESS;
	}
	
	//비번 체크 액션
	public String checkForm() throws Exception{
		return SUCCESS;
	}
	
	//비번 체크 완료 액션
	public String checkAction() throws Exception{
		boardVo=dao.getCont(num);
		//디비로 부터 비번을 가져옴.
		if(boardVo.getBoard_pwd().equals(pwdarg)==false){
			return ERROR;
		}
		return SUCCESS;
	}
	
	//prepare()에서 생성한 boardVo를 getModel()로 반환함.
	@Override
	public Object getModel() {
		return boardVo;
	}
	@Override
	public void prepare() throws Exception {
    boardVo=new Board73Bean();
	}
	
	//setter/getter생성
	public Board73Bean getBoardVo() {
		return boardVo;
	}

	public void setBoardVo(Board73Bean boardVo) {
		this.boardVo = boardVo;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPwdarg() {
		return pwdarg;
	}
	public void setPwdarg(String pwdarg) {
		this.pwdarg = pwdarg;
	}
	
	

	 
	
}
