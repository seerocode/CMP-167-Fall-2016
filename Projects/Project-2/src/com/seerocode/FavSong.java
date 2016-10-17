package com.seerocode;

import java.util.Scanner;

public class FavSong {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Need to practice this!
		
		System.out.print("What is the name of your favorite song?: ");
		String song = sc.nextLine();
		song = song.trim(); //trims whitespace before and after
		
		System.out.print("OK, which artist sings that song?: ");
		String artist = sc.nextLine();
		artist = artist.trim();
		
		int song_char_count = song.length();
		int artist_char_count = artist.length();
		int sum_of_counts = song_char_count + artist_char_count;
		
		System.out.printf("%s sings %s\n", artist, song);
		System.out.printf("%d characters in the song, %s.\n", song_char_count, song);
		System.out.printf("%d characters in %s's name.\n", artist_char_count, artist);
		System.out.printf("%d characters in total.\n", sum_of_counts);
	}

}
