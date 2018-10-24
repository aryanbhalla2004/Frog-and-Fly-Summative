import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Creature extends Actor
{
    /**
     * atEdgeofworld check if the that Frog or the fly at the edge
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public boolean atEdgeOfWorld()
    {
        /**
         * atEdgeofworld check if the that Frog or the fly at the edge...
         * if it is, it makes the actor turn 7 digress 
         * 
         * @param There is no parameter
         * @return Nothing is returned
         */
        if(isAtEdge() == true)
        {
            turn(7);
        }
        return getX()<5 || getY()<5 || getX()>getWorld().getWidth()-5 || getY()>getWorld().getHeight()-5;
    }  
}
