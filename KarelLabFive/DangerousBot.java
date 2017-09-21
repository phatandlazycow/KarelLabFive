
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    int beepers= 0;
    public void choosePile() {
        while(nextToABeeper()){
        beepers +=1;
        pickBeeper();
        }
        int x = beepers;
        if (x%2==0){
        turnRight();
        move();
        while(nextToABeeper()){
        pickBeeper();
        }
        }
        else{
        turnLeft();
        move();
        while(nextToABeeper()){
        pickBeeper();
        }
        }
    }
    public void turnRight(){
      turnLeft();
      turnLeft();
      turnLeft();
    }
   
}

