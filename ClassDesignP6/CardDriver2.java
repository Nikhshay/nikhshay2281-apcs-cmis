package ClassDesignP6;

public class CardDriver2
{
    public static void main (String[] arg)
    {
        int Worth = 0;
        int DealerWorth = 0;
        int PlayerWorth = 0;
        String Winner = "";
        
        String[] allRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] allSuit = {"clubs", "spades", "diamonds", "hearts"};
     
        Card[] Dealer = new Card [2];
        Card[] Player1 = new Card [2];
        Card[] Player2 = new Card [2];
        Card[] Player3 = new Card [2];
        Card[] Player4 = new Card [2];
        Card[] Player5 = new Card [2];
        
       for( int z = 1; z < 2; z++)
       {
       for( int i = 0; i < Dealer.length; i++)
       {
          int a = ((int) (Math.random()*13));
          int b = ((int) (Math.random()*4));
          Dealer[i] = new Card( allRank[a], allSuit[b] );         
          System.out.print("Dealer card ");
          System.out.print( i+1 );
          System.out.print(" : " + Dealer[i] + "\n");

           if (allRank[a]  == ("A") )
             {
                Worth = 11;
            }
            else if (allRank[a]  == ("2") )
             {
                Worth = 2;
             }   
            else if (allRank[a]  == ("3") )
             {
                Worth = 3;
             }   
           else if (allRank[a]  == ("4") )
             {
                Worth = 4;
             }    
           else if (allRank[a]  == ("5") )
             {
                Worth = 5;
             }   
            else if (allRank[a]  == ("6") )
             {
                Worth = 6;
             }   
           else if (allRank[a]  == ("7") )
             {
                Worth = 7;
             }       
             else if (allRank[a]  == ("8") )
             {
                Worth = 8;
             }   
            else if (allRank[a]  == ("9") )
             {
                Worth = 9;
             }   
           else if (allRank[a]  == ("10") )
             {
                Worth = 10;
             }     
           else if (allRank[a]  == ("J") || allRank[a]  ==("Q") || allRank[a]  ==("K") )
             {
                Worth = 10;
            }
           DealerWorth += Worth;
  
        }
       System.out.println("Points in hand " + DealerWorth + "\n");
      }
            
     
      
      
      
      for( int z = 1; z < 2; z++)
      {
       for( int i = 0; i < Player1.length; i++)
       {
          int a = ((int) (Math.random()*13));
          int b = ((int) (Math.random()*4));
          Player1[i] = new Card( allRank[a], allSuit[b] );         
          System.out.print("Player1 card ");
          System.out.print( i+1 );
          System.out.print(" : " + Player1[i] + "\n");

           if (allRank[a]  == ("A") )
             {
                Worth = 11;
            }
            else if (allRank[a]  == ("2") )
             {
                Worth = 2;
             }   
            else if (allRank[a]  == ("3") )
             {
                Worth = 3;
             }   
           else if (allRank[a]  == ("4") )
             {
                Worth = 4;
             }    
           else if (allRank[a]  == ("5") )
             {
                Worth = 5;
             }   
            else if (allRank[a]  == ("6") )
             {
                Worth = 6;
             }   
           else if (allRank[a]  == ("7") )
             {
                Worth = 7;
             }       
             else if (allRank[a]  == ("8") )
             {
                Worth = 8;
             }   
            else if (allRank[a]  == ("9") )
             {
                Worth = 9;
             }   
           else if (allRank[a]  == ("10") )
             {
                Worth = 10;
             }     
           else if (allRank[a]  == ("J") || allRank[a]  ==("Q") || allRank[a]  ==("K") )
             {
                Worth = 10;
            }
           PlayerWorth += Worth;

        }
       System.out.println("Points in hand " + PlayerWorth + "\n");
    }
      
    if (PlayerWorth==21)
        {
            Winner = "Player 1";
            System.out.print("RESULT : Player 1 Won Dealer with 21 Points");
        }  
        else if( PlayerWorth > 21)
        {
            System.out.print("RESULT : Player 1 Lost");
        }
        else if ( PlayerWorth > DealerWorth)
        {
            Winner = "Player 1";
            System.out.print("RESULT : Player 1 Won Dealer with " + PlayerWorth + " Points while Dealer lost with " +DealerWorth+ " Points.");
        }  
        else 
        {
            Winner = "Dealer";
            System.out.print("RESULT : Dealer Won Player 1 with " +DealerWorth+" Points while Player 1 lost with " +PlayerWorth+ " Points.");
        } 

        PlayerWorth = 0;
        System.out.println("\n\n" );
        
