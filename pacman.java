import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pacman extends Actor
{
    private static final int COUNT_DOWN_MOUTH_START_VALUE = 10;
    private static final int OFFSET = 5;
    private int mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
    
    private String [][]images;
    private int imageIndex;
    
    private int direction = 0;
    private int score = 0;
    
    public pacman(){
        images = new String[4][2];
        
        images[0][0]="E:/Tareas/pacman-open.png";
        images[0][1]="E:/Tareas/pacman-close.png";
        images[1][0]="E:/Tareas/pacman-open-left.png";
        images[1][1]="E:/Tareas/pacman-close-left.png";
        images[2][0]="E:/Tareas/pacman-open-down.png";
        images[2][1]="E:/Tareas/pacman-close-down.png";
        images[3][0]="E:/Tareas/pacman-open-up.png";
        images[3][1]="E:/Tareas/pacman-close-up.png";
        
        setImage(images[0][1]);
    }
    public void act()
    {
        movePacman();
        handleKeys();
        handleImageSelect();
        checkCollisions();
        updateHud();
    }
    
    private void checkCollisions(){
        item item=(item)this.getOneIntersectingObject(item.class);
        if(item!=null){
            score += item.getPoints();
            this.getWorld().removeObject(item);
        }
    }
    
    private void updateHud(){
        World world = getWorld();
        
        world.showText("Score" + score,world.getWidth() - 100,20);
    }
    
    private void movePacman(){
        Boolean touch = isTouching(barrier.class);
        if(!isTouching(barrier.class)){
            switch(direction){
                case 0:
                    setLocation(getX() + OFFSET, getY());
                    break;
                case 1:
                    setLocation(getX() - OFFSET, getY());
                    break;
                case 2:
                    setLocation(getX(), getY()+ OFFSET);
                    break;
                case 3:
                    setLocation(getX(), getY() - OFFSET);
                    break;
                
            }
        }else{
        switch(direction){
                case 0:
                    setLocation(getX() - 2*OFFSET, getY());
                    break;
                case 1:
                    setLocation(getX() + 2*OFFSET, getY());
                    break;
                case 2:
                    setLocation(getX(), getY() - 2*OFFSET);
                    break;
                case 3:
                    setLocation(getX(), getY() + 2*OFFSET);
                    break;
                
            }
            Greenfoot.delay(10);
        }
    }
    
    private void handleKeys(){
        if(Greenfoot.isKeyDown("left")){
            direction = 1;
        }else
        if(Greenfoot.isKeyDown("right")){
            direction = 0;
        }else
        if(Greenfoot.isKeyDown("up")){
            direction = 3;
        }else
        if(Greenfoot.isKeyDown("down")){
            direction = 2;
        }
    }
    
    private void handleImageSelect(){
        mouthDelay--;
        if(mouthDelay ==0){
            mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
            imageIndex = ( imageIndex +1 ) % images[direction].length;
            setImage(images[direction][imageIndex]);
        }

    }
}
