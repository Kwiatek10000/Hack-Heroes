package com.hackheroes.game.Screens;

import com.badlogic.gdx.Screen;

abstract class AbstractScreen implements Screen {

    @Override
    public void show() {}

    @Override
    public void render(float delta) {}

    @Override
    public void resize(int width, int height) {}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {}

    public void isClicked(int touchX, int touchY) {}
}