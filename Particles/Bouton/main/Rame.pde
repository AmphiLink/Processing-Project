class Events{
  void sortirGare1(int index){
    switch(index){
      case 0:
      if(aiguillages[0].versDroite == true && aiguillages[1].versDroite == true && feux[19].estVert == true){gares.exitGare(pgare1, index);}
      case 1:
      if(aiguillages[0].versDroite == true && aiguillages[1].versDroite == false && feux[19].estVert == true){gares.exitGare(pgare1, index);}
      case 2:
      if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == true && feux[19].estVert == true){gares.exitGare(pgare1, index);}
      case 3:
      if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == false && feux[19].estVert == true){gares.exitGare(pgare1, index);}
    }
  }
  void entreeGare1(int index){
    if(P1ToP2[0] == 2 || P1ToS1[0] == 2){
      switch(index){
        case 0:
        if(aiguillages[0].versDroite == true && aiguillages[1].versDroite == true && feux[15].estVert == true){gares.enterGare(pgare1, index, 1);}
        case 1:
        if(aiguillages[0].versDroite == true && aiguillages[1].versDroite == false && feux[16].estVert == true){gares.enterGare(pgare1, index, 1);}
        case 2:
        if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == true && feux[17].estVert == true){gares.enterGare(pgare1, index, 1);}
        case 3:
        if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == false && feux[18].estVert == true){gares.enterGare(pgare1, index, 1);}
      }
    }
  }
  
  // destination = 1 pour aller à gare 1 et 3 pour aller à gare 3  
  void sortirGare2(int index, int destination){
    switch(destination){
      case 3:
      switch(index){
        case 0:
        if(aiguillages[3].versDroite == true && aiguillages[4].versDroite == true && feux[9].estVert == true){gares.exitGare(pgare2, index);}
        case 1:
        if(aiguillages[3].versDroite == true && aiguillages[4].versDroite == false && feux[9].estVert == true){gares.exitGare(pgare2, index);}
        case 2:
        if(aiguillages[3].versDroite == false && aiguillages[5].versDroite == true && feux[9].estVert == true){gares.exitGare(pgare2, index);}
        case 3:
        if(aiguillages[3].versDroite == false && aiguillages[5].versDroite == false && feux[9].estVert == true){gares.exitGare(pgare2, index);}
      }
      case 1:
      switch(index){
        case 0:
        if(aiguillages[6].versDroite == false && aiguillages[7].versDroite == false && feux[8].estVert == true){gares.exitGare(pgare2, index);}
        case 1:
        if(aiguillages[6].versDroite == false && aiguillages[7].versDroite == true && feux[8].estVert == true){gares.exitGare(pgare2, index);}
        case 2:
        if(aiguillages[6].versDroite == true && aiguillages[8].versDroite == false && feux[8].estVert == true){gares.exitGare(pgare2, index);}
        case 3:
        if(aiguillages[6].versDroite == true && aiguillages[8].versDroite == true && feux[8].estVert == true){gares.exitGare(pgare2, index);}
      }
    }
  }
    void entreeGare2(int index, int origine){
    switch(origine){
      case 3:
      if(P1ToP2[1] == 1){
        switch(index){
          case 0:
          if(aiguillages[3].versDroite == true && aiguillages[4].versDroite == true && feux[1].estVert == true){gares.enterGare(pgare2, index, 2);}
          case 1:
          if(aiguillages[3].versDroite == true && aiguillages[4].versDroite == false && feux[3].estVert == true){gares.enterGare(pgare2, index, 2);}
          case 2:
          if(aiguillages[3].versDroite == false && aiguillages[5].versDroite == true && feux[5].estVert == true){gares.enterGare(pgare2, index, 2);}
          case 3:
          if(aiguillages[3].versDroite == false && aiguillages[5].versDroite == false && feux[7].estVert == true){gares.enterGare(pgare2, index, 2);}
        }
      }
      case 1:
      if(P2ToP3[0] == 2){
        switch(index){
          case 0:
          if(aiguillages[6].versDroite == false && aiguillages[7].versDroite == false && feux[0].estVert == true){gares.enterGare(pgare2, index, 1);}
          case 1:
          if(aiguillages[6].versDroite == false && aiguillages[7].versDroite == true && feux[2].estVert == true){gares.enterGare(pgare2, index, 1);}
          case 2:
          if(aiguillages[6].versDroite == true && aiguillages[8].versDroite == false && feux[4].estVert == true){gares.enterGare(pgare2, index, 1);}
          case 3:
          if(aiguillages[6].versDroite == true && aiguillages[8].versDroite == true && feux[6].estVert == true){gares.enterGare(pgare2, index, 1);}
        }
      }
    }
  }
  
  void sortirGare3(int index){
    switch(index){
        case 0:
        if(aiguillages[9].versDroite == false && aiguillages[10].versDroite == false && feux[14].estVert == true){gares.exitGare(pgare3, index);}
        case 1:
        if(aiguillages[9].versDroite == false && aiguillages[10].versDroite == true && feux[14].estVert == true){gares.exitGare(pgare3, index);}
        case 2:
        if(aiguillages[9].versDroite == true && aiguillages[11].versDroite == false && feux[14].estVert == true){gares.exitGare(pgare3, index);}
        case 3:
        if(aiguillages[9].versDroite == true && aiguillages[11].versDroite == true && feux[14].estVert == true){gares.exitGare(pgare3, index);}
    }
  }
  void entreeGare3(int index){
    if(P2ToP3[1] == 1 || S1ToP3[1] == 1){
      switch(index){
          case 0:
          if(aiguillages[9].versDroite == false && aiguillages[10].versDroite == false && feux[10].estVert == true){gares.enterGare(pgare3, index, 2);}
          case 1:
          if(aiguillages[9].versDroite == false && aiguillages[10].versDroite == true && feux[11].estVert == true){gares.enterGare(pgare3, index, 2);}
          case 2:
          if(aiguillages[9].versDroite == true && aiguillages[11].versDroite == false && feux[12].estVert == true){gares.enterGare(pgare3, index, 2);}
          case 3:
          if(aiguillages[9].versDroite == true && aiguillages[11].versDroite == true && feux[13].estVert == true){gares.enterGare(pgare3, index, 2);}
      }
    }
  }
  
  void sortirSGare(int index, int destination){
    switch(destination){
      case 1:
      switch(index){
        case 0:
        if(aiguillages[12].versDroite == false && feux[24].estVert == true){gares.exitGare(pgare2, index);} 
        case 1:
        if(aiguillages[12].versDroite == true && feux[24].estVert == true){gares.exitGare(pgare2, index);}
      }
      case 3:
      switch(index){
        case 0:
        if(aiguillages[13].versDroite == true && feux[25].estVert == true){gares.exitGare(pgare2, index);}
        case 1:
        if(aiguillages[13].versDroite == false && feux[25].estVert == true){gares.exitGare(pgare2, index);}
      }
    }
  }
  void entreeSGare(int index, int destination){
    switch(destination){
      case 1:
      if(P1ToS1[1] == 1){
        switch(index){
          case 0:
          if(aiguillages[12].versDroite == false && feux[20].estVert == true){gares.enterGare(pgare2, index, 1);} 
          case 1:
          if(aiguillages[12].versDroite == true && feux[22].estVert == true){gares.enterGare(pgare2, index, 1);}
        }
      }
      case 3:
      if(S1ToP3[0] == 2){
        switch(index){
          case 0:
          if(aiguillages[13].versDroite == true && feux[21].estVert == true){gares.enterGare(pgare2, index, 2);}
          case 1:
          if(aiguillages[13].versDroite == false && feux[23].estVert == true){gares.enterGare(pgare2, index, 2);}
        }
      }
    }
  }
}
