/**
 * @author Student
 *
 */
public class Song extends RetailItem {
	// Stores the title of the song
	private String name;
	
	// Stores the number of stars rating of the song
	private int rating;
	
	/**
	 * @param newName
	 * 			name of song
	 * @param seconds
	 * 			length of song
	 * @param artistName
	 * 			name of artist
	 */
	public Song(String newName, int seconds, String artistName) {
		super(artistName, seconds);
		this.name = newName;
	}
	
	/**
	 * @param newName
	 * 			name of song
	 * @param seconds
	 * 			length of song
	 * @param artistName
	 * 			name of artist
	 * @param stars
	 * 			stars rating of song
	 */
	public Song(String newName, int seconds, String artistName, int stars) {
		super(artistName, seconds);
		this.name = newName;
		this.rating = stars;
	}
	
	/**
	 * @return name
	 * 		name of the artist
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * @param stars
	 * 		stars rating of the song
	 */
	public void setRating(int stars) {
		this.rating = stars;
	}
	
	/**
	 * @return rating
	 * 		the current rating
	 */
	public int getRating() {
		return this.rating;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Song: " + this.name + ", " + this.rating + " stars\n" + super.toString();
	}
}
