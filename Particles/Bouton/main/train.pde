public class train{
    private float train_x;
    private float train_y;
    private float train_angle;
    private float target_x;
    private float target_y;
    private float target_angle;

    train(float pos_x, float pos_y, float pos_angle){
        train_x = pos_x;
        train_y = pos_y;
        train_angle = pos_angle;
    }


    public float getx() {
    return this.train_x;
  }
  
  public float gety() {
    return this.train_y;
  }

  public float getangle(){
    return this.train_angle;
  }
}
