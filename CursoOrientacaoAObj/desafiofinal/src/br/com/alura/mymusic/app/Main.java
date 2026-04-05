import br.com.alura.mymusic.model.Music;
import br.com.alura.mymusic.model.MyPreferred;
import br.com.alura.mymusic.model.Podcast;

void main() {

    Music music = new Music("21 Questions", 3, "50 Cent", "Get Rich or Die Tryin", "Rap");
    for (int i = 1; i <= 2500; i++) {
        music.play();
    }

    for (int i = 1; i <= 100; i++) {
        music.toEnjoy();
    }

    Podcast podcast = new Podcast("Podpah", 120, "Igão e Mítico", "Podcast de entretenimento brasileiro");
    for (int i = 1; i <= 5000; i++) {
        podcast.play();
    }

    for (int i = 1; i <= 500; i++) {
        podcast.toEnjoy();
    }

    MyPreferred myPreferred = new MyPreferred();
    myPreferred.include(music);
    myPreferred.include(podcast);
}