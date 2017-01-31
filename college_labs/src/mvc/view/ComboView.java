package mvc.view;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import mvc.base.AbstractFrame;
import mvc.dao.MockDb;

public class ComboView extends AbstractFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> comboBox;
	//private HobbyList hobbyList;
	private MockDb mockDB;
	private DefaultComboBoxModel<String> defaultComboboxModel;

	public ComboView(String frameTitle) {
		super(frameTitle);
		
		mockDB = new MockDb();
		//hobbyList = new HobbyList();
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(getDefaultComboBoxModel());
		
		mainPanel.add(comboBox);
		revalidate();
		repaint();
	}

	//Getting prepared data model for populating JComboBox
	public DefaultComboBoxModel<String> getDefaultComboBoxModel() {
		defaultComboboxModel = new DefaultComboBoxModel<String>();
		for(Object hobbyName : mockDB.getMockDB()) {
			String hobby = hobbyName.toString();
			defaultComboboxModel.addElement(hobby);
		}
		return defaultComboboxModel;
	}
	
	//Set JComboBox content with populating with collection
	public void setJComboBox(ArrayList<Object> hobbies) {
		defaultComboboxModel = new DefaultComboBoxModel<String>();
		for(Object hobbyName : hobbies) {
			String hobby = hobbyName.toString();
			defaultComboboxModel.addElement(hobby);
		}
		comboBox.setModel(defaultComboboxModel);
		revalidate();
		repaint();
	}
}
