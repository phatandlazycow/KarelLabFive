


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        findBeepers();
        grabBeepers();
        putBeepers();
    }
    public void findBeepers(){
    while (!nextToABeeper()){
    move();
    }
}
    public void grabBeepers(){
    while (nextToABeeper()){
    beepers +=1;
    pickBeeper();
    }
    for(int x = beepers; x>0; x--){
    putBeeper();
    }
    }
    public void putBeepers(){
        move();
        beepers*=2;
        for (int y = beepers; y>0; y--){
            putBeeper();
        }
        move();
        turnOff();
    }
    
}
