    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package cards;

    /**
     *This class has getter and setter methods of the cardArray.
     * It also has addCardToArray() and removeCardsToArray() methods
     * @author Sangeetha Detne
     */
    public class CardsArray {

       private Card[] clubs; //It is a clubs array
       private Card[] diamonds; //It is a diamond array
       private Card[] hearts;//It is a heart array
       private Card[] spades;//it is a spade array
       private final int DECK_SIZE=5; //it is constant value which is fixed for the size
       private int clubsCount;//It  stores the count of the club cards
       private int diamondsCount;//It  stores the count of the diamond cards
       private int heartsCount;//It  stores the count of the hearts cards
       private int spadesCount;//It  stores the count of the spades cards

        /**
         *This method store the size of the all array to the '5' and 
         * initializes the count of the all the cards to '0'
         */
        public CardsArray()
       {
          clubs=new Card[DECK_SIZE]; //clubs=5
          hearts=new Card[DECK_SIZE];// hearts=5
          spades=new Card[DECK_SIZE];//spades=5
          diamonds=new Card[DECK_SIZE];//diamonds=5
         clubsCount=0;
         diamondsCount=0;
         heartsCount=0;
         spadesCount=0;
       }

        /**
         *This is the getter method for the clubsCount
         * @return clubsCount
         */
        public int getClubsCount() {
            return clubsCount;
        }

        /**
         *This is the getter method for the diamondsCount
         * @return diamondsCount
         */
        public int getDiamondsCount() {
            return diamondsCount;
        }

        /**
         *This is the getter method for the heartsCount
         * @return heartsCount
         */
        public int getHeartsCount() {
            return heartsCount;
        }

        /**
         **This is the getter method for the spadesCount
         * @return spadesCount
         */
        public int getSpadesCount() {
            return spadesCount;
        }

        /**
         *This method add card to the array.
         * It check whether the count of the card is greater than the size.
         * If it is greater, then it removes the card and then calls addCardsToArray(c)method,
         * where in, it add element to the end of the array and count is incremented.
         * If the count is with in [deckSize] and then there is vacancy in the array then, the 
         * element is added to the array and the count is decremented
         * 
         * @param c//takes the card
         */
        public void addCardsToArray(Card c)
       {
           //double count=0.0;
           if("clubs".equals(c.getType()))
           {
               if(clubsCount>=DECK_SIZE)
               {
                   removeCardsFromArray(0,c.getType());
                   addCardsToArray(c);
               }
               else
               {
               clubs[clubsCount] = c;
               clubsCount++;
               }
            }

           if("diamonds".equals(c.getType()))
           {
               if(diamondsCount>=DECK_SIZE)
               {
                   removeCardsFromArray(0,c.getType());
                   addCardsToArray(c);
               }
               else
               {
               diamonds[diamondsCount] = c;
               diamondsCount++;
               }
            }


            if("hearts".equals(c.getType()))
           {
               if(heartsCount>=DECK_SIZE)
               {
                   removeCardsFromArray(0,c.getType());
                   addCardsToArray(c);
               }
               else
               {
               hearts[heartsCount] = c;
               heartsCount++;
               }
            }

            if("spades".equals(c.getType()))
           {
               if(spadesCount>=DECK_SIZE)
               {
                   removeCardsFromArray(0,c.getType());
                   addCardsToArray(c);
               }
               else
               {
               spades[spadesCount] = c;
               spadesCount++;
               }
            }
         }

        /**
         * This method removes the card from the array.
         * It check whether the position is with in the count (or) not (or) greater than 0
         * If position is with in the count  then array elements are shifted to the previous position,
         * and count is decremented
         * @param position //position of the card to be removed
         * @param cardType // takes the type of the card
         */
        public void removeCardsFromArray(int position, String cardType)
       {
           //int cardCount=0;
           if("clubs".equals(cardType))
           {
                if((position<clubsCount)||(position>=0))
                {
                    for(int i=position+1;i<clubsCount;i++)
                    {
                         clubs[i-1]=clubs[i];

                     }
                    clubsCount--;
                }
            }

           else if("hearts".equals(cardType))
                 {
                    if((position<heartsCount)||(position>=0))
                        {
                            for(int i=position+1;i<heartsCount;i++)
                            {
                                hearts[i-1]=hearts[i];

                            }
                            heartsCount--;
                        }
                 }

           else if("diamonds".equals(cardType))
                 {
                    if((position<diamondsCount)||(position>=0))
                        {
                            for(int i=position+1;i<diamondsCount;i++)
                            {
                                diamonds[i-1]=diamonds[i];

                            }
                            diamondsCount--;
                        }
                 }

           else if("spades".equals(cardType))
                 {
                    if((position<spadesCount)||(position>=0))
                        {
                            for(int i=position+1;i<spadesCount;i++)
                            {
                                spades[i-1]=spades[i];

                            }
                            spadesCount--;
                        }
                 }

          }

        @Override
        /**
         *This method is overridden and is used for formatting purpose 
         */
       public String toString()
        {
            String result=""; 
            result="\nHearts Array:[";
            for(Card var:hearts)
            {
                if(var!=null)
                result= result + var.toString();
            }
             result=result+"]\n";

             result=result+"Diamonds Array:["; 
            for(Card var:diamonds)
            {
                if(var!=null)
                result= result + var.toString();
            }
             result=result+"]\n";

             result=result+"Spades Array:["; 
            for(Card var:spades)
            {
                if(var!=null)
                result= result + var.toString();
            }
             result=result+"]\n";

              result=result+"Clubs Array:["; 
            for(Card var:clubs)
            {

                result= result + var.toString();
            }
             result=result+"]";

             return result;
          }

    }
