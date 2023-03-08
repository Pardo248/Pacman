import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        pacman pacman = new pacman();
        addObject(pacman,25,25);
      
        barrier barrier = new barrier();
        addObject(barrier,25,90);
        barrier barrier2 = new barrier();
        addObject(barrier2,75,90);
        barrier barrier3 = new barrier();
        addObject(barrier3,120,90);
        barrier barrier4 = new barrier();
        addObject(barrier4,239,23);
        barrier barrier5 = new barrier();
        addObject(barrier5,239,72);
        barrier barrier6 = new barrier();
        addObject(barrier6,25,214);
        barrier barrier7 = new barrier();
        addObject(barrier7,65,214);
        barrier barrier8 = new barrier();
        addObject(barrier8,112,214);
        barrier barrier9 = new barrier();
        addObject(barrier9,155,214);
        barrier barrier10 = new barrier();
        addObject(barrier10,25,323);
        barrier barrier11 = new barrier();
        addObject(barrier11,147,320);
        barrier barrier12 = new barrier();
        addObject(barrier12,195,320);
        barrier barrier13 = new barrier();
        addObject(barrier13,308,373);
        barrier barrier14 = new barrier();
        addObject(barrier14,308,322);
        barrier barrier15 = new barrier();
        addObject(barrier15,308,272);
        barrier barrier16 = new barrier();
        addObject(barrier16,308,220);
        barrier barrier17 = new barrier();
        addObject(barrier17,196,214);
        barrier barrier18 = new barrier();
        addObject(barrier18,360,79);
        barrier barrier19 = new barrier();
        addObject(barrier19,360,28);
        barrier barrier20 = new barrier();
        addObject(barrier20,353,220);
        barrier barrier21 = new barrier();
        addObject(barrier21,427,324);
        barrier barrier22 = new barrier();
        addObject(barrier22,477,324);
        barrier barrier23 = new barrier();
        addObject(barrier23,592,324);
        barrier barrier24 = new barrier();
        addObject(barrier24,476,215);
        barrier barrier25 = new barrier();
        addObject(barrier25,508,215);
        barrier barrier26 = new barrier();
        addObject(barrier26,490,116);
        barrier barrier27 = new barrier();
        addObject(barrier27,490,70);
        barrier23.setLocation(588,332);
        removeObject(barrier23);
        Apple apple = new Apple();
        addObject(apple,24,268);
        Banana banana = new Banana();
        addObject(banana,560,368);
        Cherry cherry = new Cherry();
        addObject(cherry,298,31);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,31,372);
        Banana banana2 = new Banana();
        addObject(banana2,30,143);
        Apple apple2 = new Apple();
        addObject(apple2,559,24);
        point point = new point();
        addObject(point,89,24);
        point point2 = new point();
        addObject(point2,142,24);
        point point3 = new point();
        addObject(point3,178,63);
        point point4 = new point();
        addObject(point4,181,121);
        point point5 = new point();
        addObject(point5,112,150);
        point point6 = new point();
        addObject(point6,240,152);
        point point7 = new point();
        addObject(point7,251,212);
        point point8 = new point();
        addObject(point8,248,262);
        point point9 = new point();
        addObject(point9,196,265);
        point point10 = new point();
        addObject(point10,140,266);
        point point11 = new point();
        addObject(point11,78,266);
        point point12 = new point();
        addObject(point12,80,316);
        point point13 = new point();
        addObject(point13,82,374);
        point point14 = new point();
        addObject(point14,142,372);
        point point15 = new point();
        addObject(point15,200,368);
        point point16 = new point();
        addObject(point16,250,375);
        point point17 = new point();
        addObject(point17,248,316);
        point point18 = new point();
        addObject(point18,297,141);
        point point19 = new point();
        addObject(point19,298,84);
        point point20 = new point();
        addObject(point20,358,143);
        point point21 = new point();
        addObject(point21,421,148);
        point point22 = new point();
        addObject(point22,418,92);
        point point23 = new point();
        addObject(point23,416,38);
        point point24 = new point();
        addObject(point24,482,15);
        point point25 = new point();
        addObject(point25,563,80);
        point point26 = new point();
        addObject(point26,560,132);
        point point27 = new point();
        addObject(point27,491,164);
        point point28 = new point();
        addObject(point28,569,212);
        point point29 = new point();
        addObject(point29,412,215);
        point point30 = new point();
        addObject(point30,413,272);
        point point31 = new point();
        addObject(point31,362,271);
        point point32 = new point();
        addObject(point32,467,272);
        point point33 = new point();
        addObject(point33,525,274);
        point point34 = new point();
        addObject(point34,569,275);
        point point35 = new point();
        addObject(point35,364,328);
        point point36 = new point();
        addObject(point36,366,377);
        point point37 = new point();
        addObject(point37,431,376);
        point point38 = new point();
        addObject(point38,488,375);
        point point39 = new point();
        addObject(point39,549,321);
    }
}
