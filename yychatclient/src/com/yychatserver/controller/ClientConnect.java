package com.yychatserver.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;

import com.yychat.model.Message;
import com.yychat.model.User;
import com.yychatclient.view.FriendList;

public class ClientConnect {
	public Socket s;
	
	public static HashMap hmSocket=new HashMap<String,Socket>();
	
        public  ClientConnect(){
        	try {
				s=new Socket("127.0.0.1",3456);
			} catch (IOException e) {
				e.printStackTrace();
			}
        	
        }
        public boolean loginValidate(User user){
        	boolean loginSuccess=false;
        	ObjectOutputStream oos;
        	Message  mess=null;
        	 ObjectInputStream ois;
        	 try {
				 oos =new ObjectOutputStream(s.getOutputStream());
                 oos.writeObject(user);		
                 
                 
                  ois=new ObjectInputStream(s.getInputStream());
                 
				  mess=(Message)ois.readObject();
				  
				  
				  if(mess.getMessageType().equals(Message.message_LoginSuccess)){
					  
					 System.out.println(user.getUserName()+"��½�ɹ�");
					  hmSocket.put(user.getUserName(),s);
					  new ChlientReceiverThread(s).start();
				  }
						
        	 } catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();{
					
				}
				return mess;
        	 } 
        	 
        	 catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
        	 return loginSuccess;
        }
        	 public static void main(String[]args){
        }
}



