import java.awt.Graphics;
import java.awt.Image;

// Scratch Work
class Sprite {
  static Image im;
  int x_pos, y_pos;


  public void setImage(Image im) {
    this.im = im;
  }

  public void drawYourself(Graphics g) {
    g.drawImage(this.im, x_pos, y_pos, null);
  }

  // Not sure where this goes yet...
  boolean doesCollide(Sprite that) {}

}
