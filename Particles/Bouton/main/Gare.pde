class Gare{
  int[] pgare1 = new int[4];
  int[] pgare2 = new int[4];
  int[] pgare3 = new int[4];
  int[] sgare = new int[2];

  int[] coordGare1 = {500, 100}; 
  int[] coordGare2 = {900, 400}; 
  int[] coordSGare = {500, 700}; 
  int[] coordGare3 = {100, 400};




void draw() {
    fill(150); 
    strokeWeight(1);
    rect(coordGare1[0] - 75, coordGare1[1] - 75, 150, 150);
    
    rect(coordGare2[0] - 75, coordGare2[1] - 75, 150, 150);
    
    rect(coordGare3[0] - 75, coordGare3[1] - 75, 150, 150);
    
    fill(0); 
    rect(coordSGare[0] - 50, coordSGare[1] - 50, 100, 100);
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