      for( int z = 1; z < 2; z++)
      {
       for( int i = 0; i < Player2.length; i++)
       {
          int a = ((int) (Math.random()*13));
          int b = ((int) (Math.random()*4));
          Player2[i] = new Card( allRank[a], allSuit[b] );         
          System.out.print("Player2 card ");
          System.out.print( i+1 );
          System.out.print(" : " + Player2[i] + "\n");

           if (allRank[a]  == ("A") )
             {
                Worth = 11;
            }
            else if (allRank[a]  == ("2") )
             {
                Worth = 2;
             }   
            else if (allRank[a]  == ("3") )
             {
                Worth = 3;
             }   
           else if (allRank[a]  == ("4") )
             {
                Worth = 4;
             }    
           else if (allRank[a]  == ("5") )
             {
                Worth = 5;
             }   
            else if (allRank[a]  == ("6") )
             {
                Worth = 6;
             }   
           else if (allRank[a]  == ("7") )
             {
                Worth = 7;
             }       
             else if (allRank[a]  == ("8") )
             {
                Worth = 8;
             }   
            else if (allRank[a]  == ("9") )
             {
                Worth = 9;
             }   
           else if (allRank[a]  == ("10") )
             {
                Worth = 10;
             }     
           else if (allRank[a]  == ("J") || allRank[a]  ==("Q") || allRank[a]  ==("K") )
             {
                Worth = 10;
            }
           PlayerWorth += Worth;
        }
       System.out.println("Points in hand " + PlayerWorth + "\n");
    }
      
    if (PlayerWorth==21)
        {
            Winner = "Player 2";
            System.out.print("RESULT : Player 2 Won Dealer with 21 Points");
        }  
        else if( PlayerWorth > 21)
        {
            System.out.print("RESULT : Player 2 Lost");
        }
        else if ( PlayerWorth > DealerWorth)
        {
            Winner = "Player 2";
            System.out.print("RESULT : Player 2 Won Dealer with " + PlayerWorth + " Points while Dealer lost with " +DealerWorth+ " Points.");
        }  
        else 
        {
            Winner = "Dealer";
            System.out.print("RESULT : Dealer Won Player 2 with " +DealerWorth+" Points while Player 2 lost with " +PlayerWorth+ " Points.");
        } 

        PlayerWorth = 0;
        System.out.println("\n\n" );
    
      for( int z = 1; z < 2; z++)
      {
       for( int i = 0; i < Player3.length; i++)
       {
          int a = ((int) (Math.random()*13));
          int b = ((int) (Math.random()*4));
          Player3[i] = new Card( allRank[a], allSuit[b] );         
          System.out.print("Player3 card ");
          System.out.print( i+1 );
          System.out.print(" : " + Player3[i] + "\n");

           if (allRank[a]  == ("A") )
             {
                Worth = 11;
            }
            else if (allRank[a]  == ("2") )
             {
                Worth = 2;
             }   
            else if (allRank[a]  == ("3") )
             {
                Worth = 3;
             }   
           else if (allRank[a]  == ("4") )
             {
                Worth = 4;
             }    
           else if (allRank[a]  == ("5") )
             {
                Worth = 5;
             }   
            else if (allRank[a]  == ("6") )
             {
                Worth = 6;
             }   
           else if (allRank[a]  == ("7") )
             {
                Worth = 7;
             }       
             else if (allRank[a]  == ("8") )
             {
                Worth = 8;
             }   
            else if (allRank[a]  == ("9") )
             {
                Worth = 9;
             }   
           else if (allRank[a]  == ("10") )
             {
                Worth = 10;
             }     
           else if (allRank[a]  == ("J") || allRank[a]  ==("Q") || allRank[a]  ==("K") )
             {
                Worth = 10;
            }
           PlayerWorth += Worth;

        }
       System.out.println("Points in hand " + PlayerWorth + "\n");
    }
      
    if (PlayerWorth==21)
        {
            Winner = "Player 3";
            System.out.print("RESULT : Player 3 Won Dealer with 21 Points");
        }  
        else if( PlayerWorth > 21)
        {
            System.out.print("RESULT : Player 3 Lost");
        }
        else if ( PlayerWorth > DealerWorth)
        {
            Winner = "Player 3";
            System.out.print("RESULT : Player 3 Won Dealer with " + PlayerWorth + " Points while Dealer lost with " +DealerWorth+ " Points.");
        }  
        else 
        {
            Winner = "Dealer";
            System.out.print("RESULT : Dealer Won Player 3 with " +DealerWorth+" Points while Player 3 lost with " +PlayerWorth+ " Points.");
        } 

        PlayerWorth = 0;
        System.out.println("\n\n" );
    
