


class Track {

  void draw() {
    stroke(255); 
    strokeWeight(4); 

    line(coordGare2[0]+75, coordGare2[1], coordGare3[0]-75, coordGare3[1]);
    line(coordGare2[0]-75, coordGare2[1], coordGare1[0]+75, coordGare1[1]);
    line(coordSGare[0]-50, coordSGare[1], coordGare1[0]+75, coordGare1[1]);
    line(coordGare3[0]-75, coordGare3[1], coordSGare[0], coordSGare[1]+50);
    
    dessinTrain(coordGare2[0]-75+130, coordGare2[1]-75+65, coordGare3[0]-75, coordGare3[1]-75+65, P2ToP3,true); // /
    dessinTrain(coordGare1[0]-75+130, coordGare1[1]-75+65, coordGare2[0]-75, coordGare2[1]-75+65, P1ToP2,false);// \
    dessinTrain(coordGare1[0]-75+130, coordGare1[1]-75+65, coordSGare[0]-75, coordSGare[1]-75+65, P1ToS1,true); // /
    dessinTrain(coordSGare[0]-75+130, coordSGare[1]-75+65, coordGare3[0]-75, coordGare3[1]-75+65, S1ToP3,false);// \
    
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
  
  void dessinTrain(int x1, int y1, int x2, int y2, int[] voie, boolean angle){
    int tx = 0;
    int ty = 0;
    for(int i = 0; i < 2; i++){
      if(i == 0){
        tx = x1;
        ty = y1;
      }
      if(i == 1){
        tx = x1 + (x2 - x1)/2;
        ty = y1 + (y2 - y1)/2;
      }
      pushStyle();
      strokeWeight(4);
      if (voie[i] == 1 || voie[i] == 2) {
        if (angle==true) {
          
          pushMatrix();
          translate(tx, ty);
          rotate(radians(48));
            
          if(voie[i] == 2){
            stroke(#9E3939);
            fill(#712929);
          }
          else{
            stroke(#CFD83C);
            fill(#767B23);
          }
          rect(0, 0, 100, 20);
          popMatrix();
      }else {
        if(voie[i] == 2){
            stroke(#9E3939);
            fill(#712929);
          }
          else{
            stroke(#CFD83C);
            fill(#767B23);
          }
          pushMatrix();
          translate(tx, ty);
          rotate(radians(-48));
          rect(0, 0, 100, 20);
          popMatrix();
          
        }
        
      }
      popStyle();
    }
  }
}
