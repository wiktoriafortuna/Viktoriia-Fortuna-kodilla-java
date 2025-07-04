//package com.kodilla.stream;                                                   // [1]
//
//import com.kodilla.stream.lambda.Executor;                                    // [2]
//import com.kodilla.stream.lambda.Processor;                                   // [3]
//
//public class StreamMain {                                                     // [4]
//
//    public static void main(String[] args) {                                   // [5]
//        Processor processor = new Processor();                                  // [6]
//        Executor codeToExecute = () -> System.out.println("This is an example text.");  // [7]
//        processor.execute(codeToExecute);                                       // [8]
//    }
//}

//package com.kodilla.stream;
//
//import com.kodilla.stream.lambda.Processor;
//
//public class StreamMain {
//
//    public static void main(String[] args) {
//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text."));
//    }
//}

package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import java.util.Locale;

public class StreamMain {
//    public static void main(String[] args) {
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("kwiaty",ant -> ant.toUpperCase());
//    }

//   wymyslony przezemnie upiekszacz
//    dodalam _
  public static void main(String[] args) {
       PoemBeautifier poemBeautifier = new PoemBeautifier();
      poemBeautifier.beautify("kwiaty biale",ant -> ant.replace(" ", "_"));
      poemBeautifier.beautify("lato", ant -> "***" + ant + "***");
      poemBeautifier.beautify("kwiaty",ant -> ant.toUpperCase());
  }
}

//System.out.println("Using Stream to generate even numbers from 1 to 20");
//NumbersGenerator.generateEven(20);