
public class Movie implements Comparable<Movie> {
	private double rating;
    private String name;
    private int year;
    
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.year-o.year;
	}
	public Movie(String nm, double rt, int yr){
	    this.name = nm;
	    this.rating = rt;
	    this.year = yr;
	 }
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
