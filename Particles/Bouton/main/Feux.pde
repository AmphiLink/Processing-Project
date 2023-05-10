public class Feux {

  private boolean estVert; // true = vert -- false == rouge 
  private float x;
  private float y;
  private float angle;

  public Feux(float x, float y){
    this.x = x;
    this.y = y;
    estVert = true;
  }


  public void draw() {
    stroke(0);
    strokeWeight(1);
  if (estVert == true) {
    fill(#20f020);
  } else {
    fill(#FF0000);
  }
    ellipse(x, y, 10, 10);
  }
}
  
  public void modifyFeux(Feux feux){
    if (feux.estVert == true) {
      feux.estVert = false;
    } else {
      feux.estVert = true;
    }
  }

  
  
  
  
  
  /*color[] P1F = new color[4];
  color[] P2F = new color[8];
  color[] P3F = new color[4];
  color[] S1F = new color[4];
  color[] P1FS = new color[1];
  color[] P2FS = new color[2];
  color[] P3FS = new color[1];
  color[] S1FS = new color[2];
  
  color green = color(0, 255, 0);
  color red = color(225, 0, 0);
  



  void modifyFeux(color[] feu, int index){
    if(feu[index] == red){feu[index] = green;}
    else if(feu[index] == green){feu[index] = red;}
  };


  void feuDraw(int x, int y, color[] feu, int index){
    for(int i = 0; i<feu.length;i++){
      if(feu[i] == green){
        fill(green);
        circle(x, y, 10);
      }
      else if (feu[i] == red){
        fill(red);
        circle(x, y, 10);
      }
    }
  }

  */

