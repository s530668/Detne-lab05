/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;

/**
 *This class has get and set method for the arrayLists.
 * This also has removedCardFromArray() and addCardsToArray() methods
 * @author Sangeetha Detne
 */
public class CardsArrayList {
    
    ArrayList<Card> clubs = new ArrayList<>(); //It stores arraylist for the clubs
    ArrayList<Card> diamonds = new ArrayList<>();//It stores arraylist for the diamonds
    ArrayList<Card> hearts = new ArrayList<>();//It stores arraylist for the hearts
    ArrayList<Card> spades = new ArrayList<>();//It stores arraylist for the spades
    
    /**
     *This is non parameterized constructors 
     */
    public CardsArrayList(){
        
    }

    /**
     *This is array list for the clubs 
     * @return clubs
     */
    public ArrayList<Card> getClubs() {
        return clubs;
    }

    /**
     *This is array list for the diamonds
     * @return diamonds
     */
    public ArrayList<Card> getDiamonds() {
        return diamonds;
    }

    /**
     *This is array list for the hearts
     * @return hearts
     */
    public ArrayList<Card> getHearts() {
        return hearts;
    }

    /**
     *This is array list for the spades
     * @return spades
     */
    public ArrayList<Card> getSpades() {
        return spades;
    }
    
    /**
     *This method gets the card and checks type of the card and adds
     * it to the respective array lists 
     * @param c card type="clubs"
     *  add the respective card in clubs
     * @return card added after successfully insertion
     */
    public String addCardsToList(Card c){
        
        
        switch(c.getType())
        {
            case "clubs":
              clubs.add(c);  
              break;
            case "diamonds":
              diamonds.add(c);
              break;            
            case "hearts":
               hearts.add(c);
               break; 
            case "spades":
                spades.add(c);
                break;
            default: break;   
        }
        return "card added successfully to "+c.getType();
    }
    
    /**
     *This method removes the element. 
     * When the position is greater than the array list then it throws error as 
     * "array size underflow card cannot be removed".
     * If position is within the card size then it is removed successfully
     * @param position takes the position of the element which has to be removed
     * @param c takes the card number
     * @return whether it is removed or underflow has Occured
     */
    public String removeCardsFromList(int position, ArrayList<Card> c){
        String result="";
        if (position < 0 || position > c.size()) {
            result = "ArrayList size underflow, card cannot be removed";
        }
        else{
          c.remove(position);
          result = "Card is removed successfully!";
        }
        
        return result;
    }
    
    @Override
    /**
    **This is toString method used to format the output display
    * */
    public String toString(){
        
        String result="";
        result="Hearts ArrayList:[";
        for (Card values :hearts ) {
           result = result + values.toString();
        }
        result= result+"]\n";
        
        result =result + "Diamonds ArrayList:[";
        for (Card values :diamonds ) {
           result = result + values.toString();
        }
        result= result+"]\n";
        
         result = result + "Spades ArrayList:[";
        for (Card values :spades ) {
           result = result + values.toString();
        }
        result= result+"]\n";
        
         result = result + "Clubs ArrayList:[";
        for (Card values :clubs ) {
           result = result + values.toString();
        }
        result= result+"]";   
        
        return result;
    }
 
}