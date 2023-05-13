class Events{
  void sortirGare1(int index){
    switch(index){
      case 0:
      if(aiguillages[0].versDroite == true && aiguillages[1].versDroite == true && feux[19].estVert == true && pgare1[0] == 1){pgare1[0] =0;P1ToP2[0] = 1;}
      case 1:
      if(aiguillages[0].versDroite == true && aiguillages[1].versDroite == false && feux[19].estVert == true && pgare1[1] == 1){pgare1[1] =0;P1ToP2[0]= 1;}
      case 2:
      if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == true && feux[19].estVert == true && pgare1[2] == 1){pgare1[2] =0;P1ToP2[0]= 1;}
      case 3:
      if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == false && feux[19].estVert == true && pgare1[3] == 1){pgare1[3] =0;P1ToP2[0]= 1;}
    }
  }
  void entreeGare1(int index){
    if(P1ToP2[0] == 2){
      switch(index){
        case 0:
        if(aiguillages[0].versDroite == true && aiguillages[1].versDroite == true && feux[15].estVert == true){P1ToP2[0] = 0; pgare1[0]=1;}
        case 1:
        if(aiguillages[0].versDroite == true && aiguillages[1].versDroite == false && feux[16].estVert == true ){P1ToP2[0] = 0; pgare1[1]=1;}
        case 2:
        if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == true && feux[17].estVert == true){P1ToP2[0] = 0; pgare1[2]=1;}
        case 3:
        if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == false && feux[18].estVert == true){P1ToP2[0] = 0; pgare1[3]=1;}
      }
    } else if (P1ToS1[0] == 2){
      switch(index){
        case 0:
        if(aiguillages[0].versDroite == true && aiguillages[1].versDroite == true && feux[15].estVert == true){P1ToS1[0] = 0; pgare1[0]=1;}
        case 1:
        if(aiguillages[0].versDroite == true && aiguillages[1].versDroite == false && feux[16].estVert == true ){P1ToS1[0] = 0; pgare1[1]=1;}
        case 2:
        if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == true && feux[17].estVert == true){P1ToS1[0] = 0; pgare1[2]=1;}
        case 3:
        if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == false && feux[18].estVert == true){P1ToS1[0] = 0; pgare1[3]=1;}
      }
    }
  }
  
  // destination = 1 pour aller à gare 1 et 3 pour aller à gare 3  
  void sortirGare2Vers3(int index){
      switch(index){
        case 0:
        if(aiguillages[3].versDroite == true && aiguillages[4].versDroite == true && feux[9].estVert == true && pgare2[0] == 1){pgare2[0] = 0;P2ToP3[0] =1;}
        case 1:
        if(aiguillages[3].versDroite == true && aiguillages[4].versDroite == false && feux[9].estVert == true && pgare2[1] == 1){pgare2[1] = 0;P2ToP3[0] =1;}
        case 2:
        if(aiguillages[3].versDroite == false && aiguillages[5].versDroite == true && feux[9].estVert == true && pgare2[2] == 1){pgare2[2] = 0;P2ToP3[0] =1;}
        case 3:
        if(aiguillages[3].versDroite == false && aiguillages[5].versDroite == false && feux[9].estVert == true && pgare2[3] == 1){pgare2[3] = 0;P2ToP3[0] =1;}
      }
  }
  void sortirGare2Vers1(int index){
      switch(index){
        case 0:
        if(aiguillages[6].versDroite == false && aiguillages[7].versDroite == false && feux[8].estVert == true && pgare2[0] == 2 ){pgare2[0] = 0;P1ToP2[1] =2;}
        case 1:
        if(aiguillages[6].versDroite == false && aiguillages[7].versDroite == true && feux[8].estVert == true && pgare2[1] == 2){pgare2[1] = 0;P1ToP2[1] =2;}
        case 2:
        if(aiguillages[6].versDroite == true && aiguillages[8].versDroite == false && feux[8].estVert == true && pgare2[2] == 2){pgare2[2] = 0;P1ToP2[1] =2;}
        case 3:
        if(aiguillages[6].versDroite == true && aiguillages[8].versDroite == true && feux[8].estVert == true && pgare2[3] == 2){pgare2[3] = 0;P1ToP2[1] =2;}
      }
    }
  
    
  void entreeGare2Depuis1(int index){
    if(P1ToP2[1]==1){
        switch(index){
          case 0:
          if(aiguillages[6].versDroite == true && aiguillages[8].versDroite == true && feux[7].estVert == true  && pgare2[3]==0 ){pgare2[3]=1;P1ToP2[1] =0;} // fonctionne 
          case 1:
          if(aiguillages[6].versDroite == true && aiguillages[8].versDroite == false && feux[5].estVert == true  && pgare2[2]==0){pgare2[2]=1;P1ToP2[1] =0;}
          case 2:
          if(aiguillages[6].versDroite == false && aiguillages[7].versDroite == true && feux[3].estVert == true && pgare2[1]==0){pgare2[1]=1;P1ToP2[1] =0;} // fonctionne 
          case 3:
          if(aiguillages[6].versDroite == false && aiguillages[7].versDroite == false && feux[1].estVert == true  && pgare2[0]==0){pgare2[0]=1;P1ToP2[1] =0;}
        }
    }
  }
  void entreeGare2Depuis3(int index){
    if(P2ToP3[0]==1){
        switch(index){
          case 0:
          if(aiguillages[3].versDroite == true && aiguillages[4].versDroite == true && feux[7].estVert == true  && pgare2[0]==0 ){pgare2[0]=1;P2ToP3[0] =0;} // fonctionne 
          case 1:
          if(aiguillages[3].versDroite == true && aiguillages[4].versDroite == false && feux[5].estVert == true  && pgare2[1]==0){pgare2[1]=1;P2ToP3[0] =0;}
          case 2:
          if(aiguillages[3].versDroite == false && aiguillages[5].versDroite == true && feux[3].estVert == true && pgare2[2]==0){pgare2[2]=1;P2ToP3[0] =0;} // fonctionne 
          case 3:
          if(aiguillages[3].versDroite == false && aiguillages[5].versDroite == false && feux[1].estVert == true  && pgare2[3]==0){pgare2[3]=1;P2ToP3[0] =0;}
        }
    }
  }
  
  void sortirGare3(int index){
    switch(index){
        case 0:
        if(aiguillages[9].versDroite == false && aiguillages[10].versDroite == false && feux[14].estVert == true && pgare3[0] == 1 && S1ToP3[1] == 0 ){pgare3[0] = 0;S1ToP3[1]=2;}
        case 1:
        if(aiguillages[9].versDroite == false && aiguillages[10].versDroite == true && feux[14].estVert == true && pgare3[1] == 1 && S1ToP3[1] == 0){pgare3[1] = 0;S1ToP3[1]=2;}
        case 2:
        if(aiguillages[9].versDroite == true && aiguillages[11].versDroite == false && feux[14].estVert == true && pgare3[2] == 1 && S1ToP3[1] == 0){pgare3[2] = 0;S1ToP3[1]=2;}
        case 3:
        if(aiguillages[9].versDroite == true && aiguillages[11].versDroite == true && feux[14].estVert == true && pgare3[3] == 1 && S1ToP3[1] == 0){pgare3[3] = 0;S1ToP3[1]=2;}
    }
  }

  void entreeGare3(int index, int i){
    if((P2ToP3[1] == 1 && i == 20 &&  S1ToP3[1] != 1)){
      switch(index){
          case 0:
          if(aiguillages[9].versDroite == false && aiguillages[10].versDroite == false && feux[10].estVert == true){P2ToP3[1]=0;pgare3[0] = 1;}
          case 1:
          if(aiguillages[9].versDroite == false && aiguillages[10].versDroite == true && feux[11].estVert == true){P2ToP3[1]=0;pgare3[1] = 1;}
          case 2:
          if(aiguillages[9].versDroite == true && aiguillages[11].versDroite == false && feux[12].estVert == true){P2ToP3[1]=0;pgare3[2] = 1;}
          case 3:
          if(aiguillages[9].versDroite == true && aiguillages[11].versDroite == true && feux[13].estVert == true){P2ToP3[1]=0;pgare3[3] = 1;}
        } 
      }else if (S1ToP3[1] == 1 && i == 21){
      switch(index){
          case 0:
          if(aiguillages[9].versDroite == false && aiguillages[10].versDroite == false && feux[10].estVert == true){S1ToP3[1]=0;pgare3[0] = 1;}
          case 1:
          if(aiguillages[9].versDroite == false && aiguillages[10].versDroite == true && feux[11].estVert == true){S1ToP3[1]=0;pgare3[1] = 1;}
          case 2:
          if(aiguillages[9].versDroite == true && aiguillages[11].versDroite == false && feux[12].estVert == true){S1ToP3[1]=0;pgare3[2] = 1;}
          case 3:
          if(aiguillages[9].versDroite == true && aiguillages[11].versDroite == true && feux[13].estVert == true){S1ToP3[1]=0;pgare3[3] = 1;}
      }
    }
  }
  
  // 1 vers gare 1 / 3 vers gare 3 
  void sortirSGareVersGare1(int index){
      switch(index){
        case 0:
        if(aiguillages[12].versDroite == false && feux[24].estVert == true && sgare[0] == 1){sgare[0] = 0;P1ToS1[1]=2;System.out.println("Hola mundo");} 
        case 1:
        if(aiguillages[12].versDroite == true && feux[24].estVert == true && sgare[1] == 1){sgare[1] = 0;P1ToS1[1]=2;}
      }
  }
  void sortirSGareVersGare3(int index){
      switch(index){
        case 0:
        if(aiguillages[13].versDroite == true && feux[25].estVert == true && sgare[0] == 1){sgare[0] = 0;S1ToP3[0]=1;}
        case 1:
        if(aiguillages[13].versDroite == false && feux[25].estVert == true && sgare[1] == 1){sgare[1] = 0;S1ToP3[0]=1;}
      }
    }

  void entreeSGareDepuisG1(int index){
      if(P1ToS1[1] == 1){
        switch(index){
          case 0:
          if(aiguillages[12].versDroite == false && feux[20].estVert == true){P1ToS1[1]=0;sgare[0]=1;} 
          case 1:
          if(aiguillages[12].versDroite == true && feux[22].estVert == true){P1ToS1[1]=0;sgare[1]=1;}
        }
      } 
  }
  void entreeSGareDepuisG3(int index){
      if(S1ToP3[0] == 2){
        switch(index){
          case 0:
          if(aiguillages[13].versDroite == true && feux[21].estVert == true){S1ToP3[0]=0;sgare[0]=1;} 
          case 1:
          if(aiguillages[13].versDroite == false && feux[23].estVert == true){S1ToP3[0]=0;sgare[1]=1;}
        }
      } 
  }
}
