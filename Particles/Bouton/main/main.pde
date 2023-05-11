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
  int[] pgare3 = {0, 0, 0, 0};
  int[] sgare = {0, 1};
  

/*
  int[] pgare1 = new int[4];
  int[] pgare2 = new int[4];
  int[] pgare3 = new int[4];
  int[] sgare = new int[2];
  */

  int[] coordGare1 = {500, 100}; 
  int[] coordGare2 = {900, 400}; 
  int[] coordSGare = {500, 700}; 
  int[] coordGare3 = {100, 400};
  

  public Aiguillage[] aiguillages;
  public Feux[] feux;
  public void setup(){

    size(1000,800);
    strokeWeight(2);  

    feux = new Feux[]{
      // Gare 1 - en haut au milieu 
      new Feux(coordGare1[0]-29, coordGare1[1]-60), // feu1, gare 1 plus haut gauche 
      new Feux(coordGare1[0]+15, coordGare1[1]-60), // feu2, gare 1 plus haut droite 
      new Feux(coordGare1[0]-29, coordGare1[1]-20), // feu3, gare 1 haut gauche 
      new Feux(coordGare1[0]+15, coordGare1[1]-20), // feu4, gare 1 haut droite
      new Feux(coordGare1[0]-29, coordGare1[1]+20), // feu5, gare 1 bas gauche
      new Feux(coordGare1[0]+15, coordGare1[1]+20), // feu6, gare 1 bas droite 
      new Feux(coordGare1[0]-29, coordGare1[1]+60), // feu7, gare 1 plus bas gauche 
      new Feux(coordGare1[0]+15, coordGare1[1]+60), // feu8, gare 1 plus bass droite
      new Feux(coordGare1[0]-85, coordGare1[1]-10), // feu9 gare 1 entrée gauche 
      new Feux(coordGare1[0]+85, coordGare1[1]-10), // feu10 gare 1 entrée droite
      // Gare 2 - milieu droite
      new Feux(coordGare2[0]+7, coordGare2[1]-60), // feu11, plus haut gauche 
      new Feux(coordGare2[0]+7, coordGare2[1]-20), // feu12, haut gauche
      new Feux(coordGare2[0]+7, coordGare2[1]+20), // feu13, bas gauche 
      new Feux(coordGare2[0]+7, coordGare2[1]+60), // feu14, plus bad gauche 
      new Feux(coordGare2[0]-90, coordGare2[1]), // feu15, entrée gauche
      // Gare 3 - milieu gauche
      new Feux(coordGare3[0]-29, coordGare3[1]-60), // feu16, plus haut gauche 
      new Feux(coordGare3[0]-29, coordGare3[1]-20), // feu17, haut gauche
      new Feux(coordGare3[0]-29, coordGare3[1]+20), // feu18, bas gauche 
      new Feux(coordGare3[0]-29, coordGare3[1]+60), // feu19, plus bad gauche 
      new Feux(coordGare3[0]+90, coordGare3[1]), // feu20, entrée droite
      // SGare  - milieu bas
      new Feux(coordSGare[0]-29, coordSGare[1]-40), // feu21,haut gauche
      new Feux(coordSGare[0]+15, coordSGare[1]-40), // feu22, haut droite
      new Feux(coordSGare[0]-29, coordSGare[1]+5), // feu21, bas gauche
      new Feux(coordSGare[0]+15, coordSGare[1]+5), // feu22, bas droite
      new Feux(coordSGare[0]-85, coordSGare[1]), // feu25, entrée gauche 
      new Feux(coordSGare[0]+75, coordSGare[1]), // feu26, entrée droite
    };
    

    aiguillages = new Aiguillage[]{

      // SGare 
      new Aiguillage(coordSGare[0]-70,coordSGare[1]-20,false), // aiguillage13, gauche
      new Aiguillage(coordSGare[0]+50,coordSGare[1]-20,true), // aiguillage13, droite

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
    gares.plateformesDraw(coordSGare[0] - 20, coordSGare[1] - 30, sgare);
    

    for ( Feux feu : feux){
      feu.draw();
    }

    for (Aiguillage aiguillage : aiguillages){
      aiguillage.draw();
    }
  
  }
//>>>>>>> d3154952582d9f6e16ebf28ff3ba7c2e05540a4c
