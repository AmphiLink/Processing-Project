boolean circleOver = false;

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

boolean overCircle(int x, int y, int diameter) {
  float disX = x - mouseX;
  float disY = y - mouseY;
  if (sqrt(sq(disX) + sq(disY)) < diameter/2 ) {
    return true;
  } else {
    return false;
  }
}

public void buttonlight(int getX, int getY, int diameter){
  pushStyle();
  
  
  if(overCircle(getX, getY, diameter)){
    fill(255, 80);
  }
   
  ellipse(getX, getY, diameter, diameter);
  noStroke();
  
  
  popStyle();
  
}

boolean reversed(){
  if (mouseButton == LEFT){ 
    return true;
  }else{
    return false;
  }
  
}
public void buttonTurnout(int x, int y, int diameter){
  pushStyle();
  
  
  if(overCircle(x, y, diameter)){
    if(reversed()){
      x = x + 20;
    }
  }
   
  ellipse(x, y, diameter, diameter);
  noStroke();
  
  
  popStyle();
  
}
