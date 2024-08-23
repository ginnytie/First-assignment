/**
 *	FirstAssignment.java
 *	Display a brief description of your summer vacation on the screen.
 *
 *	To compile Linux:	javac -cp .:mvAcm.jar FirstAssignment.java
 *	To execute Linux:	java -cp .:mvAcm.jar FirstAssignment
 *
 *	To compile MS Powershell:	javac -cp ".;mvAcm.jar" FirstAssignment.java
 *	To execute MS Powershell:	java -cp ".;mvAcm.jar" FirstAssignment
 *
 *	@author	Your name
 *	@since	Today's date
 */
import java.awt.Font;

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class FirstAssignment extends GraphicsProgram {
    
    public void run() {
    	//	The font to be used
    	Font f = new Font("Serif", Font.BOLD, 18);
    	
    	//	Line 1
    	GLabel s1 = new GLabel("What I did on my summer vacation ...", 10, 20);
    	s1.setFont(f);
    	add(s1);
    	    	
    	//	Continue adding lines until you have 12 to 15 lines
    	GLabel s2 = new GLabel("In June I volunteered at Mcclellan Ranch Preserve. I got to see a lot", 10,20);
    	GLabel s3 = new GLabel(" of little kids. Some of them were really loud and clingy, but it was fun", 10,20);
    	GLabel s4 = new GLabel("Later in the summer, I took an Intro to Engineering course at De Anza", 10, 20);
    	GLabel s5 = new GLabel( "College. It was a pretty fun experience. I made a few new friends", 10, 20);
    	GLabel s6 = new GLabel(", although I am probably never going to see them again. In the class", 10, 20);
    	GLabel s7 = new GLabel(" I learned some basic Excel functions. I also learned a little bit of", 10, 20);
    	GLabel s8 = new GLabel(" CAD. I think CAD is pretty useful and I wish to learn more of it.", 10, 20);
    	GLabel s9 = new GLabel("I also went to a lazy river with my family and some family friends.", 10, 20);
    	GLabel s10 = new GLabel("I think that was one of the highlights of my summer. It was so fun." 10,20);
    	GLabel s11 = new GLabel("I was on a donut, just calmly floating along the river, while enjoyng" 10,20);
    	GLabel s12 = new GLabel("some drinks and snacks. The water was so refreshing on the hot day " 10,20);
    	GLabel s13 = new GLabel("and I want to go again. I also read a few good books and watched" 10,20);
    	GLabel s14 = new GLabel("A few good movies. I really like the book The Kite Runner because" 10,20);
    	GLabel s15 = new GLabel("it was really touching. The movie The Shawshank Redemption was also" 10,20);
    	GLabel s16 = new GLabel("super good. I didn't do much but it was overall a decent summer." 10,20);
    	s2.setFont(f);s3.setFont(f);s4.setFont(f);s5.setFont(f);s6.setFont(f);s7.setFont(f);s8.setFont(f);
    	s9.setFont(f);s10.setFont(f);s11.setFont(f);s12.setFont(f);s13.setFont(f);s14.setFont(f);s15.setFont(f);s16.setFont(f);
    	add(s2);add(s3);add(s4);add(s5);add(s6);add(s7);add(s8);add(s9);add(s10);add(s11);add(s12);add(s13);add(s14);add(s15);add(s16);
    	
    	
    	
    }
    
}
