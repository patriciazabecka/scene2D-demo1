package com.scene2d.game.desktop;

		import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
		import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
		import com.scene2d.game.scene2Dtutorial;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//----window-size----//
		config.title = "2D-GAME TUTORIAL";
		config.useGL30 = true;
		config.height = 800;
		config.width = 1200;
		new LwjglApplication(new scene2Dtutorial(), config);
		new LwjglApplication(new scene2Dtutorial(), config);
	}
}
