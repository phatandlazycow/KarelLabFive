
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    int treasure = 0;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
       while(treasure!=5){
        pickClue();
        pickDirection();
        moveToNextClue();
        }
    }
    public void pickClue(){
    treasure = 0;
    while(nextToABeeper()){
    treasure+=1;
    pickBeeper();
    }
    if(treasure == 5){
    turnOff();
    }
    }
    public void pickDirection(){
            if (treasure == 1){
                faceNorth();                    
            }
                else if (treasure == 2){
                    faceEast();
                }
                    else if (treasure == 3){
                        faceSouth();
                    }
                        else if (treasure == 4){
                            faceWest();
                        }
    }
     public void moveToNextClue(){
         while(!nextToABeeper()){
            move();
            }
     }
    public void faceEast(){
    while(!facingEast()){
    turnLeft();
    }
    }
    public void faceWest(){
    while(!facingWest()){
    turnLeft();
    }
    }
    public void faceNorth(){
    while(!facingNorth()){
    turnLeft();
    }
    }
    public void faceSouth(){
    while(!facingSouth()){
    turnLeft();
    }
    }
}

