package jp.techacademy.takuya.hatakeyama.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Takuya on 2017/11/04.
 */

public class Star extends GameObject {
    public static final float STAR_WIDTH = 0.8f;
    public static final float STAR_HEIGHT = 0.8f;

    // 状態
    public static final int STAR_EXIST = 0;
    public static final int STAR_NONE = 1;

    int mState;

    public Star(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(STAR_WIDTH, STAR_HEIGHT);
        mState = STAR_EXIST;
    }

    public void get() {
        mState = STAR_NONE;
        setAlpha(0);
    }
}
