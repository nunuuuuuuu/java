public class SongTest {
  public static void main(String[] args) {
    Song song1 = new Song();

    String[] composer1 = {"composer1" , "composer2", "composer3"};

    song1.setSongInfo("Song", "artist", "album", 2025, composer1);

    song1.songAllData();

    song1.setYear(100);

//    int aa = song1.setYear1();


  }
}
