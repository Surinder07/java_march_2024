package april27.media;

public class YoutubePremium extends Youtube implements AudioMediaPlayer, VideoMediaPlayer{

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
        return true;
    }

    @Override
    public boolean screenOffAllowed() {
        return true;
    }

    @Override
    public boolean subscribersAllowed() {
        System.out.println("Something which is not allowed in premium");
        return false;
    }
}
