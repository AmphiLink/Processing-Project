public class Gare{
  
  void Sdraw(int x, int y) {
      fill(90); 
      strokeWeight(1);
      rect(x - 65, y - 75, 130, 130); 
  }

  void draw(int x, int y) {
      fill(150); 
      strokeWeight(1);
      rect(x - 75, y - 75, 150, 150);  
    }
  
  void plateformesDraw(int x, int y, int[] gare){
    int espace = 0;
    for(int i = 0; i < gare.length; i++){
      if(gare[i] == 0){
        strokeWeight(4);
        stroke(255);
        line(x, y + espace, x + 25, y + espace);
      }
      else if(gare[i] == 1){
        strokeWeight(2);
        stroke(225);
        rect(x, y + espace, 25, -15);
      }
      else if(gare[i] == 2){
        strokeWeight(2);
        stroke(225);
        rect(x, y + espace, 25, -15);
      }
      espace = espace + 36;
    }
  }
}
