public class buttonG1{
  private float x;
  private float y;
  private float angle;
  boolean isPush;
  private int index;
  
  public buttonG1(float x, float y, int index) {
    this.x = x;
    this.y = y;
    isPush = false;
    this.index = index;
  }
  public void switch_(){
    isPush = !isPush;
  }
  

  public void draw() {
    pushMatrix();
    stroke(0);
    strokeWeight(1);
    if(isPush){
      pgare1[index] = 1;
    }
    
    isPush = false;
    fill(#EDF216);
    
    rect(x, y, 10, 10);
    popMatrix();
  }
  
}
public class buttonG2{
  private float x;
  private float y;
  private float angle;
  boolean isPush;
  private int index;
  
  public buttonG2(float x, float y, int index) {
    this.x = x;
    this.y = y;
    isPush = false;
    this.index = index;
    
  }
  public void switch_(){
    isPush = !isPush;
  }
  

  public void draw() {
    pushStyle();
    stroke(0);
    strokeWeight(1);
    if(isPush){
      pgare2[index] = 1;
    }
    isPush = false;
    fill(#EDF216);
    
    rect(x, y, 20, 10);
    popStyle();
  }
  
}
public class buttonG3{
  private float x;
  private float y;
  private float angle;
  boolean isPush;
  private int index;
  
  public buttonG3(float x, float y, int index) {
    this.x = x;
    this.y = y;
    isPush = false;
    this.index = index;
    
  }
  public void switch_(){
    isPush = !isPush;
  }
  

  public void draw() {
    pushStyle();
    stroke(0);
    strokeWeight(1);
    if(isPush){
      pgare3[index] = 1;
    }
    isPush = false;
    fill(#EDF216);
    
    rect(x, y, 10, 10);
    popStyle();
  }
  
}
  public class buttonSortie{
  private float x;
  private float y;
  private float angle;
  boolean isPush;
  private boolean stateTrain = false;
  private boolean stateTrain2 = false;
  private int index;
  private int test;
  
  public buttonSortie(float x, float y, int index) {
      this.x = x;
      this.y = y;
      isPush = false;
      this.index = index;
    }
      public void switch_(){
        isPush = !isPush;
      }
      
    
      public void draw() {
        pushStyle();
        stroke(0);
        strokeWeight(1);
        
        if(isPush){
          if(index == 0){
            if(aiguillages[0].versDroite && aiguillages[1].versDroite && pgare1[0] == 1){
              pgare1[0] = 0; 
              stateTrain = true;
            }else if(aiguillages[0].versDroite && aiguillages[1].versDroite == false && pgare1[1] == 1){
              pgare1[1] = 0;
              stateTrain = true;
            }else if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == true && pgare1[2] == 1){
              pgare1[2] = 0;
              stateTrain = true;
            }else if(aiguillages[0].versDroite == false && aiguillages[2].versDroite == false && pgare1[3] == 1){
              pgare1[3] = 0;
              stateTrain = true;
            }  
          } else if(index == 1){
              if(aiguillages[6].versDroite && aiguillages[7].versDroite && pgare2[3] == 1){
                pgare2[3] = 0; 
                stateTrain = true;
              }else if(aiguillages[6].versDroite && aiguillages[7].versDroite == false && pgare2[2] == 1){
                pgare2[2] = 0;
                stateTrain = true;
              }else if(aiguillages[6].versDroite == false && aiguillages[8].versDroite == true && pgare2[1] == 1){
                pgare2[1] = 0;
                stateTrain = true;
              }else if(aiguillages[6].versDroite == false && aiguillages[8].versDroite == false && pgare2[0] == 1){
                pgare2[0] = 0;
                stateTrain = true;
              }
          } else if(index == 2){
              if(aiguillages[3].versDroite && aiguillages[4].versDroite && pgare2[0] == 1){
                pgare2[0] = 0; 
                stateTrain = true;
              }else if(aiguillages[3].versDroite && aiguillages[4].versDroite == false && pgare2[1] == 1){
                pgare2[1] = 0;
                stateTrain = true;
              }else if(aiguillages[3].versDroite == false && aiguillages[5].versDroite == true && pgare2[2] == 1){
                pgare2[2] = 0;
                stateTrain = true;
              }else if(aiguillages[3].versDroite == false && aiguillages[5].versDroite == false && pgare2[3] == 1){
                pgare2[3] = 0;
                stateTrain = true;
              }
          } else if(index == 3){
              if(aiguillages[9].versDroite && aiguillages[10].versDroite && pgare3[3] == 1){
                pgare3[3] = 0; 
                stateTrain = true;
              }else if(aiguillages[9].versDroite && aiguillages[10].versDroite == false && pgare3[2] == 1){
                pgare3[2] = 0;
                stateTrain = true;
              }else if(aiguillages[9].versDroite == false && aiguillages[11].versDroite && pgare3[3] == 1){
                pgare3[3] = 0;
                stateTrain = true;
              }else if(aiguillages[9].versDroite == false && aiguillages[11].versDroite == false && pgare3[3] == 1){
                pgare3[3] = 0;
                stateTrain = true;
              }
          }
        }
        if(stateTrain && index == 0){
            P1ToS1[0] = 1;
            P1ToP2[0] = 1;
        } else if(stateTrain && index == 1){
            P1ToP2[1] = 1;
        } else if (stateTrain && index == 2){
            P2ToP3[0] = 1;
        } else if (stateTrain && index == 3){
            P2ToP3[1] = 1;
        }
        isPush = false;
        stateTrain = false;
        fill(#FFFFFF);
        
        rect(x, y, 30, 20);
        popStyle();
    }
  
  }
