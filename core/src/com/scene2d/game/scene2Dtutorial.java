package com.scene2d.game;

//import för scene 2d!!
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.*;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class scene2Dtutorial extends ApplicationAdapter {

    Stage stage;

	//ALLT UTKOMMENTERAT - BEHÖVS EJ NÄR SCENE2D ANVÄNDS...
	/*
	SpriteBatch batch;
	Texture img;
	*/

	@Override
	public void create () {

	    //create stage, viewPoint - hur scene ritas
        //ScreenViewport() ger skärmutlösning enligt datorns...
        stage = new Stage(new ScreenViewport());

        //CREATE ACTOR
        MyActor myActor = new MyActor();
        //ADD ACTOR TO STAGE
        stage.addActor(myActor);
        //VIKITGT
        Gdx.input.setInputProcessor(stage);

		/*
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		*/
	}


	@Override
	public void render () {

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //ritar scenen
        stage.draw();
		/*
		Gdx.gl.glClearColor(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
		*/
	}

    /**
     * seperate class for sprite
     * inner class for tutorial, otherwise do it as a sperate class
     */

    class MyActor extends Actor{

        //could also be a sprite...
        Texture texture = new Texture(Gdx.files.internal("badlogic.jpg"));

        //ctrl o --> overload from parent classes
        //overload draw method to draw this actor..

        //draws sprite...
        @Override
        public void draw(Batch batch, float parentAlpha) {
            //super.draw(batch, parentAlpha); FYLL I SÅ ATT BILD RITAS I ORIGO
            batch.draw(texture,0,0);
        }
    }

	/*@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	*/
}
