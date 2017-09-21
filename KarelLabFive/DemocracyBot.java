
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    int ballot = 0;
    public void fixBallots() {
        move();
        for (int x = 5; x>0; x--){
        ballot = 0;
        checkBallots();
        move2();        
        }
    }
    public void checkBallots(){
        if(nextToABeeper()){
            ballot = 1;
        }
        fixroom();
    }
    public void fixroom(){
        turnLeft();
        move();
        while(nextToABeeper()){
        pickBeeper();
        }
        if (ballot ==1){ 
            putBeeper();}
        turnaround();
        move2();
        while(nextToABeeper()){
        pickBeeper();
        }
        if (ballot == 1){
            putBeeper();}
        turnaround();
        move();
        turnRight();
    }
    public void turnaround(){
    turnLeft();
    turnLeft();
    }
    public void move2(){
    move();
    move();
    }
    public void turnRight(){
    turnaround();
    turnLeft();
    }
}

