package stqa.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args) {
    String langs[] = new String[4];
    langs[0] = "Java";
    langs[1] = "C++";
    langs[2] = "Javascript";
    langs[3] = "Python";

    for (int i = 0; i < langs.length; i ++)
    {
      System.out.println("The language is top " + langs[i]);
    }

    for (String l: langs)
    {
      System.out.println("The language is top " + l);
    }

    List<String> languages = new ArrayList<String>();
    languages.add("Java2");
    languages.add("C#2");
    languages.add("Javascript2");
    languages.add("Python2");

    List<String> languages2 = Arrays.asList("Java3", "C#3");

    for (String l: languages)
    {
      System.out.println("The language is top " + l);
    }
    for (int i = 0; i < languages.size(); i++)
    {
      System.out.println("The language is top " + languages.get(i));
    }


    for (String l: languages2)
    {
      System.out.println("The language is top " + l);
    }


  }

}
