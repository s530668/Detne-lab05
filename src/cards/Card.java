/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 * This class mainly  has getter and setter methods of card type and card number
 * @author Sangeetha Detne
 */
public class Card {
    
     private int number;//It stores the card number
    private String type;//It stores the type of card 
    
    /**
     *This is parameterized constructor with two parameters
     * @param number number of the card 
     * @param type type of the card 
     */
    public Card(int number, String type)
    {
        this.number=number;
        this.type=type;
    }

    /**
     * It is getter method for the number of the card
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     *This is setter method for the number of the card
     * @param number holds the number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *This takes the type of the card through getter method
     * @return type 
     */
    public String getType() {
        return type;
    }

    /**
     *This is setter method for the type of the card 
     * @param type store type of the card
     */
    public void setType(String type) {
        this.type = type;
    }
    
     @Override//overriding the toString method
    public String toString()
    {
        return " "+getNumber()+" "; //Integer.toString(number)
    }

    
}
