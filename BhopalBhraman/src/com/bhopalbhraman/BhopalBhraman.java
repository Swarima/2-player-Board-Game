package com.bhopalbhraman;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// @author Shivani and Swarima
public class BhopalBhraman extends JFrame implements ActionListener {

	JLabel southL1,southL2,southL3;//label for P1 location, Dice, P2 location
	JButton southB1,southB2;//Player1 and Player2 Buttons
	JButton southdumpP1, southdumpP2;//Waste chances button
	JLabel westL1, westL2, westL3, westL4, westL5, westL6, westL7,westL8, westL9, westL10, westL11, westL12, westL13, westL14, westL15, westL16;
	//West Panel Labels for Player1
	JLabel eastL1, eastL2, eastL3, eastL4, eastL5, eastL6, eastL7,eastL8, eastL9, eastL10, eastL11, eastL12, eastL13, eastL14, eastL15, eastL16;
	//East Panel Labels for Player2
	
	public BhopalBhraman(){    //Constructor of BhopalBhraman
		setLayout(new BorderLayout(0,0));//Layout of BhopalBhraman
		setSize(400,400);//Size of BhopalBhraman
		setTitle("BHOPAL BHRAMAN");//Title of BhopalBhraman
		setVisible(true);//Visibility of BhopalBhraman
		
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER,50,0));//South Panel of class
		panel1.setVisible(true);//Visibility of South Panel
		panel1.setBackground(Color.CYAN);//Background of South Panel
		panel1.setSize(600,200);//Size of South Panel
		add(panel1,BorderLayout.SOUTH);//Addition of South Panel in Frame
		southdumpP1 = new JButton("Dump P1");//Instantiation of southdumpP1 Button in South Panel
		panel1.add(southdumpP1);//addition of southdumpP1 Button in South Panel
		southdumpP1.addActionListener(this);//addition of Action Listener class in southdumpP1 Button
		southL2 = new JLabel("Current Location P1");//Instantiation of current location Label of Player1 in South Panel
		panel1.add(southL2);//Addition of current location Label of Player1 in South Panel
		 southB1 = new JButton("Player 1");//Instantiation of Player1 Button in South Panel
		panel1.add(southB1);//Addition of Player1 Button in South Panel
		southB1.addActionListener(this);//addition of Action Listener class in Player1 Button
		 southL1 = new JLabel("Dice");//Instantiation of Dice value Label in South Panel
		panel1.add(southL1);
		 southB2 = new JButton("Player 2");//Instantiation of Player2 Button in South Panel
		panel1.add(southB2);//Addition of Player2 Button in South Panel
		southB2.addActionListener(this);
		 southL3 = new JLabel("Current Location P2");//Instantiation of current location Label of Player2 in South Panel
		panel1.add(southL3);//Addition of current location Label of Player2 in South Panel
		southdumpP2 = new JButton("Dump P2");//Instantiation of southdumpP2 Button in South Panel
		panel1.add(southdumpP2);//addition of southdumpP2 Button in South Panel
		southdumpP2.addActionListener(this);//addition of Action Listener class in southdumpP2 Button
		
		JPanel panel2 = new JPanel(new GridLayout(16,1));
		//panel2.setSize(200,670);
		panel2.setBackground(Color.CYAN);
		panel2.setVisible(true);
		add(panel2,BorderLayout.WEST);
		westL1 = new JLabel("Player 1");
		panel2.add(westL1);
		westL2 = new JLabel("Lake View");
		westL2.setForeground(Color.blue);
		panel2.add(westL2);
		westL3 = new JLabel("Taj-Ul Masjid");
		westL3.setForeground(Color.blue);
		panel2.add(westL3);
		westL4 = new JLabel("VIP Road");
		westL4.setForeground(Color.blue);
		panel2.add(westL4);
		 westL5 = new JLabel("Mahadev Pani");
		westL5.setForeground(Color.blue);
		panel2.add(westL5);
		 westL6 = new JLabel("Shahpura Lake");
		westL6.setForeground(Color.blue);
		panel2.add(westL6);
		 westL7 = new JLabel("Kerwa Dam");
		westL7.setForeground(Color.blue);
		panel2.add(westL7);
		 westL8 = new JLabel("Science Centre");
		westL8.setForeground(Color.blue);
		panel2.add(westL8);
		 westL9 = new JLabel("Bharat Bhawan");
		westL9.setForeground(Color.blue);
		panel2.add(westL9);
		 westL10 = new JLabel("Shaurya Smarak");
		westL10.setForeground(Color.blue);
		panel2.add(westL10);
		 westL11 = new JLabel("Ser Sapata");
		westL11.setForeground(Color.blue);
		panel2.add(westL11);
		 westL12 = new JLabel("Van Vihar");
		westL12.setForeground(Color.blue);
		panel2.add(westL12);
		 westL13 = new JLabel("Manav Sanghralaya");
		westL13.setForeground(Color.blue);
		panel2.add(westL13);
		 westL14 = new JLabel("Birla Mandir");
		westL14.setForeground(Color.blue);
		panel2.add(westL14);
		 westL15 = new JLabel("Moti Masjid");
		westL15.setForeground(Color.blue);
		panel2.add(westL15);
		 westL16 = new JLabel("Lower Lake");
		westL16.setForeground(Color.blue);
		panel2.add(westL16);
		
		
		
		

		JPanel panel3 = new JPanel(new GridLayout(16,1));
		panel3.setBackground(Color.CYAN);
		//panel3.setSize(200,670);
		panel3.setVisible(true);
		add(panel3,BorderLayout.EAST);
		eastL1 = new JLabel("Player 2");
		panel3.add(eastL1);
		eastL2 = new JLabel("Lake View");
		eastL2.setForeground(Color.blue);
		panel3.add(eastL2);
		eastL3 = new JLabel("Taj-Ul Masjid");
		eastL3.setForeground(Color.blue);
		panel3.add(eastL3);
		eastL4 = new JLabel("VIP Road");
		eastL4.setForeground(Color.blue);
		panel3.add(eastL4);
		eastL5 = new JLabel("Mahadev Pani");
		eastL5.setForeground(Color.blue);
		panel3.add(eastL5);
		eastL6 = new JLabel("Shahpura Lake");
		eastL6.setForeground(Color.blue);
		panel3.add(eastL6);
		eastL7 = new JLabel("Kerwa Dam");
		eastL7.setForeground(Color.blue);
		panel3.add(eastL7);
		eastL8 = new JLabel("Science Centre");
		eastL8.setForeground(Color.blue);
		panel3.add(eastL8);
		eastL9 = new JLabel("Bharat Bhawan");
		eastL9.setForeground(Color.blue);
		panel3.add(eastL9);
		eastL10 = new JLabel("Shaurya Smarak");
		eastL10.setForeground(Color.blue);
		panel3.add(eastL10);
		eastL11 = new JLabel("Ser Sapata");
		eastL11.setForeground(Color.blue);
		panel3.add(eastL11);
		eastL12 = new JLabel("Van Vihar");
		eastL12.setForeground(Color.blue);
		panel3.add(eastL12);
		eastL13 = new JLabel("Manav Sanghralaya");
		eastL13.setForeground(Color.blue);
		panel3.add(eastL13);
		eastL14 = new JLabel("Birla Mandir");
		eastL14.setForeground(Color.blue);
		panel3.add(eastL14);
		eastL15 = new JLabel("Moti Masjid");
		eastL15.setForeground(Color.blue);
		panel3.add(eastL15);
		eastL16 = new JLabel("Lower Lake");
		eastL16.setForeground(Color.blue);
		panel3.add(eastL16);
		

		JPanel panel4 = new JPanel();
		JButton centerb2 = new JButton("Taj-Ul Masjid");
		centerb2.setBounds(100,100,178,40);
		panel4.add(centerb2);
		centerb2.addActionListener(this);
		JTextField Tajdown = new JTextField("                           1");
		Tajdown.setEditable(false);
		Tajdown.setBackground(Color.PINK);
		Tajdown.setBounds(100,185,178,30);
		panel4.add(Tajdown);
		JTextField Tajright = new JTextField("     2");
		Tajright.setEditable(false);
		Tajright.setBackground(Color.PINK);
		Tajright.setBounds(288,100,42,40);
		panel4.add(Tajright);
		
		
		JButton centerb3 = new JButton("VIP Road");
		centerb3.setBounds(340,100,178,40);
		panel4.add(centerb3);
		centerb3.addActionListener(this);
		JTextField VIPdown = new JTextField("                           3");
		VIPdown.setEditable(false);
		VIPdown.setBackground(Color.PINK);
		VIPdown.setBounds(340,185,178,30);
		panel4.add(VIPdown);
		JTextField VIPright = new JTextField("     4");
		VIPright.setEditable(false);
		VIPright.setBackground(Color.PINK);
		VIPright.setBounds(528,100,37,40);
		panel4.add(VIPright);
		JButton centerb4 = new JButton("Mahadev Pani");
		centerb4.setBounds(575,100,178,40);
		panel4.add(centerb4);
		centerb4.addActionListener(this);
		JTextField Mahadevdown = new JTextField("                           1");
		Mahadevdown.setEditable(false);
		Mahadevdown.setBackground(Color.PINK);
		Mahadevdown.setBounds(575,185,178,30);
		panel4.add(Mahadevdown);
		JTextField Mahadevright = new JTextField("     2");
		Mahadevright.setEditable(false);
		Mahadevright.setBackground(Color.PINK);
		Mahadevright.setBounds(763,100,37,40);
		panel4.add(Mahadevright);
		JButton centerb5 = new JButton("Shahpura Lake");
		centerb5.setBounds(810,100,178,40);
		panel4.add(centerb5);
		centerb5.addActionListener(this);
		JTextField Shahdown = new JTextField("                           3");
		Shahdown.setEditable(false);
		Shahdown.setBackground(Color.PINK);
		Shahdown.setBounds(810,185,178,30);
		panel4.add(Shahdown);
		JButton centerb1 = new JButton("Lake View");
		centerb1.setBounds(100,250,178,40);
		JTextField Lakedown = new JTextField("                           3");
		Lakedown.setEditable(false);
		Lakedown.setBackground(Color.PINK);
		Lakedown.setBounds(100,335,178,30);
		panel4.add(Lakedown);
		JTextField Lakeright = new JTextField("     2");
		Lakeright.setEditable(false);
		Lakeright.setBackground(Color.PINK);
		Lakeright.setBounds(288,250,42,40);
		panel4.add(Lakeright);
		panel4.add(centerb1);
		centerb1.addActionListener(this);
		JButton centerb6 = new JButton("Manav Sanghralaya");
		centerb6.setBounds(340,250,178,40);
		panel4.add(centerb6);
		centerb6.addActionListener(this);
		JTextField Manavdown = new JTextField("                           1");
		Manavdown.setEditable(false);
		Manavdown.setBackground(Color.PINK);
		Manavdown.setBounds(340,335,178,30);
		panel4.add(Manavdown);
		JTextField Manavright = new JTextField("     4");
		Manavright.setEditable(false);
		Manavright.setBackground(Color.PINK);
		Manavright.setBounds(528,250,37,40);
		panel4.add(Manavright);
		JButton centerb7 = new JButton("Kerwa Dam");
		centerb7.setBounds(575,250,178,40);
		panel4.add(centerb7);
		centerb7.addActionListener(this);
		JTextField Kerwadown = new JTextField("                           3");
		Kerwadown.setEditable(false);
		Kerwadown.setBackground(Color.PINK);
		Kerwadown.setBounds(575,335,178,30);
		panel4.add(Kerwadown);
		JTextField Kerwaright = new JTextField("     2");
		Kerwaright.setEditable(false);
		Kerwaright.setBackground(Color.PINK);
		Kerwaright.setBounds(763,250,37,40);
		panel4.add(Kerwaright);
		JButton centerb8 = new JButton("Science Centre");
		centerb8.setBounds(810,250,178,40);
		panel4.add(centerb8);
		centerb8.addActionListener(this);
		JTextField Scidown = new JTextField("                           1");
		Scidown.setEditable(false);
		Scidown.setBackground(Color.PINK);
		Scidown.setBounds(810,335,178,30);
		panel4.add(Scidown);
		JButton centerb12 = new JButton("Van Vihar");
		centerb12.setBounds(100,400,178,40);
		panel4.add(centerb12);
		centerb12.addActionListener(this);
		JTextField Vandown = new JTextField("                           1");
		Vandown.setEditable(false);
		Vandown.setBackground(Color.PINK);
		Vandown.setBounds(100,475,178,30);
		panel4.add(Vandown);
		JTextField Vanright = new JTextField("     4");
		Vanright.setEditable(false);
		Vanright.setBackground(Color.PINK);
		Vanright.setBounds(288,400,42,40);
		panel4.add(Vanright);
		panel4.add(centerb1);
		JButton centerb9 = new JButton("Bharat Bhawan");
		centerb9.setBounds(340,400,178,40);
		panel4.add(centerb9);
		centerb9.addActionListener(this);
		JTextField Bharatdown = new JTextField("                           3");
		Bharatdown.setEditable(false);
		Bharatdown.setBackground(Color.PINK);
		Bharatdown.setBounds(340,475,178,30);
		panel4.add(Bharatdown);
		JTextField Bharatright = new JTextField("     2");
		Bharatright.setEditable(false);
		Bharatright.setBackground(Color.PINK);
		Bharatright.setBounds(528,400,37,40);
		panel4.add(Bharatright);
		JButton centerb10 = new JButton("Shaurya Smarak");
		centerb10.setBounds(575,400,178,40);
		panel4.add(centerb10);
		centerb10.addActionListener(this);
		JTextField Shauryadown = new JTextField("                           1");
		Shauryadown.setEditable(false);
		Shauryadown.setBackground(Color.PINK);
		Shauryadown.setBounds(575,475,178,30);
		panel4.add(Shauryadown);
		JTextField Shauryaright = new JTextField("     4");
		Shauryaright.setEditable(false);
		Shauryaright.setBackground(Color.PINK);
		Shauryaright.setBounds(763,400,37,40);
		panel4.add(Shauryaright);
		JButton centerb11 = new JButton("Ser Sapata");
		centerb11.setBounds(810,400,178,40);
		panel4.add(centerb11);
		centerb11.addActionListener(this);
		JTextField Serdown = new JTextField("                           3");
		Serdown.setEditable(false);
		Serdown.setBackground(Color.PINK);
		Serdown.setBounds(810,475,178,30);
		panel4.add(Serdown);

		JButton centerb13 = new JButton("LNCT");
		centerb13.setBounds(100,540,178,40);
		panel4.add(centerb13);
		centerb13.addActionListener(this);
		JTextField LNCTright = new JTextField("     2");
		LNCTright.setEditable(false);
		LNCTright.setBackground(Color.PINK);
		LNCTright.setBounds(288,540,42,40);
		panel4.add(LNCTright);
		JButton centerb14 = new JButton("Birla Mandir");
		centerb14.setBounds(340,540,178,40);
		panel4.add(centerb14);
		centerb14.addActionListener(this);
		JTextField Birlaright = new JTextField("     4");
		Birlaright.setEditable(false);
		Birlaright.setBackground(Color.PINK);
		Birlaright.setBounds(528,540,37,40);
		panel4.add(Birlaright);
		JButton centerb15 = new JButton("Moti Masjid");
		centerb15.setBounds(575,540,178,40);
		//centerb15.setBackground(Color.cyan);
		panel4.add(centerb15);
		centerb15.addActionListener(this);
		JTextField Motiright = new JTextField("     2");
		 Motiright.setEditable(false);
		 Motiright.setBackground(Color.PINK);
		 Motiright.setBounds(763,540,37,40);
		panel4.add( Motiright);
		JButton centerb16 = new JButton("Lower Lake");
		centerb16.setBounds(810,540,178,40);
		panel4.add(centerb16);
		centerb16.addActionListener(this);

		panel4.setLayout(null);
		panel4.setVisible(true);
		//panel4.setSize(200,200);
		panel4.setBackground(Color.black);
		add(panel4,BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BhopalBhraman obj1 = new BhopalBhraman();
		
}
	
	/**public static String function(ActionEvent ae) {
		String buttonName = ae.getActionCommand();
		if(buttonName.equals("Taj-Ul Masjid")) {
			return "Taj-Ul Masjid";
		}
		else if (buttonName.equals("VIP Road")) {
			return "VIP Road";
		}
		else if (buttonName.equals("Mahadev Pani")) {
			return "Mahadev Pani";
		}
		else if (buttonName.equals("Shahpura Lake")) {
			return "Shahpura Lake";
		}
		else if (buttonName.equals("Lake View")) {
			return "Lake View";
		}
		else if (buttonName.equals("Manav Sanghralaya")) {
			return "Manav Sanghralaya";
		}
		else if (buttonName.equals("Kerwa Dam")) {
			return "Kerwa Dam";
		}
		else if (buttonName.equals("Science Centre")) {
			return "Science Centre";
		}
		else if (buttonName.equals("Van Vihar")) {
			return "Van Vihar";
		}
		else if (buttonName.equals("Bharat Bhawan")) {
			return "Bharat Bhawan";
		}
		else if (buttonName.equals("Shauraya Smarak")) {
			return "Shauraya Smarak";
		}
		else if (buttonName.equals("Ser Sapata")) {
			return "Ser Sapata";
		}
		else if (buttonName.equals("Birla Mandir")) {
			return "Birla Mandir";
		}
		else if (buttonName.equals("Moti Masjid")) {
			return "Moti Masjid";
		}
		else if (buttonName.equals("Lower Lake")) {
			return "Lower Lake";
		}
		else
			return "LNCT";
	}*/
	static int countp1 = -1;
	static int countp2 = 0;
	static void fun(int x) {
		int q = 0;
		if(x==29) {
			JOptionPane.showMessageDialog(null, "Winner: PLAYER 1");
		}	
		else if(x==30) {
			JOptionPane.showMessageDialog(null, "Winner: PLAYER 2");
		}
		else 
			q = 9;
	}
	
	
	int i = 80;
	static int flag = 0;
	@Override
	public void actionPerformed(ActionEvent evt) {
		 
		// TODO Auto-generated method stub
		String buttonName = evt.getActionCommand();
		
		if(buttonName.equals("Player 1")) {
			int n1 = (int)Math.floor((Math.random()*4)+1);
			southL1.setText("" + n1);
			//countp1 = countp1 + 2;
			flag = 1;	
			//if (flag == 1) {
			//southL2.setText(BhopalBhraman.function(evt)+ "");
			}
		
		else if(buttonName.equals("Player 2")){
			int n2 = (int)Math.floor((Math.random()*4)+1);
			southL1.setText("" + n2);
			//countp1 = countp1 + 2;
			flag = 2;
			//if(flag == 1) {
			//southL3.setText(BhopalBhraman.function(evt)+ "");
			}
		
			
		else if(buttonName.equals("Taj-Ul Masjid")){
			if(flag == 1) {
				southL2.setText("Taj-Ul Masjid");
					if(westL3.getText() == "Taj-Ul Masjid" ) {
						westL3.setText("");
						countp1 = countp1 + 2;
						BhopalBhraman.fun(countp1);
					}
				//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("Taj-Ul Masjid");
					if(eastL3.getText() == "Taj-Ul Masjid" ) {
						eastL3.setText("");
						countp2 = countp2 + 2;
						BhopalBhraman.fun(countp2);
				}
				//dumpP2.setText(countp2 + "");
			}
			else 
				i = 0;
			flag = 0;
		}	
		
		else if(buttonName.equals("VIP Road")){
			if(flag == 1) {
				southL2.setText("VIP Road");
				if(westL4.getText() == "VIP Road" ) {
					westL4.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);

				}
			//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("VIP Road");
				if(eastL4.getText() == "VIP Road" ) {
					eastL4.setText("");
					countp2 = countp2 + 2;
					BhopalBhraman.fun(countp2);

				}
				//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Mahadev Pani")){
			if(flag == 1) {
				southL2.setText("Mahadev Pani");
			if(westL5.getText() == "Mahadev Pani" ) {
				westL5.setText("");
				countp1 = countp1 + 2;
				BhopalBhraman.fun(countp1);

			}
			//dumpP1.setText(countp1 + "");
		}
			else if(flag == 2) {
				southL3.setText("Mahadev Pani");
			if(eastL5.getText() == "Mahadev Pani" ) {
				eastL5.setText("");
				countp2 = countp2 + 2;
				BhopalBhraman.fun(countp2);

			}
			//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Shahpura Lake")){
			if(flag == 1) {
				southL2.setText("Shahpura Lake");
				if(westL6.getText() == "Shahpura Lake" ) {
					westL6.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);

			}
			//dumpP1.setText(countp1 + "");
		}
			else if(flag == 2) {
				southL3.setText("Shahpura Lake");
				if(eastL6.getText() == "Shahpura Lake" ){
					eastL6.setText("");
					countp2 = countp2 + 2;
					BhopalBhraman.fun(countp1);

				}
				//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Lake View")){
			if(flag == 1) {
				southL2.setText("Lake View");
				if(westL2.getText() == "Lake View" ) {
					westL2.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);

				}
				//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("Lake View");
				if(eastL2.getText() == "Lake View" ) {
					eastL2.setText("");
					countp2 = countp2 + 2;
					BhopalBhraman.fun(countp2);

				}
				//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Manav Sanghralaya")){
			if(flag == 1) {
				southL2.setText("Manav Sanghralaya");
				if(westL13.getText() == "Manav Sanghralaya" ) {
					westL13.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);

				}
				//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("Manav Sanghralaya");
				if(eastL13.getText() == "Manav Sanghralaya" ) {
					eastL13.setText("");
					countp2 = countp2 + 2;
					BhopalBhraman.fun(countp2);

				}
				//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Kerwa Dam")){
			if(flag == 1) {
				southL2.setText("Kerwa Dam");
				if(westL7.getText() == "Kerwa Dam" ) {
					westL7.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);

				}
				//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("Kerwa Dam");
				if(eastL7.getText() == "Kerwa Dam" ) {
					eastL7.setText("");
					countp2 = countp2 + 2;
					BhopalBhraman.fun(countp2);
				}
				//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Science Centre")){
			if(flag == 1) {
				southL2.setText("Science Centre");
				if(westL8.getText() == "Science Centre" ) {
					westL8.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);
				}
				//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("Science Centre");
				if(eastL8.getText() == "Science Centre" ) {
					eastL8.setText("");
					countp2 = countp2 + 2;
					BhopalBhraman.fun(countp2);
				}
				//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Van Vihar")){
			if(flag == 1) {
				southL2.setText("Van Vihar");
					if(westL12.getText() == "Van Vihar" ) {
						westL12.setText("");
						countp1 = countp1 + 2;
						BhopalBhraman.fun(countp1);
					}
				//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("Van Vihar");
				if(eastL12.getText() == "Van Vihar" ) {
					eastL12.setText("");
					countp2 = countp2 + 2;
					BhopalBhraman.fun(countp2);
				}
				//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Bharat Bhawan")){
			if(flag == 1) {
				southL2.setText("Bharat Bhawan");
				if(westL9.getText() == "Bharat Bhawan" ) {
					westL9.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);
				}
				//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("Bharat Bhawan");
					if(eastL9.getText() == "Bharat Bhawan" ) {
						eastL9.setText("");
						countp2 = countp2 + 2;
						BhopalBhraman.fun(countp2);
					}
				//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Shaurya Smarak")){
			if(flag == 1) {
				southL2.setText("Shaurya Smarak");
				if(westL10.getText() == "Shaurya Smarak" ) {
					westL10.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);
				}
			//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("Shaurya Smarak");
					if(eastL10.getText() == "Shaurya Smarak" ) {
						eastL10.setText("");
						countp2 = countp2 + 2;
						BhopalBhraman.fun(countp2);
					}
			//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Ser Sapata")){
			if(flag == 1) {
				southL2.setText("Ser Sapata");
				if(westL11.getText() == "Ser Sapata" ) {
					westL11.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);
				}
			//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("Ser Sapata");
					if(eastL11.getText() == "Ser Sapata" ) {
						eastL11.setText("");
						countp2 = countp2 + 2;
						BhopalBhraman.fun(countp2);
					}
			//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Birla Mandir")){
			if(flag == 1) {
				southL2.setText("Birla Mandir");
					if(westL14.getText() == "Birla Mandir" ) {
						westL14.setText("");
						countp1 = countp1 + 2;
						BhopalBhraman.fun(countp1);
			}
			//dumpP1.setText(countp1 + "");
		}
			else if(flag == 2) {
				southL3.setText("Birla Mandir");
					if(eastL14.getText() == "Birla Mandir" ) {
						eastL14.setText("");
						countp2 = countp2 + 2;
						BhopalBhraman.fun(countp2);
			}
			//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Moti Masjid")){
			if(flag == 1) {
				southL2.setText("Moti Masjid");
					if(westL15.getText() == "Moti Masjid" ) {
					westL15.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);
			}
			//dumpP1.setText(countp1 + "");
		}
			else if(flag == 2) {
				southL3.setText("Moti Masjid");
					if(eastL15.getText() == "Moti Masjid" ) {
					eastL15.setText("");
					countp2 = countp2 + 2;
					BhopalBhraman.fun(countp2);
			}
			//dumpP2.setText(countp2 + "");
		}
			else
				i =9;
			flag = 0;
		}
		else if(buttonName.equals("Lower Lake")){
			if(flag == 1) {
				southL2.setText("Lower Lake");
				if(westL16.getText() == "Lower Lake" ) {
					westL16.setText("");
					countp1 = countp1 + 2;
					BhopalBhraman.fun(countp1);
				}
				//dumpP1.setText(countp1 + "");
			}
			else if(flag == 2) {
				southL3.setText("Lower Lake");
				if(eastL16.getText() == "Lower Lake" ) {
					eastL16.setText("");
					countp2 = countp2 + 2;
					BhopalBhraman.fun(countp2);
				}
				//dumpP2.setText(countp2 + "");
			}
			else
				i =9;
			flag = 0;
			}
		else if(buttonName.equals("Dump P1"))
			flag = 0;
		else if(buttonName.equals("Dump P2"))
			flag = 0;
		else
			i = 9;
	}
}