/**
 * @author Student
 *
 */
public class SongDriver {

	public static void main(String[] args) {

		// Initialize songs (Top 5 from 1983)
		Song song1 = new Song("Every Breath You Take", 254, "The Police", 5);
		Song song2 = new Song("Billie Jean", 294, "Michael Jackson", 4);
		Song song3 = new Song("Total Eclipse of the Heart", 422, "Bonnie Tyler", 3);
		Song song4 = new Song("Beat It", 258, "Michael Jackson");
		Song song5 = new Song("Say Say Say", 235, "Paul McCartney and Michael Jackson");
		
		// Setting ratings using the mutator method
		song4.setRating(4);
		song5.setRating(3);
		
		// Initialize variables
		int songs = 5;
		int avgLength = 0;
		
		// Array "cd" holds references to the songs
		Song[] cd = new Song[songs];
		cd[0] = song1;
		cd[1] = song2;
		cd[2] = song3;
		cd[3] = song4;
		cd[4] = song5;
		
		// Output each song in array "cd"
		for(int i=0; i < songs; i++) {
			System.out.println(cd[i]);
			System.out.println();
		}
		
		// Calculate the average length of all the songs in array cd
		for(int i=0; i < songs; i++) {
			avgLength += cd[i].getLength();
			if(i == songs - 1) {
				avgLength = avgLength/songs;
			}
		}
		
		// Outputs the average length of all the songs in array cd
		System.out.println("The average length of the songs is " + avgLength + " seconds.");
	}
}
