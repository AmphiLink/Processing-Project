class Track {
  Gare gare = new Gare();

  int[] P1ToP2 = new int[2];
  int[] P2ToP3 = new int[2];
  int[] P1ToS1 = new int[2];
  int[] S1ToP3 = new int[2];

  void draw() {
    stroke(255); 
    strokeWeight(4); 

    line(coordGare1[0]+75, coordGare1[1], coordGare2[0]-75, coordGare2[1]);
    line(coordGare1[0]-75, coordGare1[1], coordGare3[0]+75, coordGare3[1]);
    line(coordSGare[0]-50, coordSGare[1], coordGare3[0]+75, coordGare3[1]);
    line(coordGare2[0]-75, coordGare2[1], coordSGare[0], coordSGare[1]+50);
  }
  
  void moveTrain(int[] track){
    if(track[0] == 1 && track[1] == 0){
      track[0] = 0;
      track[1] = 1;
    }
    else if(track[0] == 0 && track[1] == 2){
      track[0] = 2;
      track[1] = 0;
    }
  }
}
