public final float BASE_RADIUS = 360;

public void setup(){
  size(800,800);
  
  strokeWeight(2);

}



void draw(){
  background(39, 95, 134);
  //arc (400 , 450 , 700 , 700 , PI, PI*2);
  
  //Gp1
  button(50, 400, 50, 25);
  button(50, 450, 50, 25);
  button(50, 500, 50, 25);
  button(50, 550, 50, 25);
  
  //G2
  button(350, 200, 50, 25);
  button(350, 250, 50, 25);
  button(350, 300, 50, 25);
  button(350, 350, 50, 25);
  
  //G3
  button(700, 400, 50, 25);
  button(700, 450, 50, 25);
  button(700, 500, 50, 25);
  button(700, 550, 50, 25);
  
  
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
}
