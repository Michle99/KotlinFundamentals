class Song(
    val title: String, 
    val artist: String, 
    val year: Int, 
    val playCount: Int) {
      
      val isPopularSong : Boolean
            get() = playCount >= 1000

      fun songDescription() {
        println("$title, performed by $artist, was released in the $year published.")
      }
}

fun main() {
    val songInfo = Song(title = "Magarine", artist = "TK", 
                            year = 2022, playCount = 1200)

    println(songInfo.isPopularSong)
    songInfo.songDescription()

        
}