/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aprajitachhawi
 */
public class Timer {
    private ClockHand c;
    private ClockHand c1;
    public Timer(){
        this.c = new ClockHand(60);
        this.c1 = new ClockHand(100);
    }
    public void advance(){
        this.c1.advance();
        if(this.c1.value()==0){
            this.c.advance();
        }
    }
    public String toString(){
        return c + ":" + c1 ;
    }
}
