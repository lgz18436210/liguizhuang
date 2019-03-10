package com.yychatclient;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class FriendList extends JFrame implements ActionListener,MouseListener{//��������
	CardLayout cardLayout;//��Ƭ����
	//�����������ñ���
	//�����ҵĺ������
	JPanel myFriendPanel;
	JButton myFriendJButton;
	
	JScrollPane myFriendJScrollPane;
	JPanel myFriendListJPanel;
	static final int FRIENDCOUNT=51;
	JLabel[] myFriendJLabel=new JLabel[FRIENDCOUNT];//�������飿
	//myFriendJOLabel[0]...myFriendJLabel[50] ÿһ���������ñ���
	
	JPanel myStrangerBlackListJPanel;
	JButton myStrangerJButton;
	JButton blackListJButton;
	//����İ�������
	JScrollPane myStrangerJScrollPane;
	JPanel myStrangerListJPanel;
	static final int STRANGERCOUNT=21;
	JLabel[] myStrangerJLabel=new JLabel[STRANGERCOUNT];
	
	JPanel myStrangerPanel;
	
	JPanel myFriendStrangerPanel;
	JButton myFriendJButton1;
	JButton myStrangerJButton1;
	
	JButton blackListJButton1;

	public FriendList() {
		//��һ�ſ�Ƭ,��������
		myFriendPanel=new JPanel(new BorderLayout());//�߽粼��
		//System.out.println(myFriendPanel.getLayout());
		
		myFriendJButton=new JButton("�ҵĺ���");
		myFriendPanel.add(myFriendJButton,"North");
		
		//�в�
		/*JScrollPane myFriendJScrollPane;
		JPanel myFriendListJPanel;
		static final int FRIENDCOUNT=51;
				JLabel[] myFriendJLabel;//��������*/
		myFriendListJPanel = new JPanel(new GridLayout(FRIENDCOUNT-1,1));
		for(int i=1;i<FRIENDCOUNT;i++) {
			myFriendJLabel[i]=new JLabel(i+"",new ImageIcon("images/YY4.gif"),JLabel.LEFT);
			myFriendJLabel[i].addMouseListener(this);//�����������
			myFriendListJPanel.add(myFriendJLabel[i]);
		}
		myFriendJScrollPane =new JScrollPane(myFriendListJPanel);
		myFriendPanel.add(myFriendJScrollPane);
		
		myStrangerBlackListJPanel=new JPanel(new GridLayout(2,1));//���񲼾�
		myStrangerJButton=new JButton("�ҵ�İ����");
		//���ʱ�������
		myStrangerJButton.addActionListener(this);
		
		blackListJButton=new JButton("������");
		myStrangerBlackListJPanel.add(myStrangerJButton);
		myStrangerBlackListJPanel.add(blackListJButton);
		myFriendPanel.add(myStrangerBlackListJPanel,"South");
		
		//��һ�ſ�Ƭ
		myStrangerPanel = new JPanel(new BorderLayout());
		
		myFriendStrangerPanel = new JPanel(new GridLayout(2,1));
		myFriendJButton1=new JButton("�ҵĺ���");//��Ӽ�����
		myFriendJButton1.addActionListener(this);
		myStrangerJButton1=new JButton("�ҵ�İ����");
		myFriendStrangerPanel.add(myFriendJButton1);
		myFriendStrangerPanel.add(myStrangerJButton1);
		myStrangerPanel.add(myFriendStrangerPanel,"North");
		
		myStrangerListJPanel = new JPanel(new GridLayout(STRANGERCOUNT-1,1));
		for(int i=1;i<STRANGERCOUNT;i++) {
			myStrangerJLabel[i]=new JLabel(i+"",new ImageIcon("images/YY4.gif"),JLabel.LEFT);
			myStrangerJLabel[i].addMouseListener(this);//�����������
			myStrangerListJPanel.add(myStrangerJLabel[i]);
		}
		myStrangerJScrollPane =new JScrollPane(myStrangerListJPanel);
		myStrangerPanel.add(myStrangerJScrollPane);
		
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
		
	}

	
	public void actionPerformed(ActionEvent arg0){
		if(arg0.getSource()==myStrangerJButton){
			cardLayout.show(this.getContentPane(),"2");
		}
		if(arg0.getSource()==myFriendJButton1){
			cardLayout.show(this.getContentPane(), "1");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		JLabel jLabel=(JLabel)e.getSource();
		jLabel.setForeground(Color.red);	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		JLabel jLabel=(JLabel)e.getSource();
		jLabel.setForeground(Color.black);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
