public class Aiguillage{
  
  private boolean versDroite;
  private float x;
  private float y;

  public Aiguillage(float x,float y){
    this.x = x;
    this.y = y;
    versDroite = true;
  }

  public void modifyAiguillage(Aiguillage aiguillages){
    if(aiguillages.versDroite == true){
      aiguillages.versDroite = false;
    } else {
      aiguillages.versDroite = true;
    }
  }

public void draw(){
  
  float length = 30;
  float angle;

  if(versDroite){
    angle = PI/4; // Si versDroite est true, angle de 45 degrés vers le haut
  } else {
    angle = -PI/4; // Si versDroite est false, angle de 45 degrés vers le bas
  }
  
  stroke(0);
  strokeWeight(2);
  line(x,y,x + cos(angle) * length,y + sin(angle) * length);
  }

}