      for( int z = 1; z < 2; z++)
      {
       for( int i = 0; i < Player4.length; i++)
       {
          int a = ((int) (Math.random()*13));
          int b = ((int) (Math.random()*4));
          Player4[i] = new Card( allRank[a], allSuit[b] );         
          System.out.print("Player4 card ");
          System.out.print( i+1 );
          System.out.print(" : " + Player4[i] + "\n");

           if (allRank[a]  == ("A") )
             {
                Worth = 11;
            }
            else if (allRank[a]  == ("2") )
             {
                Worth = 2;
             }   
            else if (allRank[a]  == ("3") )
             {
                Worth = 3;
             }   
           else if (allRank[a]  == ("4") )
             {
                Worth = 4;
             }    
           else if (allRank[a]  == ("5") )
             {
                Worth = 5;
             }   
            else if (allRank[a]  == ("6") )
             {
                Worth = 6;
             }   
           else if (allRank[a]  == ("7") )
             {
                Worth = 7;
             }       
             else if (allRank[a]  == ("8") )
             {
                Worth = 8;
             }   
            else if (allRank[a]  == ("9") )
             {
                Worth = 9;
             }   
           else if (allRank[a]  == ("10") )
             {
                Worth = 10;
             }     
           else if (allRank[a]  == ("J") || allRank[a]  ==("Q") || allRank[a]  ==("K") )
             {
                Worth = 10;
            }
           PlayerWorth += Worth;
        }
       System.out.println("Points in hand " + PlayerWorth + "\n");
    }
      
       if (PlayerWorth==21)
        {
            Winner = "Player 4";
            System.out.print("RESULT : Player 4 Won Dealer with 21 Points");
        }  
        else if( PlayerWorth > 21)
        {
            System.out.print("RESULT : Player 4 Lost");
        }
        else if ( PlayerWorth > DealerWorth)
        {
            Winner = "Player 4";
            System.out.print("RESULT : Player 4 Won Dealer with " + PlayerWorth + " Points while Dealer lost with " +DealerWorth+ " Points.");
        }  
        else 
        {
            Winner = "Dealer";
            System.out.print("RESULT : Dealer Won Player 4 with " +DealerWorth+" Points while Player 4 lost with " +PlayerWorth+ " Points.");
        } 

        PlayerWorth = 0;
        System.out.println("\n\n" );
        
      
      for( int z = 1; z < 2; z++)
      {
       for( int i = 0; i < Player5.length; i++)
       {
          int a = ((int) (Math.random()*13));
          int b = ((int) (Math.random()*4));
          Player5[i] = new Card( allRank[a], allSuit[b] );         
          System.out.print("Player5 card ");
          System.out.print( i+1 );
          System.out.print(" : " + Player5[i] + "\n");

           if (allRank[a]  == ("A") )
             {
                Worth = 11;
            }
            else if (allRank[a]  == ("2") )
             {
                Worth = 2;
             }   
            else if (allRank[a]  == ("3") )
             {
                Worth = 3;
             }   
           else if (allRank[a]  == ("4") )
             {
                Worth = 4;
             }    
           else if (allRank[a]  == ("5") )
             {
                Worth = 5;
             }   
            else if (allRank[a]  == ("6") )
             {
                Worth = 6;
             }   
           else if (allRank[a]  == ("7") )
             {
                Worth = 7;
             }       
             else if (allRank[a]  == ("8") )
             {
                Worth = 8;
             }   
            else if (allRank[a]  == ("9") )
             {
                Worth = 9;
             }   
           else if (allRank[a]  == ("10") )
             {
                Worth = 10;
             }     
           else if (allRank[a]  == ("J") || allRank[a]  ==("Q") || allRank[a]  ==("K") )
             {
                Worth = 10;
            }
           PlayerWorth += Worth;

        }
       System.out.println("Points in hand " + PlayerWorth + "\n");
    }
      
    if (PlayerWorth==21)
        {
            Winner = "Player 5";
            System.out.print("RESULT : Player 5 Won Dealer with 21 Points");
        }  
        else if( PlayerWorth > 21)
        {
            System.out.print("RESULT : Player 5 Lost");
        }
        else if ( PlayerWorth > DealerWorth)
        {
            Winner = "Player 5";
            System.out.print("RESULT : Player 5 Won Dealer with " + PlayerWorth + " Points while Dealer lost with " +DealerWorth+ " Points.");
        }  
        else 
        {
            Winner = "Dealer";
            System.out.print("RESULT : Dealer Won Player 5 with " +DealerWorth+" Points while Player 5 lost with " +PlayerWorth+ " Points.");
        } 

        PlayerWorth = 0;
        System.out.println("\n\n" );
        
        
  }   
}
