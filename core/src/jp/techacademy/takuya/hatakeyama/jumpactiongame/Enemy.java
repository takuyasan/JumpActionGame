package jp.techacademy.takuya.hatakeyama.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Takuya on 2017/11/04.
 */

public class Enemy extends GameObject {

    public static final float ENEMY_WIDTH = 1.0f;
    public static final float ENEMY_HEIGHT = 1.0f;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH,ENEMY_HEIGHT);
    }
}
