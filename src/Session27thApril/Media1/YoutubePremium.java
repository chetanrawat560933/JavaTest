package Session27thApril.Media1;

public class YoutubePremium extends Youtube implements AudioMediaPlayer, VideoMediaPlayer {

    @Override
    public void audio() {
        super.audio();
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void video() {
        super.video();
    }

    @Override
    public void youtube() {
        System.out.println("This is youtube premium");
      //  super.youtube();
    }


}
