boolean circleOver = false;
boolean rectOver = false;
boolean overCircle = false;
boolean boolCircle = false;

public class bouton1(){
  
}

boolean overStation(int x, int y, int getHeight, int getWidth) {
  if ((mouseX > x && mouseX < x + getHeight) && (mouseY > y && mouseY < y + getWidth)){
    return true;
  }{
    return false;
  }
}

public void updateStation(int getX, int getY, int getHeight, int getWidth){
  if(overStation(getX, getY, getHeight, getWidth)){
    rectOver = true;
    
  }else{
    rectOver = false;
  }
  
}

void mouseReleased(){
    for(Feux feu : feux){
      update(feu.x, feu.y, diameterLight);
      if(circleOver){
        feu.switch_();
      }
    }
    for(Aiguillage aiguillage : aiguillages){
      update(aiguillage.x, aiguillage.y, diameterTurnout);
      if(circleOver){
        aiguillage.switch_();
      }
    }
    /*for(int gare1 : pgare1){
      updateStation(gare1);
    }*/
}

boolean overCircle(float x, float y, int diameter) {
  float disX = x - mouseX;
  float disY = y - mouseY;
  if (sqrt(sq(disX) + sq(disY)) < diameter/2 ) {
    return true;
  } else {
    return false;
  }
}

void update(float x, float y, int diameter){
  if(overCircle(x, y, diameter)){
    circleOver = true;
  }else{
    circleOver = false;
  } 
}
