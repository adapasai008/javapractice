package abstractionAndEncapsulation;

import java.util.Scanner;

class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.

    int getSuitPriority(String suitString) {

        //Write your code here.
    	int priority=0;
        if(suitString.equals("spades")){
            return 1;
        }
        else if(suitString.equals("diamond")){
            return 2;
        }
        else if(suitString.equals("hearts")){
            return 3;
        }
        else if(suitString.equals("clubs")){
            return 4;
        }
        return 0;

    }


}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        //Write your code here.
    	
    	 if(c1.value>c2.value){
             points1=1;
         }
         else if(c1.value<c2.value){
             points2=1;
         }
         else if(c1.value==c2.value){
             if(c1.getSuitPriority(c1.suit)<c2.getSuitPriority(c2.suit)){
                 points1=1;
             }
             else{
                 points2=1;
             }

         }
    	

        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}



public class CardsGame {

	public static void main(String[] args) {

        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
		
	}

}
