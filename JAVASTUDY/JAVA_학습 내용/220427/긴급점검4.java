package test;

import java.util.ArrayList;
import java.util.List;

class Movie{
	private String movieName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
}
public class �������4 {
	
	public static List<Movie> getMovieList(){
		List<Movie> list = new ArrayList<Movie>();
		Movie m = new Movie();
		m.setMovieName("�ν�Ʈ ��Ƽ");
		list.add(m);
		
		Movie m2 = new Movie();
		m2.setMovieName("���� ����");
		list.add(m2);
		return list;
	}

	public static void main(String[] args) {
		List<Movie> list = getMovieList();
		System.out.println("*���� �� ��ȭ* ");
		
		for(Movie movie:getMovieList()) {
			System.out.println(movie.getMovieName());
		}
	}

}
