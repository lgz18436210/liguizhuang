package com.yychatclient.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FriendChat extends JFrame implements ActionListener{

	//Center����
	JScrollPane jsp;
	JTextArea jta;
	
	//South����
	JPanel jp;
	JTextField jtf;
	JButton jb;
	
	public FriendChat(String sender,String receiver){
		jta = new JTextArea();//�ı�����
		jta.setEditable(false);
		jta.setForeground(Color.red);
		jsp =new JScrollPane(jta);
		this.add(jsp,"Center");
		
		jp=new JPanel();
		jtf=new JTextField(15);
		jtf.setForeground(Color.red);
		jb=new JButton("����");
		jb.addActionListener(this);
		jp.add(jtf);
		jp.add(jb);
		this.add(jp,"South");
		
		this.setSize(350,240);
		this.setTitle(sender+"���ں�"+receiver+"����");
		this.setLocationRelativeTo(null);//������ʾ����
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		//FriendChat friendChat=new FriendChat("1","2");

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==jb) jta.append(jtf.getText()+"\r\n");
		
	}

}