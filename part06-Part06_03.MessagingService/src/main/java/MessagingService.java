
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aprajitachhawi
 */
public class MessagingService {
    ArrayList<Message> messageList = new ArrayList<>();
    public MessagingService(){
        this.messageList = new ArrayList<>();
    }
    public void add(Message message){
        if(message.getContent().length()<=280){
            this.messageList.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return this.messageList;
    }
    
}
