package com.yychatclient;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;

public class FriendList extends JFrame implements ActionListener{//顶层容器
	CardLayout cardLayout;//卡片布局
	//定义对象的引用变量
	JPanel myFriendPanel;
	JButton myFriendJButton;
	
	JScrollPane myFriendJScrollPane;
	JPanel myFriendListJPane;
	static final int FRIENDCOUNT=51;
	JLabel[] myFriendJLabel=new JLabel[FRIENDCOUNT];//对象数组？
	//myFriendJOLabel[0]...myFriendJLabel[50] 每一个都是引用变量
	
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
		//第一张卡片
		myFriendPanel=new JPanel(new BorderLayout());//边界布局
		//System.out.println(myFriendPanel.getLayout());
		
		myFriendJButton=new JButton("我的好友");
		myFriendPanel.add(myFriendJButton,"North");
		
		myStrangerBlackListJPanel=new JPanel(new GridLayout(2,1));//网格布局
		myStrangerJButton=new JButton("我的陌生人");
		//添加时间监听器
		myStrangerJButton.addActionListener(this);
		
		// TODO Auto-generated constructor stub
		blackListJButton=new JButton("黑名单");
		myStrangerBlackListJPanel.add(myStrangerJButton);
		myStrangerBlackListJPanel.add(blackListJButton);
		myFriendPanel.add(myStrangerBlackListJPanel,"South");
		//另一张卡片
		myStrangerPanel = new JPanel(new BorderLayout());
		
		myFriendStrangerPanel = new JPanel(new GridLayout(2,1));
		myFriendJButton1=new JButton("我的好友");//添加监听器
		myFriendJButton1.addActionListener(this);
		myStrangerJButton1=new JButton("我的陌生人");
		myFriendStrangerPanel.add(myFriendJButton1);
		myFriendStrangerPanel.add(myStrangerJButton1);
		myStrangerPanel.add(myFriendStrangerPanel,"North");
		
		blackListJButton=new JButton("黑名单");
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
