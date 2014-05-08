package action;

import java.util.ArrayList;
import java.util.List;

import model.Board73Bean;

import com.opensymphony.xwork2.ActionSupport;

import dao.BoardDao;

@SuppressWarnings("serial")
public class ListAction extends ActionSupport {
	private BoardDao dao;
	private List<Board73Bean> list=new ArrayList<Board73Bean>();
	//한 개이상 목록을 저장하기 위한 컬렉션 제내릭 잭체 생성
	private int totalCount;//총 레코드 수를 저장하기 위한 변수
	

public ListAction(){
	dao=BoardDao.getInstance();
}//생성자 정의
	
	//게시판 리스트 액션
	public String execute() throws Exception{
		totalCount=dao.getCount();//전체 레코드 갯수를 가져옴.
	    list=dao.list();//전체 목록을 받아옴.
		return SUCCESS;
		//리절트 반환코드를 문자열 SUCCESS를 struts.xml에서 받는다.
	}

	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public List<Board73Bean> getList() {
		return list;
	}
	public void setList(List<Board73Bean> list) {
		this.list = list;
	}
	
	
	
}
