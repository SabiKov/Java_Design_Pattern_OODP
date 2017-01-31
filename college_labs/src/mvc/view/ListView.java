package mvc.view;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import mvc.base.AbstractFrame;
import mvc.dao.MockDb;

public class ListView extends AbstractFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList<Object> myHobbies;
	private MockDb mockDB;
	private DefaultListModel<Object> model;
	
	//Constructor -- inheritance
	public ListView(String frameTitle) {
		super(frameTitle);
	
		mockDB = new MockDb();

		myHobbies = new JList<Object>();
		myHobbies.setModel(getModel());
		
		myHobbies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		myHobbies.setLayoutOrientation(JList.VERTICAL);
		myHobbies.setVisibleRowCount(-1);
	
		JScrollPane listScroller = new JScrollPane(myHobbies);
		listScroller.setViewportView(myHobbies);
		listScroller.setPreferredSize(new Dimension(400, 20));
		
		mainPanel.add(listScroller);
		revalidate();
		repaint();
	}

	public DefaultListModel<Object> getModel() {
		model = new DefaultListModel<Object>();
		for(Object hobbyName : mockDB.getMockDB()) {
			String hobby = hobbyName.toString();
			model.addElement(hobby);
		}
		return model;
	}
	
	//Set JList with content of arrayList object
	public void setJListData(ArrayList<Object> hobbyList) {
		model = new DefaultListModel<Object>();
		for(Object hobbyName : hobbyList) {
			String hobby = hobbyName.toString();
			model.addElement(hobby);
		}
		//myHobbies = new JList();
		myHobbies.setModel(model);
		revalidate();
		repaint();
	}
}
