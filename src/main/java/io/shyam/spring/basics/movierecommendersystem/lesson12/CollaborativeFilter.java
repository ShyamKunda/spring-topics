package io.shyam.spring.basics.movierecommendersystem.lesson12;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {

        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
