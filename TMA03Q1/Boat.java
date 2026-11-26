import java.awt.*;
/**
 * A boat that can be manipulated and drawn on a canvas.
 *
 * @author  M250 Module Team
 * @version v1
 */
public class Boat
{
    private int height;
    private int length;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    private static int nextNum = 1; 

    /**
     * Create a new boat at default position with default color.
     * @param anXPosition the boat's x position
     * @param aYPosition the boat's y position
     */
    public Boat(int anXPosition, int aYPosition)
    {
        height = 40;
        length = 200;
        xPosition = anXPosition;
        yPosition = aYPosition;
        color = "black";
        isVisible = false;
    }

    /**
     * Return the boat's x position
     * @return xPosition
     */
    public int getXPosition()
    {
        return xPosition;
    }

    /**
     * Return the boat's y position
     * @return yPosition
     */
    public int getYPosition()
    {
        return yPosition;
    }

    /**
     * Return the boat's length
     * @return length
     */
    public int getLength()
    {
        return length;
    }

    /**
     * Return whether this boat is set to be visible or not
     * @return isVisible
     */
    public boolean isVisible()
    {
        return isVisible;
    }

    /**
     * Return this boat's colour string.
     * @return color
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Make this boat visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    /**
     * Make this boat invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    /**
     * Return a string representation of the boat including its length and height.
     * @return a string representation of the boat
     */ 
    public String toString()
    {
        return "A boat with length " + length + " and height" + height;
    }

    /**
     * Draws an image of the boat on the canvas
     */
    public void draw()
    {
        //to be completed
    }    

    /***************************Other provided methods not required to answer the question********/

    /**
     * Move the boat a few pixels to the right. 
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the boat a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the boat a few pixels up.     
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the boat a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move boat  horizontally by 'distance' pixels.
     * @param distance the distance to move horizontally
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the boat vertically by 'distance' pixels.
     * @param distance the distance to move vertically.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the boat horizontally by 'distance' pixels.
     * @param distance the distance to move horizontally
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if (distance < 0) {
            delta = -1;
            distance = -distance;
        }
        else {
            delta = 1;
        }

        for (int i = 0; i < distance; i++) {
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the boat vertically by 'distance' pixels.
     * @param distance the distance to move vertically
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if (distance < 0) {
            delta = -1;
            distance = -distance;
        }
        else {
            delta = 1;
        }

        for (int i = 0; i < distance; i++) {
            yPosition += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     * @param newHeight the new height of the boat
     * @param newLength the new length of the boat
     */
    public void changeSize(int newHeight, int newLength)
    {
        erase();
        height = newHeight;
        length = newLength;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     * @param newColor the colour string to use for the new boat colour
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /**
     * Erase the boat
     */
    private void erase()
    {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}