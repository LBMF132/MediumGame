/*  
* To change this template, choose Tools | Templates  
* and open the template in the editor.  
*/

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;


public class WizardGame extends BasicGame {
	public WizardGame() {
		super("Wizard game");
	}
	private TiledMap grassMap;
	private String dataPath = "C:\\users\\19lfreeman\\desktop\\map\\";
	public static void main(String[] arguments) {
		try {
			AppGameContainer app = new AppGameContainer(new WizardGame());
			app.setDisplayMode(500, 400, false);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	@Override	
    public void init(GameContainer container) throws SlickException
    {
    	
		Image [] movementUp = {new Image("data/wmg1_bk1.png"), new Image("data/wmg1_bk2.png")};
		Image [] movementDown = {new Image("data/wmg1_fr1.png"), new Image("data/wmg1_fr2.png")};
		Image [] movementLeft = {new Image("data/wmg1_lf1.png"), new Image("data/wmg1_lf2.png")};
		Image [] movementRight = {new Image("data/wmg1_rt1.png"), new Image("data/wmg1_rt2.png")};
		int [] duration = {300, 300};
    	grassMap = new TiledMap(dataPath+"test2.tmx");
    }

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
	}

	public void render(GameContainer container, Graphics g) throws SlickException {
		grassMap.render(0, 0);

	}
}