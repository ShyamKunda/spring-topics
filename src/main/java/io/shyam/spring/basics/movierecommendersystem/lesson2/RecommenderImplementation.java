package io.shyam.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {


    private Filter filter;
    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
    public String[] recommendMovies (String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations(movie);
        //return the results
        return results;
    }
}
