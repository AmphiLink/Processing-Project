public class Gare{
  /*
  int[] pgare1 = new int[4];
  int[] pgare2 = new int[4];
  int[] pgare3 = new int[4];
  int[] sgare = new int[2];
  */
  
  void draw(int x, int y, int[] gare) {
      fill(150); 
      strokeWeight(1);
      rect(x - 75, y - 75, 150, 150);  
    }
  
  void Sdraw(int x, int y, int[] gare) {
      fill(90); 
  }



void draw(int x, int y, int[] gare) {
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
        line(x, y + espace, x + 20, y + espace);
      }
      else if(gare[i] == 1){
        fill(170); 
        strokeWeight(1);
        rect(x - 75, y - 75, 130, 130);  
      }
    }
  }
  
  void plateformesDraw(int x, int y, int[] gare){
    int espace = 0;
    println(gare[1]);
    for(int i = 0; i < gare.length; i++){
      if(gare[i] == 0){
        strokeWeight(4);
        stroke(255);
        line(x, y + espace, x + 20, y + espace);
      }
      else if(gare[i] == 1){
        fill(170); 
        strokeWeight(1);
        rect(x, y + espace, 20, 5);
      }
      else if(gare[i] == 2){
        fill(160); 
        strokeWeight(1);
        rect(x, y + espace, 20, 5);
      }
      espace = espace + 36;
    }
  }


  int exitGare(int[] gare, int index){
    int res = 0;
    if(gare[index] != 0){
      if(gare[index] == 2){
        res = 2;
      }
      if(gare[index] == 1){
        res = 1;
      }
      gare[index] = 0;
    }
    return res;
  }


  void enterGare(int[] gare, int index, int train){
    if(gare[index] != 0){
      gare[index] = train;
    }
  }

}
