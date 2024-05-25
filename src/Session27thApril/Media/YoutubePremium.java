package Session27thApril.Media;

public class YoutubePremium extends Youtube implements AudioMediaPlayer, VideoMediaPlayer {

    @Override
    public boolean screenOffAllowed() {
        //return super.screenOffAllowed();
        return true;
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
    public boolean chatsAllowed() {
//        return super.chatsAllowed();
        return true;
    }

    @Override
    public boolean subscribersAllowed() {
        System.out.println("Somewthing is wrong, which is not allowed in premium");
       // return super.subscribersAllowed();
        return false;
    }
}
