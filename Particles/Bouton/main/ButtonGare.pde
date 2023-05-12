public class buttonG1{
  private float x;
  private float y;
  private float angle;
  boolean isPush;
  private int index;
  private int state;
  
  public buttonG1(float x, float y, int index) {
    this.x = x;
    this.y = y;
    isPush = false;
    this.index = index;
    state = 0;
    
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
  private int state;
  
  public buttonG2(float x, float y, int index) {
    this.x = x;
    this.y = y;
    isPush = false;
    this.index = index;
    state = 0;
    
  }
  public void switch_(){
    isPush = !isPush;
  }
  

  public void draw() {
    pushStyle();
    stroke(0);
    strokeWeight(1);
    if(isPush){
      state = 1;
    }
    pgare2[index] = state; 
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
  private int state;
  
  public buttonG3(float x, float y, int index) {
    this.x = x;
    this.y = y;
    isPush = false;
    this.index = index;
    state = 0;
    
  }
  public void switch_(){
    isPush = !isPush;
  }
  

  public void draw() {
    pushStyle();
    stroke(0);
    strokeWeight(1);
    if(isPush){
      state = 1;
      System.out.println(rectOver);

    }
    pgare3[index] = state; 
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
  private int index;
  private int state;
  public buttonSortie(float x, float y, int index) {
      this.x = x;
      this.y = y;
      isPush = true;
      this.index = index;
      state = 1;
      
    }
      public void switch_(){
        isPush = !isPush;
      }
      
    
      public void draw() {
        pushStyle();
        stroke(0);
        strokeWeight(1);
        if(isPush){
          pgare1[index] = 0; 
        }
        isPush = false;
        fill(#FFFFFF);
        
        rect(x, y, 30, 20);
        popStyle();
    }
  
  }
