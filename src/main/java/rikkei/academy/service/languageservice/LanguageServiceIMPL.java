package rikkei.academy.service.languageservice;

import rikkei.academy.model.Language;

import java.util.ArrayList;
import java.util.List;

public class LanguageServiceIMPL implements ILanguageService{
    public static List<Language> languageList = new ArrayList<>();
    static {
        languageList.add(new Language(1,"English"));
        languageList.add(new Language(2,"Vietnamese"));
        languageList.add(new Language(3,"Japanese"));
        languageList.add(new Language(4,"Chinese"));


    }
    @Override
    public List<Language> findAll() {
        return languageList;
    }

    @Override
    public void save(Language language) {

    }
}
