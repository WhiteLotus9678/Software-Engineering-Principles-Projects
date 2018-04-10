/**
 * @author Student
 *
 */
public class RetailItem {
	// Stores the name of the artist that released the song
	private String artist = "";
	
	// Stores the length of the song in seconds
	private int length = 0;
	
	/**
	 * @param artistName
	 * 			name of the artist
	 * @param seconds
	 * 			length of the song
	 */
	public RetailItem(String artistName, int seconds) {
		this.artist = artistName;
		this.length = seconds;
	}
	
	/**
	 * @return artist
	 * 			name of the artist
	 */
	public String getArtist() {
		return this.artist;
	}
	
	/**
	 * @return length
	 * 		length of the song
	 */
	public int getLength() {
		return this.length;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// Converts the length of the song into minutes
		int minutes = getLength() / 60;
		
		// Calculates the rest of the seconds left out of the conversion to minutes
		int seconds = getLength() % 60;
		
		// Outputs different strings based on the "seconds" variable
		if (seconds < 10) {
			return getArtist() + " " + minutes + ":0" + seconds;
		} else {
			return getArtist() + " " + minutes + ":" + seconds;
		}
	}
}
