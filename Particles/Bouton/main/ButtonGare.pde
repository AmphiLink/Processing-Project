public class buttonG1{
  private float x;
  private float y;
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
  public class buttonMouvement{
  
  private float x;
  private float y;
  boolean isPush;
  private int index;
  private String texte;
  
  public buttonMouvement(float x, float y, int index, String texte) {
      this.x = x;
      this.y = y;
      isPush = false;
      this.index = index;
      this.texte = texte;
    }
      public void switch_(){
        isPush = !isPush;
      }
      
    


      public void draw() {
        pushStyle();
        stroke(0);
        strokeWeight(1);
      
        if(isPush){
          // Event pour bouton de sortie de gare 
          if(index == 0){
            for (int i = 0;i<=3; i++){
            events.sortirGare1(i);}
             }
          else if(index == 1){
            events.sortirGare2(0,1);
            events.sortirGare2(1,1);
            events.sortirGare2(2,1);
            events.sortirGare2(3,1);
          } 
          else if(index == 2){
            events.sortirGare2(0,3);
            events.sortirGare2(1,3);
            events.sortirGare2(2,3);
            events.sortirGare2(3,3);
          } 
          else if(index == 3){
            events.sortirGare3(0);
            events.sortirGare3(1);
            events.sortirGare3(2);
            events.sortirGare3(3);
          } 
          else if(index == 4){
            tracks.moveTrain(P1ToP2);
          }
          else if(index == 5){
            tracks.moveTrain(P1ToP2);
          }
          else if(index == 8){
            tracks.moveTrain(P2ToP3);
          }
          else if(index == 9){
            tracks.moveTrain(P2ToP3);
          }


        }



        // Event pour bouton de rentrée de gare 



        isPush = false;
        fill(#FFFFFF);
        rect(x, y, 30, 20);
        fill(0);
        textAlign(CENTER, CENTER);
        textSize(15);
        text(texte, x+14, y+10);
        popStyle();
    }

  
  }
  