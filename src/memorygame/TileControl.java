package memorygame;
import java.util.*;

/**
 * @author reprise
 */
public class TileControl {
    //GLOBALS 
    
    //these hold the positions (ID) of each of the shapes and their pair.
    //this ID is handed out from initShuffleTiles() randomCollection array.
    int circle1, circle2;
    int cross1, cross2;
    int diamond1, diamond2;
    int dice1 , dice2;
    int donut1, donut2;
    int eclipse1, eclipse2;
    int eclipse3, eclipse4;
    int grapes1, grapes2;
    int heart1, heart2;
    int L1, L2;
    int rectangle1, rectangle2;
    int snowflake1, snowflake2;
    int sqdonut1, sqdonut2;
    int square1, square2;
    int star1, star2;
    int tear1, tear2;
    int triangle1, triangle2;
    int X1, X2;
    
    //========================================================================================
    //          4X4 GAME BOARD TILE CONTROL
    //========================================================================================
    
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffle4x4Tiles(){
        int n = 0;

        //first add all the numbers from 0 to 15 into an array list, then shuffle it
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 15; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        //assign each shape their locations
        circle1 = randomCollection.get(n);
        n++;
        circle2 = randomCollection.get(n);
        n++;
        cross1 = randomCollection.get(n);
        n++;       
        cross2 = randomCollection.get(n);
        n++   ;   
        diamond1 = randomCollection.get(n);
        n++;
        diamond2 = randomCollection.get(n);
        n++; 
        donut1 = randomCollection.get(n);
        n++;
        donut2 = randomCollection.get(n);
        n++;
        eclipse1 = randomCollection.get(n);
        n++;
        eclipse2 = randomCollection.get(n);
        n++; 
        square1 = randomCollection.get(n);
        n++;
        square2 = randomCollection.get(n);
        n++;
        star1 = randomCollection.get(n);
        n++;
        star2 = randomCollection.get(n);
        n++;
        X1 = randomCollection.get(n);
        n++;
        X2 = randomCollection.get(n);
        n++; 
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get4x4TileType(int ID){
        int type = 100;
        
        System.out.print("Shape_Code: ");
        if (ID == circle1 || ID == circle2){
            type = 0;
            System.out.print(type + " - Circle");
        }
        else if (ID == cross1 || ID == cross2){
            type = 1;
            System.out.print(type + " - Cross");
        }
        else if (ID == diamond1 || ID == diamond2){
            type = 2;
            System.out.print(type + " - Diamond");
        }
        else if (ID == donut1 || ID == donut2){
            type = 3;
            System.out.print(type + " - Donut");
        }
        else if (ID == eclipse1 || ID == eclipse2){
            type = 4;
            System.out.print(type + " - Eclipse");
        }
        else if (ID == square1 || ID == square2){
            type = 5;
            System.out.print(type + " - Square");      
        }
        else if (ID == star1 || ID == star2){
            type = 6;
            System.out.print(type + " - Star");
        }
        else if (ID == X1 || ID == X2){
            type = 7;
            System.out.print(type + " - X");
        }
        System.out.println();
        
        return type;
    }
    
   
}
