//Model class
class Movie{
	private Integer id;
	private String title;
	private String cast;
	private String director;
	private String producer;
	private String music;
	private String releasedOn;
	private Integer rating;
}

//Services
interface MovieService{
	public void add(Movie movie);
	public Movie[] getAllMovies();
	public Movie getMovieById(Integer id);
	public void update(Movie movie);
	public void delete(Integer id);
}

class MovieServiceImpl implements MovieService{
	public void add(Movie movie){}
	
	public Movie[] getAllMovies(){
		return null;
	}
	
	public Movie getMovieById(Integer id){
		return null;
	}
	
	public void update(Movie movie){}
	
	public void delete(Integer id){}
}