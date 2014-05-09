package dao;

import ibatis.SqlMapLocator;

import java.sql.SQLException;
import java.util.List;

import model.Board73Bean;

public class BoardDao {

	@SuppressWarnings("unused")
	private static BoardDao singleton; //정적변수 선언
	
	private BoardDao(){}//기본생성자 정의
	
	public static BoardDao getInstance(){
		if(singleton==null)
			singleton=new BoardDao();
		return singleton;
	}//정적메서드 정의

	public void insertB(Board73Bean boardVo) 
			throws SQLException {
	SqlMapLocator.getMapper().insert("b_in",boardVo);
	/*
	 * ibatis 쿼리문 실행메서드 정의
	 *  1.레코드 저장:insert()
	 *  2.레코드 수정:update()
	 *  3.레코드 삭제:delete()
	 *  4.단 한개의 레코드만을 검색 할때:queryForObject()
	 *  5.하나이상의 레코드를 검색해서 컬렉션 List로 반환 할때:queryForList()
	 *  
	 *  b_in은 Board.xml에서 정의한 insert 아이디 이름이다.
	 * 
	 */
		
	}//게시판 저장

	public int getCount() throws SQLException {
		
		return (int)SqlMapLocator.getMapper().queryForObject("bcount");
		//bcount는 select아이디이름
	}//총 레코드 갯수;

	public List<Board73Bean> list() throws SQLException{
		
		return SqlMapLocator.getMapper().queryForList("blist");
	}//전체목록

	public void updateHit(int num) throws SQLException {
		SqlMapLocator.getMapper().update("bhit",num);
		//bhit는 update 아이디 이름
	}//조회수 증가

	public Board73Bean getCont(int num) throws SQLException {
	    return (Board73Bean) SqlMapLocator.getMapper().queryForObject("bcont", num);
	    //bcont는 Board.xml의 select 아이디 이름이다.
	}//내용보기
	
	
	
}
