import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {
    private File url;

    public Audio(String url){
        setUrl(new File(url));
    }

    public Audio(File url){
        setUrl(url);
    }

    public File getUrl() {
        return url;
    }

    public void setUrl(File url) {
        this.url = url;
    }

    public void play(File file){
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch(Exception e){
            System.out.println("Errore, impossibile trovare questo percorso");
        }
    }
}
