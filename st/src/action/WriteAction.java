package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

@SuppressWarnings({ "serial", "rawtypes" })
public class WriteAction extends ActionSupport implements Preparable,
		ModelDriven {

	/*게시판 글쓰기 폼*/
	public String form() throws Exception{
		return SUCCESS;//리절트 코드 문자열 상수값 SUCCESS를 리턴하면
		               //struts.xml에서 result name="success"로 받는다.
	}
	@Override
	public Object getModel() {
		return null;
	}

	@Override
	public void prepare() throws Exception {

	}
}