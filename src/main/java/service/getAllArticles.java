package service;

import java.util.ArrayList;
import java.util.List;
import service.implement.BlogNFTicallyServiceImp;
import service.implement.CoinDeskServiceImp;
import service.implement.CrytoNewsBlogServiceImp;
import service.implement.PlazaNFTServiceImp;
import service.implement.TheartNewsPaperServiceImp;
import service.implement.TwitterServiceImp;

public class getAllArticles {
    
    public static List<Object> allArticles() {
        List<Object> allArticles = new ArrayList<>();
        
        BlogNFTicallyServiceImp blogService = BlogNFTicallyServiceImp.getInstance();
        CoinDeskServiceImp coinDeskService = CoinDeskServiceImp.getInstance();
        CrytoNewsBlogServiceImp cryptoNewsService = CrytoNewsBlogServiceImp.getInstance();
        TheartNewsPaperServiceImp artNewsService = TheartNewsPaperServiceImp.getInstance();
        PlazaNFTServiceImp plazaNFTService = PlazaNFTServiceImp.getInstance();
        TwitterServiceImp twitterService  = TwitterServiceImp.getInstance();
        allArticles.addAll(blogService.getAllModels());
        allArticles.addAll(coinDeskService.getAllCoin());
        allArticles.addAll(cryptoNewsService.getAllModels());
        allArticles.addAll(artNewsService.getAllModels());
        allArticles.addAll( plazaNFTService.getAllModels());
        allArticles.addAll(twitterService.getAllModels());
        //favouriteArticles.addAll(twitterService.addFavorite(title));
        return allArticles;
    }
    
    public static void main(String[] args) {
        List<Object> allArticles=allArticles();
        for (Object article:allArticles){
            System.out.println(article);
        }
}
}
