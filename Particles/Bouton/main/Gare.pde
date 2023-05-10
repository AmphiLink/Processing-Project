public class Gare{
  /*
  int[] pgare1 = new int[4];
  int[] pgare2 = new int[4];
  int[] pgare3 = new int[4];
  int[] sgare = new int[2];
  */
  
  int[] pgare1 = {1, 0, 1, 0};
  int[] pgare2 = {0, 0, 1, 0};
  int[] pgare3 = {2, 0, 2, 0};
  int[] sgare = {0, 0, 0, 0};
  
  int[] coordGare1 = {500, 100}; 
  int[] coordGare2 = {900, 400}; 
  int[] coordSGare = {500, 700}; 
  int[] coordGare3 = {100, 400};



void draw(int x, int y, int[] gare) {
    fill(150); 
    strokeWeight(1);
    rect(x - 75, y - 75, 150, 150);  
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
