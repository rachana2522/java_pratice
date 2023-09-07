//Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods to play and tune each instrument.
package practice_java;

abstract class Instrument {
 abstract void play();
 abstract void tune();
}


class Glockenspiel extends Instrument {
 @Override
 void play() {
     System.out.println("Glockenspiel produces bright and melodic sounds.");
 }

 @Override
 void tune() {
     System.out.println("Tuning a glockenspiel involves adjusting its metal bars.");
 }
}


class Violin extends Instrument {
 @Override
 void play() {
     System.out.println("Violin creates expressive and emotive musical tones.");
 }

 @Override
 void tune() {
     System.out.println("Tuning a violin requires adjusting the tension of its strings.");
 }
}
public class qs9 {
 public static void main(String[] args) {
     Glockenspiel glockenspiel = new Glockenspiel();
     Violin violin = new Violin();

     System.out.println("Playing the Glockenspiel:");
     glockenspiel.play();
     glockenspiel.tune();

     System.out.println("\nPlaying the Violin:");
     violin.play();
     violin.tune();
 }
}

