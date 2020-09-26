package com.snakeladder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final int No_Play=0;
    public static final int Snake=1;
	public static final int Laddder =2 ;

    static int Position1=0;
    static int Position2=0;

    static int count1=0;
	static int count2=0;

    public static void main( String[] args )
    {
   	     int x=0;

         while(Position1 != 100 && Position2 != 100) {
        	 int Die_Num=(int) ((Math.floor(Math.random()*10)%6)+1);
             int Options = (int) Math.floor(Math.random()*10)%3;
             
             if(x%2==0) {
                 player1(Die_Num, Options);
        	     System.out.println("Position of Ladder : "+Position1);
              }
              else {
            	 player2(Die_Num, Options);
         	     System.out.println("Position of Ladder : "+Position2);
              }
              if(Options!=2)
            	  x++;
         }

         if(Position1==100) {
            System.out.println("Player 1 wins");
            System.out.println("Number of times dice rolled " +count1);
         }
         else {
       	    System.out.println("Player 2 wins");
       	    System.out.println("Number of times dice rolled  "+count2);
         }
     }
    
    public static int player1(int Die_Num, int Options) {
 	   
  	    System.out.println("Position of Ladder : "+Position1);
        System.out.println("Die Number :" +Die_Num);
        System.out.println("Check_Option :"+Options);

        switch(Options) {
                case Laddder :    	  
                {
      	        if(Position1 <=100 && (Position1+Die_Num) <=100 )
      	        Position1 = Position1 + Die_Num; 
      	        break;
      	  
                }
                case Snake :
                {  
      	        if(Position1 >0 && (Position1-Die_Num)>0 )
      	        Position1=Position1-Die_Num;
      	        break;
                } 
               case No_Play :
                {
                   Position1=Position1;
                   break;
                }
           }
          count1++;
          return Position1;
      
     }
    
   public static int player2(int Die_Num, int Options) {
 	   
		  System.out.println("Position of Ladder : "+Position2);
	      System.out.println("Die Number :" +Die_Num);
	      System.out.println("Check_Option :"+Options);

	      switch(Options) {
	              case Laddder :    	  
	              {
	    	        if(Position2 <=100 && (Position2+Die_Num) <=100 )
	    	        Position2 = Position2 + Die_Num; 
	    	        break;
	    	  
	              }
	              case Snake :
	              {  
	    	        if(Position2 >0 && (Position2-Die_Num)>0 )
	    	        Position2=Position2-Die_Num;
	    	        break;
	              } 
	             case No_Play :
	              {
	                 Position2=Position2;
	                 break;
	              }
	         }
	        count2++;
	        return Position2;
	    
	   }
         
}
