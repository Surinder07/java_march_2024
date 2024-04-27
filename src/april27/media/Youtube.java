package april27.media;

public class Youtube implements VideoMediaPlayer, AudioMediaPlayer{
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
        System.out.println("Chats are allowed");
        return true;
    }

    @Override
    public boolean screenOffAllowed() {
        return false;
    }

    public boolean subscribersAllowed(){
        return true;
    }
}
