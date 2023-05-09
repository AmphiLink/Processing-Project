public void button(int getX, int getY, int getLenght, int getWidth){
  pushStyle();
 
  if ((mouseX > getX && mouseX < getX + getLenght) && (mouseY > getY && mouseY < getY + getWidth)){
    fill(155);
    if (mouseButton == LEFT) fill(0);
    
  }
    
  noStroke();
  rect(getX, getY, getLenght, getWidth);
  
  popStyle();
  
}
  
