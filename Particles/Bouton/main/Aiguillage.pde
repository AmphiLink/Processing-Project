public class Aiguillage{
  
  boolean versDroite;
  float x;
  float y;
  boolean reversed;

  public Aiguillage(float x,float y,boolean reversed){
    this.x = x;
    this.y = y;
    this.reversed = reversed;
    versDroite = true;
  }
  public void switch_(){
    versDroite = !versDroite;
  }
  public void draw(){
    
    float length = 25;
    float angle;
  
    if(versDroite){
      angle = PI/4; // Si versDroite est true, angle de 45 degrés vers le haut
    } else {
      angle = -PI/4; // Si versDroite est false, angle de 45 degrés vers le bas
    }
  
    if (reversed) {
      angle += PI;
    }
   
    stroke(0);
    strokeWeight(2);
    stroke(#FFFFFF); 
    line(x,y,x + cos(angle) * length,y + sin(angle) * length);
   }


  }
