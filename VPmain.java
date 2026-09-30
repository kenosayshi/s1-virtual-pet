import javax.swing.*;

public class VPMain extends JFrame {
    VirtualPet vp = new VirtualPet();
    private static final long serialVersionUID = 1L;

    public VPMain() {
        int c1 = vp.showChoiceDialog("Where do you want to go on a road trip?", "Death Valley", "Antarctica");

if (c1 == 0) {
	vp.setMessage("Thats a terrible idea. We should go to Death Valley!");
} else {
	vp.setMessage("Great idea!");
}
vp.setImage("happy");
waitABeat(1000);
vp.setImage("tired");
waitABeat(500);
vp.setMessage("Wow, it’s hot here");
waitABeat(300);
String in2 = this.askForInput("Will you give me water?"); //fix to make a button

int c2 = vp.showChoiceDialog("Will you give me water?", "Yes", "No");
if (c2 == 1) {
	waitABeat(300);
	vp.setMessage("that’s mean");
	waitABeat(500);
	vp.setMessage("I’m thirsty");
	waitABeat(700);
	vp.setMessage("why won’t you give me water?");
	waitABeat(200);
	vp.setImage("verysad");


	int c3 = vp.showChoiceDialog("Will you give me water?", "Yes", "No");
if (c3 == 1) {
		waitABeat(300);
		vp.setMessage("why are you so mean");
		waitABeat(500);
		vp.setMessage("...");
		waitABeat(700);
		vp.setMessage("why won’t you give me water?");
		waitABeat(200);
		vp.setImage("angry");
		

		int c4 = vp.showChoiceDialog("Will you give me water?", "Yes", "No");
if (c4 == 1) {
			waitABeat(1300);
			vp.setMessage("...");
			waitABeat(1500);
			vp.setMessage("...");
			waitABeat(1700);
			vp.setMessage("if you don’t get me water then I will die");
			waitABeat(2);
			vp.setImage("hot");

			int c5 = vp.showChoiceDialog("Will you give me water?", "Yes", "No");
if (c5 == 1) {

				waitABeat(1300);
				vp.setImage("skeleton");
				vp.setMessage("Your pet died!");
				waitABeat(15000);
				vp.setMessage("Why are you still here?");
				waitABeat(5000);
				vp.setMessage("You lost");
				waitABeat(5000);
				int c6= vp.showChoiceDialog("Do you want to try again?", "Yes", "No");
if (c6 == 0) 

					vp.setMessage("Too bad, you were a bad owner");
				else
					vp.setMessage("Probably for the best");
			}
		}
	}

} else {
waitABeat(300);
vp.setMesssage("thanks");
	vp.setImage("happy"); //todo
	waitABeat(0.4);
	vp.setImage("hot");
	vp.setMessage("Sure is hot here!");
	waitABeat(300);




if (c1 == 1){
	vp.setMessage("Ok lets go!");
	waitABeat(1);
	String b = vp.askForInput("Man it’s pretty cold here, can we go home?");
	waitABeat(300);
		if b = yes {
		vp.setMessage("thanks bro I think I almost died");
		waitABeat(3000);
	else
		vp.setMessage("Ok… I guess");
waitABeatat(100000);
		vp.setMessage("I can't feel my hands I need some soup!");
waitABeatat(.3)300
		String b1 = vp.askForInput("Feed him?");
        int b2 = vp.showChoiceDialog("Feed him?", "yes", "no")
		if (b2 == 0 ){
			vp.setMessage("whew that’s better");
			}
		else
		vp.setImage("cold");

}




       int choice = vp.showChoiceDialog("Are you ready to sleep?", "Sleep", "Exercise");
        if (choice == 0)
            vp.sleep();
        else if (choice == 1)
            vp.exercise();




    }

    public void waitABeat(int ms) {
        try {
            Thread.sleep(ms); // milliseconds
        } catch (Exception e) {

        }
    }

    public String askForInput(String q) {
        String s = (String) JOptionPane.showInputDialog(
                new JFrame(),
                q,
                "Input Dialog",
                JOptionPane.PLAIN_MESSAGE);
        return s;
    }

    public static void main(String[] args) {
        new VPMain();
    }
}
