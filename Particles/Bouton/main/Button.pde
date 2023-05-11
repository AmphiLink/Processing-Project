boolean circleOver = false;
boolean rectOver = false;
boolean overCircle = false;
boolean boolCircle = false;

boolean overStation(float x, float y, float getHeight, float getWidth) {
  if ((mouseX > x && mouseX < x + getHeight) && (mouseY > y && mouseY < y + getWidth)){
    return true;
  }{
    return false;
  }
}

public void updateStation(float getX, float getY, float getHeight, float getWidth){
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
    for(buttonG1 button : g1){
      updateStation(button.x, button.y, 10, 10);
      if(rectOver){
        button.switch_();
      }
    }
    for(buttonG2 button : g2){
      updateStation(button.x, button.y, 10, 10);
      if(rectOver){
        button.switch_();
      }
    }
    for(buttonG3 button : g3){
      updateStation(button.x, button.y, 10, 10);
      if(rectOver){
        button.switch_();
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

void update(float x, float y, int diameter){
  if(overCircle(x, y, diameter)){
    circleOver = true;
  }else{
    circleOver = false;
  } 
}
