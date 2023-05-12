class Entree{
  void feuxUpdateGare1(){
    //int index = 0;
    for(int i = 15; i <= 18; i++){
      if(pgare1[i - 15] != 0){feux[i].estVert = false;}
    }
  }
  void feuxUpdateGare2(){
    int index = 0;
    for(int i = 0; i <= 7; i+=2){
      if(pgare2[index] != 0){
        feux[i].estVert = false;
        feux[i + 1].estVert = false;
      }
      index += 1;
    }
  }
  void feuxUpdateGare3(){
    //int index = 0;
    for(int i = 10; i <= 13; i++){
      if(pgare3[i - 10] != 0){feux[i].estVert = false;}
    }
  }
  void feuxUpdateSGare(){
    int index = 0;
    for(int i = 20; i <= 23; i+=2){
      if(sgare[index] != 0){
        feux[i].estVert = false;
        feux[i + 1].estVert = false;
      }
      index += 1;
    }
  }
}
