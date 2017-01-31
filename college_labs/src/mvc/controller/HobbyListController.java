package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.exception.EmptyFieldException;
import mvc.model.HobbyList;
import mvc.view.ComboView;
import mvc.view.InputView;
import mvc.view.ListView;

public class HobbyListController {

	private ComboView comboView;
	private ListView listView;
	private InputView inputView;
	private HobbyList hobbyListModel;
	
	//Constructor
	public HobbyListController(ComboView comboView, ListView listView, InputView inputView, HobbyList hobbyListModel) {
		super();
		this.comboView = comboView;
		this.listView = listView;
		this.inputView = inputView;
		this.hobbyListModel = hobbyListModel;
		
		this.inputView.addInputValueListener(new HobbyListPopulator());
		this.inputView.refreshHobbyListListener(new HobbyListRefresher());
	}
	
	//Inner class for actionListener, add button
	class HobbyListPopulator implements ActionListener{

		String inputValue = null;
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("add button");
			System.out.println("sys: " + inputView.getInputValue());
			if(inputView.getInputValue().equals("")) {
				System.out.println("sys" + inputView.getInputValue());
					throw new EmptyFieldException("Invalid Empty Submition");
			}
			inputValue = inputView.getInputValue();
			
			hobbyListModel.addHobby(inputValue);	
		}
	} // end add inner
	
	//Inner class for refresh HobbyList
	class HobbyListRefresher implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("refresh Button");
			listView.setJListData(hobbyListModel.getHobbyList());
			comboView.setJComboBox(hobbyListModel.getHobbyList());
			
		}
		
	}
}
