package game;
import java.util.*;

public class Start{
	public static void main (String[] args){
  	Fireball fb = new Fireball();//We are setting up the class names into shorter variables.
    Repair r = new Repair();//We are setting up the class names into shorter variables.
    Heal h = new Heal();//We are setting up the class names into shorter variables.
    Spellbook sb = new Spellbook();//We are setting up the class names into shorter variables.
    
    Player me = new Player(sb, 250);//We are sending the constructor a Spellbook "sb" and a maxMana "mm/250".
    sb.addSpell(fb);//This is adding the Spell "fb" to the Spellbook.
    sb.addSpell(r);//This is adding the Spell "r" to the Spellbook.
    sb.addSpell(h);//This is adding the Spell "h" to the Spellbook.
    
    fb.castFireball(me);//You are first accessing the class and then calling the method inside the class.
    fb.castFireball(me);
    r.castRepair(me);
    h.castHeal(me);
    h.castHeal(me);
    h.castHeal(me);
    System.out.println("You have " + me.showMana() + " mana left");//system.out says the default output method for this program.
    ArrayList<Spell> spells =  me.readSpellBook().getSpells();//I am first getting the players spellbook and then getting the spells in the spellbook.
    //for(Spell s; sb.getSpells()){}//"Spell s" is the type of object that is stored in this list, the latter is the method called "getSpells" which returns an array of all the Spells in the Spellbook.
     	//Spells.get0
    for (Spell s: spells) {//Go through the list of "spells", each thing will be an object of the class "Spell", for the moment call this "s".
    	System.out.println(spells.indexOf(s)+1 + ". " + s.toString());//Print out the list of spells... ???
    }

    
    String spellPicked = (String) Utilities.getInput();
    int spellPickedInt = Integer.parseInt(spellPicked);//parseInt = This will take the input and try to turn it into an integer.
   
    
    
    
    // if(spells get(i) instance of(TargetsItem))
	}
}