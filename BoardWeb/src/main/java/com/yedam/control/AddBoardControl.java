package com.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;

public class AddBoardControl implements Control {
	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		if(req.getMethod().equals("GET")){
			// 요청 재지정. // url에 직접 입력, 링크=> get 방식요청.
			req.getRequestDispatcher("/WEB-INF/views/addform.jsp").forward(req, resp);
		} else if (req.getMethod().equals("POST")) {
			//등록
			
			resp.sendRedirect("boardList.do"); // 요청 재지정.	
		}
	}
}
