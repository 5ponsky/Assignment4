import java.awt.Graphics;
import java.awt.Image;

// Scratch Work
abstract class Sprite {
  static Image im;
  int x_pos, y_pos;

  // Return true if the object is of type "Tube"
  abstract boolean isTube();

  // Update the various components and properties of the object
  asbsract void update();



  public void setImage(Image im) {
    this.im = im;
  }

  public void drawYourself(Graphics g) {
    g.drawImage(this.im, x_pos, y_pos, null);
  }

  // Not sure where this goes yet...
  boolean doesCollide(Sprite that) {}

}
