import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    //varable for the scoreboard
    private int points;
    //font style for the score board
    private Font myFont = new Font("Comic Sans MS", true, false, 30);
    
    /**
     * Scoreboard is desing the scoreboard by the font style, the size of the font and color
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(620,820);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    /**
     * addToScore is adding and updating the score in the scoreboard
     * it is adding the score if the fly is the food
     * 
     * @param There is no parameter
     * @return Nothing is returned
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
            img.drawString("Score: " + points, 5,25); 

    }    
}
