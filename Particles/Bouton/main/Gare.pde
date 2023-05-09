class Gare{
  int[] pgare1 = new int[4];
  int[] pgare2 = new int[4];
  int[] pgare3 = new int[4];
  int[] sgare = new int[2];

  int[] coordGare1 = {400, 100}; 
  int[] coordGare2 = {550, 400}; 
  int[] coordGare3 = {400, 700}; 
  int[] coordSGare = {250, 400};





void draw() {
    fill(255, 0, 0); // rouge
    buttonlight(coordGare1[0],coordGare1[1],50);
    
    fill(0, 255, 0); // vert
    buttonlight(coordGare2[0],coordGare2[1],50);
    
    fill(0, 0, 255); // bleu
    buttonlight(coordGare3[0],coordGare3[1],50);
    
    fill(255); // blanc
    buttonTurnout(coordSGare[0],coordSGare[1],25);
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
