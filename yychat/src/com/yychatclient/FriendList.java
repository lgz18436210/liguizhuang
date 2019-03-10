package com.yychatclient;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;

public class FriendList extends JFrame implements ActionListener{//��������
	CardLayout cardLayout;//��Ƭ����
	//�����������ñ���
	JPanel myFriendPanel;
	JButton myFriendJButton;
	
	JScrollPane myFriendJScrollPane;
	JPanel myFriendListJPane;
	static final int FRIENDCOUNT=51;
	JLabel[] myFriendJLabel=new JLabel[FRIENDCOUNT];//�������飿
	//myFriendJOLabel[0]...myFriendJLabel[50] ÿһ���������ñ���
	
	JPanel myStrangerBlackListJPanel;
	JButton myStrangerJButton;
	JButton blackListJButton;
	
	JPanel myStrangerPanel;
	
	JPanel myFriendStrangerPanel;
	JButton myFriendJButton1;
	JButton myStrangerJButton1;
	
	JButton blackListJButton1;

	private JButton blackListJButton11;

	public FriendList() {
		//��һ�ſ�Ƭ
		myFriendPanel=new JPanel(new BorderLayout());//�߽粼��
		//System.out.println(myFriendPanel.getLayout());
		
		myFriendJButton=new JButton("�ҵĺ���");
		myFriendPanel.add(myFriendJButton,"North");
		
		myStrangerBlackListJPanel=new JPanel(new GridLayout(2,1));//���񲼾�
		myStrangerJButton=new JButton("�ҵ�İ����");
		//����ʱ�������
		myStrangerJButton.addActionListener(this);
		
		// TODO Auto-generated constructor stub
		blackListJButton=new JButton("������");
		myStrangerBlackListJPanel.add(myStrangerJButton);
		myStrangerBlackListJPanel.add(blackListJButton);
		myFriendPanel.add(myStrangerBlackListJPanel,"South");
		//��һ�ſ�Ƭ
		myStrangerPanel = new JPanel(new BorderLayout());
		
		myFriendStrangerPanel = new JPanel(new GridLayout(2,1));
		myFriendJButton1=new JButton("�ҵĺ���");//���Ӽ�����
		myFriendJButton1.addActionListener(this);
		myStrangerJButton1=new JButton("�ҵ�İ����");
		myFriendStrangerPanel.add(myFriendJButton1);
		myFriendStrangerPanel.add(myStrangerJButton1);
		myStrangerPanel.add(myFriendStrangerPanel,"North");
		
		blackListJButton=new JButton("������");
		myStrangerPanel.add(blackListJButton,"South");
		cardLayout=new CardLayout();
		this.setLayout(cardLayout);
		this.add(myFriendPanel,"1");
		this.add(myStrangerPanel,"2");
		
		this.setSize(150,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
	}

	public static void main(String[] args) {
		FriendList friendList=new FriendList();
		
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0){
		if(arg0.getSource()==myStrangerJButton){
			cardLayout.show(this.getContentPane(),"2");
		}
		if(arg0.getSource()==myFriendJButton1){
			cardLayout.show(this.getContentPane(), "1");
		}
	}
}