class Aiguillage{
  boolean[] P1A = new boolean[4];
  boolean[] P2A = new boolean[6];
  boolean[] P3A = new boolean[4];
  boolean[] S1A = new boolean[2];
  
  void modifyAiguillage(boolean[] aiguille, int index){
    if(aiguille[index] == true){aiguille[index] = false;}
    else if(aiguille[index] == false){aiguille[index] = true;}
  }
}
