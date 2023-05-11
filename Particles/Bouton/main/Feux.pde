
int diameterLight = 15;

void mouseReleased(){
    for(Feux feu : feux){
      update(feu.x, feu.y, diameterLight, feu.estVert);
      if(circleOver){
        feu.switch_();
      }
    }
}
public class Feux {// true = vert -- false == rouge
  private float x;
  private float y;
  private float angle;
  boolean estVert;
  
  public Feux(float x, float y) {
    this.x = x;
    this.y = y;
    estVert = true;
    
  }
  public void switch_(){
    estVert = !estVert;
  }

  public void draw() {
    pushMatrix();
    stroke(0);
    strokeWeight(1);
    if (estVert) {
      fill(#20f020);
    } else {
      fill(#FF0000);
    }
    
    if(estVert && overCircle(x, y, diameterLight
    }else if (overCircle(x, y, diameterLight)){
       fill(#FF0000, 150);
    }
    
    ellipse(x, y, diameterLight, diameterLight);
    System.out.println();
    popMatrix();
  }
  
}
