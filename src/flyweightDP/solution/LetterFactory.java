package flyweightDP.solution;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    public static Map<Character ,Letter> objectMapCache= new HashMap<>();

    public static Letter createLetter(char charVal){
        if(objectMapCache.containsKey(charVal)){
            System.out.println("Letter already exists in cache");
            return objectMapCache.get(charVal);
        }else{
            System.out.println("Letter not exists in cache");
            objectMapCache.put(charVal,new DocumentCharacter(charVal,"Arial",12,"black"));
            return objectMapCache.get(charVal);
        }
    }

}
