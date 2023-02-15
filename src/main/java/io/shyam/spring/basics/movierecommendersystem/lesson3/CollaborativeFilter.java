package io.shyam.spring.basics.movierecommendersystem.lesson3;

import org.springframework.stereotype.Component;

public class CollaborativeFilter implements Filter {

    public String[] getRecommendations(String movie) {
        return new String[] { };
    }
}
