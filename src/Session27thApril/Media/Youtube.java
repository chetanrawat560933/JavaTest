package Session27thApril.Media;

public class Youtube implements VideoMediaPlayer, AudioMediaPlayer{


    @Override
    public boolean screenOffAllowed() {
        return false;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean chatsAllowed() {
        return false;
    }

    public boolean subscribersAllowed()
    {
        return true;
    }
}
