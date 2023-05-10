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
  Gare gares = new Gare();
  Track tracks = new Track();
  
  int[] pgare1 = {1, 0, 1, 0};
  int[] pgare2 = {0, 0, 1, 0};
  int[] pgare3 = {2, 0, 2, 0};
  int[] sgare = {0, 0, 0, 0};
  

  /*
  int[] pgare1 = new int[4];
  int[] pgare2 = new int[4];
  int[] pgare3 = new int[4];
  int[] sgare = new int[2];

  int[] coordGare1 = {500, 100}; 
  int[] coordGare2 = {900, 400}; 
  int[] coordSGare = {500, 700}; 
  int[] coordGare3 = {100, 400};


  */
  Gare gares = new Gare();
  Track tracks = new Track();
  
  public Feux[] feux;
  public void setup(){

    size(1000,800);
    strokeWeight(2);  




    feux = new Feux[]{
      new Feux(50,50),
      new Feux(200,300),
      new Feux(150,350)
    };


  }



  void draw(){
    background(39, 95, 134);
    //arc (400 , 450 , 700 , 700 , PI, PI*2);
    tracks.draw();
    gares.draw(coordGare1[0], coordGare1[1], pgare1);
    gares.plateformesDraw(coordGare1[0] - 20, coordGare1[1] - 50, pgare1);
    
    gares.draw(coordGare2[0], coordGare2[1], pgare2);
    gares.plateformesDraw(coordGare2[0] + 20, coordGare2[1] - 50, pgare2);
    
    gares.draw(coordGare3[0], coordGare3[1], pgare3);
    gares.plateformesDraw(coordGare3[0] - 60, coordGare3[1] - 50, pgare3);
    
    gares.Sdraw(coordSGare[0], coordSGare[1], sgare);
    gares.plateformesDraw(coordSGare[0] - 20, coordSGare[1] - 60, sgare);
    
    gares.draw(gares.coordGare3[0], gares.coordGare3[1], gares.pgare3);
    gares.plateformesDraw(gares.coordGare3[0] - 60, gares.coordGare3[1] - 50, gares.pgare3);

    for ( Feux feu : feux){
      feu.draw();
    }
  
  }
//>>>>>>> d3154952582d9f6e16ebf28ff3ba7c2e05540a4c
