class Entree{
  void feuxUpdateGare1(){
    //int index = 0;
    for(int i = 15; i <= 18; i++){
      if(pgare1[i - 15] != 0){feux[i].estVert = false;}
      else{feux[i].estVert = true;}
    }
  }
  void feuxUpdateGare2(){
    int index = 0;
    for(int i = 0; i <= 7; i+=2){
      if(pgare2[index] != 0){
        feux[i].estVert = false;
        feux[i + 1].estVert = false;
      }
      else{
        feux[i].estVert = true;
        feux[i + 1].estVert = true;
      }
      index += 1;
    }
  }
  void feuxUpdateGare3(){
    //int index = 0;
    for(int i = 10; i <= 13; i++){
      if(pgare3[i - 10] != 0){feux[i].estVert = false;}
      else{feux[i].estVert = true;}
    }
  }
  void feuxUpdateSGare(){
    int index = 0;
    for(int i = 20; i <= 23; i+=2){
      if(sgare[index] != 0){
        feux[i].estVert = false;
        feux[i + 1].estVert = false;
      }
      else{
        feux[i].estVert = true;
        feux[i + 1].estVert = true;
      }
      index += 1;
    }
  }
  
  void gare1sortie(){
    if(P1ToP2[0] != 0 || P1ToP2[1] != 0){
      feux[19].estVert = false;
    }
    else{
      if(pgare2[0] == 0 || pgare2[1] == 0 || pgare2[2] == 0 || pgare2[3] == 0){
        feux[19].estVert = true;
      }
      else{
        feux[19].estVert = false;
      }
    }
  }
  
  void gare3sortie(){
    if(S1ToP3[0] != 0 || S1ToP3[1] != 0){
      feux[14].estVert = false;
    }
    else{
      if(sgare[0] == 0 || sgare[1] == 0){
        feux[14].estVert = true;
      }
      else{
        feux[14].estVert = false;
      }
    }
  }
  
  void gare2sortieG(){
    if(P1ToP2[0] != 0 || P1ToP2[1] != 0){
      feux[8].estVert = false;
    }
    else{
      if(pgare1[0] == 0 || pgare1[1] == 0 || pgare1[2] == 0 || pgare1[3] == 0){
        feux[8].estVert = true;
      }
      else{
        feux[8].estVert = false;
      }
    }
  }
  
  void gare2sortieD(){
    if(P2ToP3[0] != 0 || P2ToP3[1] != 0){
      feux[9].estVert = false;
    }
    else{
      if(pgare3[0] == 0 || pgare3[1] == 0 || pgare3[2] == 0 || pgare3[3] == 0){
        feux[9].estVert = true;
      }
      else{
        feux[9].estVert = false;
      }
    }
  }
  
  void sgaresortieG(){
    if(P1ToS1[0] != 0 || P1ToS1[1] != 0){
      feux[24].estVert = false;
    }
    else{
      if(pgare1[0] == 0 || pgare1[1] == 0 || pgare1[2] == 0 || pgare1[3] == 0){
        feux[24].estVert = true;
      }
      else{
        feux[24].estVert = false;
      }
    }
  }
  
  void sgaresortieD(){
    if(S1ToP3[0] != 0 || S1ToP3[1] != 0){
      feux[25].estVert = false;
    }
    else{
      if(pgare3[0] == 0 || pgare3[1] == 0 || pgare3[2] == 0 || pgare3[3] == 0){
        feux[25].estVert = true;
      }
      else{
        feux[25].estVert = false;
      }
    }
  }
}
