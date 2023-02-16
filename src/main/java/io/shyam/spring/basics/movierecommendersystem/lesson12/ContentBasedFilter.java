package io.shyam.spring.basics.movierecommendersystem.lesson12;


import javax.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CBF")
public class ContentBasedFilter  implements Filter {

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
