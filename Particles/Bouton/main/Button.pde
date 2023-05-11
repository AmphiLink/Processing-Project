boolean circleOver = false;
boolean overCircle = false;
boolean boolCircle = false;

boolean overStation(int x, int y, int getHeight, int getWidth) {
  if ((mouseX > x && mouseX < x + getHeight) && (mouseY > y && mouseY < y + getWidth)){
    return true;
  }{
    return false;
  }
}

public void buttonStation(int getX, int getY, int getHeight, int getWidth){
  pushStyle();
  if(overStation(getX, getY, getHeight, getWidth)){
    fill(255,80);
    if(mouseButton == LEFT) fill(0);
  }
    
  noStroke();
  rect(getX, getY, getHeight, getWidth);
  
  popStyle();
  
}

void mouseReleased(){
    for(Feux feu : feux){
      update(feu.x, feu.y, diameterLight, feu.estVert);
      if(circleOver){
        feu.switch_();
      }
    }
    for(Aiguillage aiguillage : aiguillages){
      update(aiguillage.x, aiguillage.y, diameterLight, aiguillage.versDroite);
      if(circleOver){
        aiguillage.switch_();
      }
    }
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

void update(float x, float y, int diameter, boolean vert){
  if(overCircle(x, y, diameter)){
    circleOver = true;
  }else{
    circleOver = false;
  } 
}
