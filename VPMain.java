import javax.swing.*;

public class VPMain extends JFrame {
	VirtualPet vp = new VirtualPet();
	private static final long serialVersionUID = 1L;

	public VPMain() {
		int c1 = vp.showChoiceDialog("Where do you want to go on a road trip?", "Death Valley", "Antarctica");

		if (c1 == 0) { //death valley storyline
			vp.setMessage("Great idea!");
			vp.setImage("happy");
			waitABeat(1000);
			vp.setImage("tired");
			waitABeat(500);
			vp.setMessage("Wow, it's hot here");
			waitABeat(300);

			int c2 = vp.showChoiceDialog("Will you give me water?", "Yes", "No");
			if (c2 == 1) {
				waitABeat(300);
				vp.setMessage("that's mean");
				waitABeat(500);
				vp.setMessage("I'm thirsty");
				waitABeat(700);
				vp.setMessage("why won't you give me water?");
				waitABeat(200);
				vp.setImage("verysad");

				int c3 = vp.showChoiceDialog("Will you give me water?", "Yes", "No");
				if (c3 == 1) {
					waitABeat(300);
					vp.setMessage("why are you so mean");
					waitABeat(500);
					vp.setMessage("...");
					waitABeat(700);
					vp.setMessage("why won't you give me water?");
					waitABeat(200);
					vp.setImage("enraged");

					int c4 = vp.showChoiceDialog("Will you give me water?", "Yes", "No");
					if (c4 == 1) {
						waitABeat(1300);
						vp.setMessage("...");
						waitABeat(1500);
						vp.setMessage("...");
						waitABeat(1700);
						vp.setMessage("if you don't get me water then I will die");
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
							int c6 = vp.showChoiceDialog("Do you want to try again?", "Yes", "No");
							if (c6 == 0)

								vp.setMessage("Too bad, you were a bad owner");
							else
								vp.setMessage("Probably for the best");
						}
					}
				}

			} else {
				waitABeat(300);
				vp.setMessage("thanks");
				vp.setImage("happy"); // todo
				waitABeat(400);
				vp.setImage("hot");
				vp.setMessage("Sure is hot here!");
				waitABeat(300);
				vp.setMessage("Lets go to somewhere colder!");
				c1 = 1;
			}
		}


		//antarctica storyline
		if (c1 == 1) {
			vp.setMessage("Ok lets go!");
			waitABeat(1000);
			int b = vp.showChoiceDialog("Man it's pretty cold here, can we go home?", "yes", "no");
			waitABeat(300);
			if (b == 0) {
				vp.setMessage("thanks bro I think I almost died");
				waitABeat(5000);
				vp.setImage("happy");
				vp.setMessage("You and your pet went home, and he is thriving now, congrats you are a good owner.");
			} else {
				vp.setMessage("Ok… I guess");
				waitABeat(1000);
				vp.setMessage("I can't feel my hands I need some soup!");
				waitABeat(300);
				int b2 = vp.showChoiceDialog("Feed him?", "yes", "no");
				if (b2 == 0) {
					vp.setMessage("whew that's better");
					waitABeat(1200);
					int b21 = vp.showChoiceDialog("What should we do now?", "climb Mount Everest", "go home");
					if (b21 == 0);
						vp.setImage("tired");
						waitABeat(1200);
						vp.setMessage("bro... why?");
						waitABeat(1200);
						vp.setMessage("fine, lets go now");
						waitABeat(5000);
						vp.setImage("ecstatic");
						waitABeat(1200);
						vp.setMessage("after five days of voyage, you died, but your pet survived, you are a bad owner. (He never cared about you anyways)");
				} 
				else
					vp.setImage("cold");
					waitABeat(1200);
					vp.setMessage("If I don't get fed soon, I will die!");
					waitABeat(1200);
					int b3 = vp.showChoiceDialog("Are you sure you don't want to feed him?", "yes", "no");
					if (b3 == 0) {
						vp.setMessage("Thanks Man, but since you didn't feed me before I will leave");
						waitABeat(5000);
						vp.setMessage("Your pet has left, you are a bad owner!");
					}
					else
					vp.setImage("skeleton");
					waitABeat(5000);
					vp.setMessage("your pet has died, you are the worst owner!");
					}
			}
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
