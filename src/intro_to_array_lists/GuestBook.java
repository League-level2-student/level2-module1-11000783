package intro_to_array_lists;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doner
	public static void main(String[] args) {
		new GuestBook().gui();

	}

	JButton button1 = new JButton("Add name");
	JButton button2 = new JButton("View names");
	ArrayList<String> names = new ArrayList<String>();
	void gui() {
		JFrame frame = new JFrame();
		JPanel pan = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan.add(button1);
		pan.add(button2);
		frame.add(pan);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button1.setVisible(true);
		button2.setVisible(true);
		frame.setSize(400, 400);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String name = JOptionPane.showInputDialog("Input name");
			names.add(name);
		}
		
if (e.getSource() == button2) {
	String s = "";
	for(int i = 0; i < names.size(); i++){
		s += names.get(i);
		s  += "\n";
		
	}
	JOptionPane.showMessageDialog(null,  s);
}
	}
}
