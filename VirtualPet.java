/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Feed me.");
        askForInput("Feed?");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public int showChoiceDialog(String question, String firstOption, String secondOption) {
    return face.showChoiceDialog(question, firstOption, secondOption);
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void wonTheLottery(){
        face.setImage("ecstatic");
    }
    public void hot(){
        face.setImage("hot");
    }
    public void burning(){
        face.setImage("burning");
        }
    public void cold(){
        face.setImage("cold");
    }
    public void freezing(){
        face.setImage("freezing");
    }
    public void setMessage(String s){
        face.setMessage(s);
    }

    public void setImage(String s){
        face.setImage(s);
    }


} // end Virtual Pet
