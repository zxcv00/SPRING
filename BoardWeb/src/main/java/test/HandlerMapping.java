package test;

import java.util.HashMap;
import java.util.Map;

import com.mirim.view.board.DeleteBoardController;
import com.mirim.view.board.GetBoardController;
import com.mirim.view.board.GetBoardListController;
import com.mirim.view.board.InsertBoardController;
import com.mirim.view.board.UpdateBoardController;
import com.mirim.view.user.LoginController;
import com.mirim.view.user.LogoutController;

public class HandlerMapping {
	private Map <String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
