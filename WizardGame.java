/*  
* To change this template, choose Tools | Templates  
* and open the template in the editor.  
*/
//hi logan can u see this because I love u a lot <3 woo
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
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
    	
    	
    	grassMap = new TiledMap(dataPath+"test2.tmx");
    }

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
	}

	public void render(GameContainer container, Graphics g) throws SlickException {
		grassMap.render(0, 0);

	}
}