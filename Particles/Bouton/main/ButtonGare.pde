int longueur = 30;
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
        events.sortirGare1(0);
        events.sortirGare1(1);
        events.sortirGare1(2);
        events.sortirGare1(3);
        enter.feuxUpdateGare1();
      }
      else if(index == 1){
        events.sortirGare2Vers1(0);
        events.sortirGare2Vers1(1);
        events.sortirGare2Vers1(2);
        events.sortirGare2Vers1(3);
      } 
      else if(index == 2){
        events.sortirGare2Vers3(0);
        events.sortirGare2Vers3(1);
        events.sortirGare2Vers3(2);
        events.sortirGare2Vers3(3);
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
      else if(index == 9){
        tracks.moveTrain(P2ToP3);
      }
      else if(index == 10 || index == 11){
        tracks.moveTrain(S1ToP3);
      }
      else if(index == 12 || index == 13){
        tracks.moveTrain(P1ToS1);
      }
      else if(index == 14){
        events.sortirSGareVersGare1(0);
        events.sortirSGareVersGare1(1);
      }
      else if(index == 15){
        events.sortirSGareVersGare3(0);
        events.sortirSGareVersGare3(1);
      }

      else if(index==16){
        events.entreeGare1(0);
        events.entreeGare1(1);
        events.entreeGare1(2);
        events.entreeGare1(3);
      }
      else if(index==17){
        events.entreeGare1(0);
        events.entreeGare1(1);
        events.entreeGare1(2);
        events.entreeGare1(3);
      }

      else if(index == 18){
        events.entreeGare2Depuis1(0);
        events.entreeGare2Depuis1(1);
        events.entreeGare2Depuis1(2);
        events.entreeGare2Depuis1(3);
      }
      else if(index == 19){
        events.entreeGare2Depuis3(0);
        events.entreeGare2Depuis3(1);
        events.entreeGare2Depuis3(2);
        events.entreeGare2Depuis3(3);
      }
      else if (index == 20){
        events.entreeGare3(0, index);
        events.entreeGare3(1, index);
        events.entreeGare3(2, index);
        events.entreeGare3(3, index);
      }
      else if (index == 21){
        events.entreeGare3(0, index);
        events.entreeGare3(1, index);
        events.entreeGare3(2, index);
        events.entreeGare3(3, index);
      }
      else if (index == 22){
        events.entreeSGareDepuisG1(0);
        events.entreeSGareDepuisG1(1);
      } 
      else if (index == 23){
        events.entreeSGareDepuisG3(0);
        events.entreeSGareDepuisG3(1);
      }
      
      enter.feuxUpdateGare1();
      enter.feuxUpdateGare2();
      enter.feuxUpdateGare3();
      enter.feuxUpdateSGare();
      // Event pour bouton de rentrée de gare 
    }
    
      isPush = false;
      noStroke();
      if(texte == "Enter"){ longueur = 40; } else { longueur = 30; } 
      
      if(overStation(x, y, longueur, 20)){
        fill(#FFFFFF,150);
      }else{
        fill(#FFFFFF, 255);
      }
      
      
      textAlign(CENTER, CENTER);
      textSize(15);
      rect(x, y, longueur, 20);
      fill(0);
      
      if(texte == "Enter"){
        text(texte, x+20, y+8);
      }else{
        text(texte, x+17, y+8);
      }
      
      popStyle();
  }  
}
