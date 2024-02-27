import processing.core.PApplet;

public class Sketch extends PApplet {
	
	// Size reference, change to configure screen size
  int intSize = 400;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// Size call
    size(intSize, intSize);
  }

  /** 
   * Background items
   */
  public void setup() {
    background(255, 0, 0);

    // background circles
    stroke(255, 72, 0);
    fill(255, 72, 0);
    ellipse(intSize/40, intSize/10, intSize/20, intSize/20);
    ellipse(3*intSize/4, 7*intSize/8, intSize/8, intSize/8);
    ellipse(intSize/10, 69*intSize/80, intSize/20, intSize/20);
    ellipse(71*intSize/80, 3*intSize/8, 7*intSize/40, 7*intSize/40);
    ellipse(intSize/4, 0, 9*intSize/40, 9*intSize/40);
    ellipse(intSize/20, 49*intSize/80, intSize/10, intSize/10);
    ellipse(39*intSize/40, 3*intSize/40, 7*intSize/40, 7*intSize/40);
    ellipse(intSize/2, 19*intSize/20, 3*intSize/40, 3*intSize/40);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Stroke reset
    stroke(0);

	  // Rectangle
    fill(71, 209, 117);
    rect(intSize/8, intSize/8, 3*intSize/4, 3*intSize/4);

    // Tears
    stroke(0, 140, 255);
    strokeWeight(intSize/40);
    line(3*intSize/10, 7*intSize/10, 3*intSize/10, 3*intSize/4);
    line(11*intSize/16, 11*intSize/16, 11*intSize/16, 17*intSize/20);

    // Stroke reset
    stroke(0);
    strokeWeight(1);

    // Rectangle eyes whites
    fill(255);
    ellipse(5*intSize/16, 11*intSize/16, 3*intSize/20, intSize/20);
    ellipse(11*intSize/16, 11*intSize/16, intSize/10, 3*intSize/20);

    // Pupils
    fill(0);
    ellipse(3*intSize/10, 7*intSize/10, 3*intSize/40, intSize/40);
    ellipse(7*intSize/10, 13*intSize/20, intSize/20, intSize/20);

    // Mouth
    strokeWeight(10);
    line(5*intSize/16, 4*intSize/5, 13*intSize/20, 4*intSize/5);

    // Reset stroke weight
    strokeWeight(1);

    // largest circle
    fill(73, 201, 143);
    ellipse(7*intSize/16, 7*intSize/16, 7*intSize/16, 7*intSize/16);

    // largest circle eyes
    fill(0);
    ellipse(7*intSize/20, 7*intSize/20, intSize/40, intSize/40);
    ellipse(intSize/2, 3*intSize/10, intSize/40, intSize/40);

    // second circle
    fill(64, 184, 138);
    ellipse(intSize/2, intSize/2, intSize/4, intSize/4);

    // second circle eyes
    fill(0);
    ellipse(9*intSize/20, 37*intSize/80, intSize/40, intSize/40);
    ellipse(23*intSize/40, 9*intSize/18, intSize/40, intSize/40);

    // smallest circle
    fill(64, 184, 152);
    ellipse(43*intSize/80, 43*intSize/80, 11*intSize/80, 11*intSize/80);

    // smallest circle eyes
    fill(0);
    ellipse(intSize/2, 45*intSize/80, intSize/40, intSize/40);
    ellipse(47*intSize/80, 43*intSize/80, intSize/40, intSize/40);

    // mouth
    fill(245, 166, 154);
    ellipse(11*intSize/20, 9*intSize/16, intSize/20, intSize/40);
  }
}