/*public void setup(){
  size(800,800);
  
  strokeWeight(2);
  
  ellipseMode(CENTER);
}



void draw(){
  background(39, 95, 134);

  //arc (400 , 450 , 700 , 700 , PI, PI*2);
  //Gp1
  buttonStation(50, 400, 50, 25);
  buttonStation(50, 450, 50, 25);
  buttonStation(50, 500, 50, 25);
  buttonStation(50, 550, 50, 25);
  
  //G2
  buttonStation(350, 175, 50, 25);
  buttonStation(350, 225, 50, 25);
  buttonStation(350, 275, 50, 25);
  buttonStation(350, 325, 50, 25);
  
  //G3
  buttonStation(700, 400, 50, 25);
  buttonStation(700, 450, 50, 25);
  buttonStation(700, 500, 50, 25);
  buttonStation(700, 550, 50, 25);
  
  //GS
  buttonStation(350, 575, 50, 25);
  buttonStation(350, 650, 50, 25);
  
  buttonlight(20, 20, 50);
  
  line(50, 425, 100, 425);
  
  
  
  line(50, 475, 100, 475);
  
  line(50, 525, 100, 525);
  line(50, 575, 100, 575);
  
  
  //GP3
  line(700, 425, 750, 425);
  line(700, 475, 750, 475);
  line(700, 525, 750, 525);
  line(700, 575, 750, 575);
  
  //GS1
  line(350, 600, 400, 600);
  line(350, 675, 400, 675);
  
  //GP2
  line(350, 200, 400, 200);
  line(350, 250, 400, 250);
  line(350, 300, 400, 300);
  line(350, 350, 400, 350);
  
  noFill();
  stroke(#D3D8DB);
}*/
  public final float BASE_RADIUS = 360;
  Gare gares = new Gare();



  public void setup(){
    size(800,800);
    
    strokeWeight(2);

  }



  void draw(){
    background(39, 95, 134);
    //arc (400 , 450 , 700 , 700 , PI, PI*2);
    
    gares.draw();

    
    
  }
//>>>>>>> d3154952582d9f6e16ebf28ff3ba7c2e05540a4c
