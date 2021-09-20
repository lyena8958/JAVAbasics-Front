package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.common.Action;
import model.message.MessageDAO;
import model.message.MessageVO;

public class Msg_New implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	// class 인스턴스	
		// 리턴 forward 인스턴스화
		ActionForward forward = new ActionForward();
		// DAO VO 인스턴스화
		MessageDAO messageDAO = new MessageDAO();
		MessageVO messageVO = new MessageVO();

		// DAO 수행 필요 데이터
		messageVO.setUserID(request.getParameter("userID"));
		messageVO.setMsg(request.getParameter("msg"));
		
		// 댓글추가 실패
		if(!messageDAO.msg_INSERT(messageVO)){
			throw new IOException("MsgNew에서 발생!");			
		}
		
		// 추가 되었다면 메인페이지 이동
		forward.setRedirect(false);
		forward.setPath("main.do"); //메인페이지 이동
		return forward;

	}
	
}
