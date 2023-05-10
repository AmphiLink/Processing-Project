class Track {
  Gare gare = new Gare();

  int[] P1ToP2 = new int[2];
  int[] P2ToP3 = new int[2];
  int[] P1ToS1 = new int[2];
  int[] S1ToP3 = new int[2];

  void draw() {
    stroke(255); 
    strokeWeight(4); 

    line(gare.coordGare1[0]+75, gare.coordGare1[1], gare.coordGare2[0], gare.coordGare2[1]-75);
    line(gare.coordGare1[0]-75, gare.coordGare1[1], gare.coordGare3[0], gare.coordGare3[1]-75);
    line(gare.coordSGare[0]-50, gare.coordSGare[1], gare.coordGare3[0], gare.coordGare3[1]+75);
    line(gare.coordGare2[0]+75, gare.coordGare2[1], gare.coordSGare[0], gare.coordSGare[1]+50);
  }
}
