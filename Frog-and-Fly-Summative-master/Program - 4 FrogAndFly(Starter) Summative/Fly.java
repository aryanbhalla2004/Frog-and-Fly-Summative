import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    /**
     * Fly is the contructor that make the fly respone in different roation\
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public Fly()
    {
        setRotation(getRandomNumber(0,360) ); 
    }
    
    /**
     * Fly is the contructor that make the fly respone in different roation\
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public int getRandomNumber(int start, int end)
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
    /**
     * act is the contructor that make the fly object
     * checkkeys check for key press (left, right, up, and down)
     * checkForFood check for the food around or under the fly
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void act() 
    {
        checkKeys();
        checkForFood(); 
    } 
    
    /**
     * checkForFood is the contructor that make the fly eat food
     * isTouching is making the fly eat food my the going on top of the food
     * update is updating the scoreboard in the world
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    private void checkForFood()
    {
        if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            //call the method update from the beach class
            ( (Beach)getWorld() ).update();
        }
    }
    
    /**
     * checkKeys is the contructor that make the fly move around...
     * So if I press left it will go left and if i press right it will go right                                                                                    
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("right"))
        {
             turn(5);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            move(4);
        }
        
    }
}
