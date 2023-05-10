public class Gare{
  int[] pgare1 = new int[4];
  int[] pgare2 = new int[4];
  int[] pgare3 = new int[4];
  int[] sgare = new int[2];
  
  int[] coordGare1 = {500, 100}; 
  int[] coordGare2 = {900, 400}; 
  int[] coordSGare = {500, 700}; 
  int[] coordGare3 = {100, 400};



void draw(int x, int y, int[] gare) {
    fill(150); 
    strokeWeight(1);
    rect(x - 75, y - 75, 150, 150);
    
    //rect(coordGare2[0] - 75, coordGare2[1] - 75, 150, 150);
    
    //rect(coordGare3[0] - 75, coordGare3[1] - 75, 150, 150);
    
    //fill(0); 
    //rect(coordSGare[0] - 50, coordSGare[1] - 50, 100, 100);
    
    /*
    strokeWeight(4);
    stroke(255);
    */

    /*
    // Gare 1
    line(coordGare1[0]-20, coordGare1[1]-50, coordGare1[0]+20, coordGare1[1]-50);
    line(coordGare1[0]-20, coordGare1[1]-20, coordGare1[0]+20, coordGare1[1]-20);
    line(coordGare1[0]-20, coordGare1[1]+20, coordGare1[0]+20, coordGare1[1]+20);
    line(coordGare1[0]-20, coordGare1[1]+50, coordGare1[0]+20, coordGare1[1]+50);
    */
    
    //plateformesDraw(x, y, gare);
    
    /*
    // Gare 2
    line(coordGare2[0]+20, coordGare2[1]-50, coordGare2[0]+60, coordGare2[1]-50);
    line(coordGare2[0]+20, coordGare2[1]-20, coordGare2[0]+60, coordGare2[1]-20);
    line(coordGare2[0]+20, coordGare2[1]+20, coordGare2[0]+60, coordGare2[1]+20);
    line(coordGare2[0]+20, coordGare2[1]+50, coordGare2[0]+60, coordGare2[1]+50);
    
    // Gare 3
    line(coordGare3[0]-60, coordGare3[1]-50, coordGare3[0]-20, coordGare3[1]-50);
    line(coordGare3[0]-60, coordGare3[1]-20, coordGare3[0]-20, coordGare3[1]-20);
    line(coordGare3[0]-60, coordGare3[1]+20, coordGare3[0]-20, coordGare3[1]+20);
    line(coordGare3[0]-60, coordGare3[1]+50, coordGare3[0]-20, coordGare3[1]+50);
    */
  
  }


void plateformesDraw(int x, int y, int[] gare){
  int espace = 0;
  for(int i = 0; i < gare.length; i++){
    strokeWeight(4);
    stroke(255);
    line(x, y + espace, x + 20, y + espace);
    espace = espace + 30;
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
