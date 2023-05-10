class Feux{
  color[] P1F = new color[4];
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




}
