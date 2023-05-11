  Gare gares = new Gare();
  Track tracks = new Track();
  
  int[] pgare1 = {1, 0, 1, 0};
  int[] pgare2 = {0, 0, 1, 0};
  int[] pgare3 = {0, 0, 0, 0};
  int[] sgare = {1, 1};
  

  int[] P1ToP2 = {1, 1};  
  int[] P2ToP3 = {1, 1};
  int[] P1ToS1 = {1, 1};
  int[] S1ToP3 = {1, 1};

  int[] coordGare2 = {500, 100}; 
  int[] coordGare3 = {900, 400}; 
  int[] coordSGare = {500, 700}; 
  int[] coordGare1 = {100, 400};
  

  public Aiguillage[] aiguillages;
  public Feux[] feux;
  public buttonG1[] g1;
  public buttonG2[] g2;
  public buttonG3[] g3;
  public void setup(){

    size(1000,800);
    strokeWeight(2);  
    
     // Initialisation des boutons les différents gares
     g1 = new buttonG1[]{
       new buttonG1(coordGare1[0]-72, coordGare1[1]-65, 0),
       new buttonG1(coordGare1[0]-72, coordGare1[1]-30, 1),
       new buttonG1(coordGare1[0]-72, coordGare1[1]+5, 2),
       new buttonG1(coordGare1[0]-72, coordGare1[1]+40, 3),
     };
     g2 = new buttonG2[]{
       new buttonG2(coordGare2[0], coordGare2[1]+100, 0),
       new buttonG2(coordGare2[0], coordGare2[1]+130, 1),
       new buttonG2(coordGare2[0], coordGare2[1]+160, 2),
       new buttonG2(coordGare2[0], coordGare2[1]+190, 3),
     };
     g3 = new buttonG3[]{
       new buttonG3(coordGare3[0]+60, coordGare3[1]-65, 0),
       new buttonG3(coordGare3[0]+60, coordGare3[1]-27, 1),
       new buttonG3(coordGare3[0]+60, coordGare3[1]+14, 2),
       new buttonG3(coordGare3[0]+60, coordGare3[1]+55, 3),
     };
    
    feux = new Feux[]{
      // Gare 2 - en haut au milieu 
      new Feux( coordGare2[0]-32,  coordGare2[1]-60), // feu1, gare 1 plus haut gauche 
      new Feux( coordGare2[0]+17,  coordGare2[1]-60), // feu2, gare 1 plus haut droite 
      new Feux( coordGare2[0]-32,  coordGare2[1]-20), // feu3, gare 1 haut gauche 
      new Feux( coordGare2[0]+17,  coordGare2[1]-20), // feu4, gare 1 haut droite
      new Feux( coordGare2[0]-32,  coordGare2[1]+20), // feu5, gare 1 bas gauche
      new Feux(coordGare2[0]+17, coordGare2[1]+20), // feu6, gare 1 bas droite 
      new Feux(coordGare2[0]-32, coordGare2[1]+60), // feu7, gare 1 plus bas gauche 
      new Feux(coordGare2[0]+17, coordGare2[1]+60), // feu8, gare 1 plus bass droite
      new Feux(coordGare2[0]-85, coordGare2[1]-10), // feu9 gare 1 entrée gauche 
      new Feux(coordGare2[0]+85, coordGare2[1]-10), // feu10 gare 1 entrée droite
      // Gare 3 - milieu droite
      new Feux(coordGare3[0]+7, coordGare3[1]-60), // feu11, plus haut gauche 
      new Feux(coordGare3[0]+7, coordGare3[1]-20), // feu12, haut gauche
      new Feux(coordGare3[0]+7, coordGare3[1]+20), // feu13, bas gauche 
      new Feux(coordGare3[0]+7, coordGare3[1]+60), // feu14, plus bad gauche 
      new Feux(coordGare3[0]-90, coordGare3[1]), // feu15, entrée gauche
      // Gare 1 - milieu gauche
      new Feux(coordGare1[0]-22, coordGare1[1]-60), // feu16, plus haut gauche 
      new Feux(coordGare1[0]-22, coordGare1[1]-20), // feu17, haut gauche
      new Feux(coordGare1[0]-22, coordGare1[1]+20), // feu18, bas gauche 
      new Feux(coordGare1[0]-22, coordGare1[1]+60), // feu19, plus bad gauche 
      new Feux(coordGare1[0]+90, coordGare1[1]), // feu20, entrée droite
      // SGare  - milieu bas
      new Feux(coordSGare[0]-32, coordSGare[1]-40), // feu21,haut gauche
      new Feux(coordSGare[0]+17, coordSGare[1]-40), // feu22, haut droite
      new Feux(coordSGare[0]-32, coordSGare[1]+5), // feu21, bas gauche
      new Feux(coordSGare[0]+17, coordSGare[1]+5), // feu22, bas droite
      new Feux(coordSGare[0]-85, coordSGare[1]), // feu25, entrée gauche 
      new Feux(coordSGare[0]+75, coordSGare[1]), // feu26, entrée droite
    };
    

    aiguillages = new Aiguillage[]{
      // Gare 1
      new Aiguillage(coordGare1[0]+65,coordGare1[1]-4,true),
      new Aiguillage(coordGare1[0]+18,coordGare1[1]-30,true),
      new Aiguillage(coordGare1[0]+18,coordGare1[1]+35,true),
      // Gare 2
      new Aiguillage(coordGare2[0]+71,coordGare2[1]-4,true),
      new Aiguillage(coordGare2[0]+45,coordGare2[1]-30,true),
      new Aiguillage(coordGare2[0]+45,coordGare2[1]+35,true),
      new Aiguillage(coordGare2[0]-71,coordGare2[1]-4,false),
      new Aiguillage(coordGare2[0]-50,coordGare2[1]-30,false),
      new Aiguillage(coordGare2[0]-50,coordGare2[1]+35,false),
      // Gare 3 
      new Aiguillage(coordGare3[0]-65,coordGare3[1]-4,false),
      new Aiguillage(coordGare3[0]-20,coordGare3[1]-30,false),
      new Aiguillage(coordGare3[0]-20,coordGare3[1]+35,false),
      // SGare 
      new Aiguillage(coordSGare[0]-72,coordSGare[1]-20,false), // aiguillage13, gauche
      new Aiguillage(coordSGare[0]+52,coordSGare[1]-20,true), // aiguillage13, droite
    };


  }



  void draw(){
    background(39, 95, 134);
    //arc (400 , 450 , 700 , 700 , PI, PI*2);
    tracks.draw();
    gares.draw(coordGare2[0], coordGare2[1], pgare2);
    gares.plateformesDraw(coordGare2[0] - 20, coordGare2[1] - 50, pgare2);
    
    gares.draw(coordGare3[0], coordGare3[1], pgare3);
    gares.plateformesDraw(coordGare3[0] + 20, coordGare3[1] - 50, pgare3);
    
    gares.draw(coordGare1[0], coordGare1[1], pgare1);
    gares.plateformesDraw(coordGare1[0] - 60, coordGare1[1] - 50, pgare1);
    
    gares.Sdraw(coordSGare[0], coordSGare[1], sgare);
    gares.plateformesDraw(coordSGare[0] - 20, coordSGare[1] - 30, sgare);
    
    for(buttonG1 button : g1){
      button.draw();
    }
    for(buttonG2 button : g2){
      button.draw();
    }
    for(buttonG3 button : g3){
      button.draw();
    }

    for ( Feux feu : feux){
      feu.draw();
    }

    for (Aiguillage aiguillage : aiguillages){
      aiguillage.draw();
    }
  

  }
//>>>>>>> d3154952582d9f6e16ebf28ff3ba7c2e05540a4c
