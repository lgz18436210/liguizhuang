package com.yychatserver.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.yychat.model.User;

public class StartServer {
	ServerSocket ss;
	public StartServer() {
	try {//�����쳣
		ss= new ServerSocket(3456);
		System.out.println("�������Ѿ�����������3456�˿�");
		Socket s= ss.accept();//���ܿͻ�����������
		System.out.println("���ӳɹ�;"+s);
		
		//����User����
		ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
		User user=(User)ois.readObject();
		System.out.println(user.getUserName());
		System.out.println(user.getPassWord());
		
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();//�����쳣
	}
	}
	public static void main(String[] args) {
		
	}

}