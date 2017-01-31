package mvc.main;

import mvc.controller.HobbyListController;
import mvc.model.HobbyList;
import mvc.view.ComboView;
import mvc.view.InputView;
import mvc.view.ListView;

public class HobbyTest {

	public static void main(String[] args) {
		
		ListView myListView = new ListView("List View Frame");
		ComboView myComboView = new ComboView("Combo View Frame");
		InputView inputView = new InputView("Input View Frame");
		
		HobbyList hobbyList = new HobbyList();
		
		@SuppressWarnings("unused")
		HobbyListController hobbyListController = new HobbyListController(myComboView, myListView, inputView, hobbyList);

	}

}
