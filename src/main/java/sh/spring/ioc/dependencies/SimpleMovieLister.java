package sh.spring.ioc.dependencies;

public class SimpleMovieLister {

	// the SimpleMovieLister has a dependency on a MovieFinder
	private MovieFinder movieFinder;

	// a constructor so that the Spring container can inject a MovieFinder
	public SimpleMovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

	// business logic that actually uses the injected MovieFinder is omitted...
}