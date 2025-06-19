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

import java.util.Locale;

public class StreamMain {
//    public static void main(String[] args) {
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("kwiaty",ant -> ant.toUpperCase());
//    }

//    wymyslony przezemnie upiekszacz
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("kwiaty biale",ant -> ant.replace(" ", "_"));
    }
}