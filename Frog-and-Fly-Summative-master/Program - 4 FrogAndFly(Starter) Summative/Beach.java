import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Aryan Bhalla
 * Class: Software Development 10S
 * Teacher: Mr.Hardman
 * Date Last Modified: 10/23/2018
 */

public class Beach extends World
{
    //create a Scoreboard variable that we will store a Scoreboard in later
    private Scoreboard score;
   /**
    * Beach is the constructor that creates a beach object
    * 
    * It add the size of the world, food...
    * Fly, Frog and adds a scoreboard
    *
    * @param There are no parameters
    * @return Nothing is returned
    */
    public Beach()
    {  
       super(800, 600, 1); 
       
       addFood(10);
       
       addFly();
       
       addFrog();
       
       score = new Scoreboard();
       
       addObject( score,315,426);
       
    }
    
    /**
     * Adds an Food objects in the world in random spots
     * 
     * @param There is one parameters, (int, n)
     * @return Nothing is returned
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    
    /**
     * addFly is adding Fly in to the world in the random location
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void addFly()
    {
        addObject( new Fly(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
    }
    
    /**
     * addFrog is adding Frog in to the center of the world
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void addFrog()
    {
        // add a Frog object at the center of the world 
       addObject(new Frog(), getWidth()/2, getHeight()/2);
    }
    
    /**
     * update, update the scoreboard when the Fly eat the food
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void update()
    {
        score.addToScore();
    }
    /**
     * act is the constructor that make the food reset after its all gone
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void act()
    {
        if(getObjects(Food.class).isEmpty() == true )
        {
             addFood(10);
        }
    }
}
