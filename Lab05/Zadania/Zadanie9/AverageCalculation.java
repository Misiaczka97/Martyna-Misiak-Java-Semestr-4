import java.util.stream.Stream;

public class AverageCalculation {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0);

        double[] result = stream.reduce(
            new double[]{0, 0},  
            (a, b) -> new double[]{a[0] + b, a[1] + 1}, 
            (a, b) -> new double[]{a[0] + b[0], a[1] + b[1]} 
        );

        double sum = result[0];
        long count = (long) result[1];
        double average = sum / count;

        System.out.println("Average: " + average);
    }
}

// Dlaczego nie można po prostu obliczyć sumy i podzielić przez count()?
// 
// 1. Wydajność: Strumienie są przetwarzane w sposób leniwy i mogą być nieskończone.
//    W przypadku strumienia nieskończonego nie możemy użyć metody count() bez ryzyka 
//    niekończącego się przetwarzania. Używając reduce, przetwarzamy elementy strumienia 
//    w jednym przebiegu, co jest bardziej efektywne.
//
// 2. Koszt obliczeń: Przy użyciu metody count(), musimy przejść przez wszystkie elementy
//    strumienia dwa razy - raz do obliczenia sumy, a drugi raz do obliczenia liczby elementów.
//    Jest to mniej efektywne w porównaniu z jednorazowym przejściem przy użyciu metody reduce.
//
// 3. Efektywność metody reduce: Metoda reduce zapewnia jednoczesne obliczanie sumy i liczby
//    elementów w jednym przebiegu, co jest bardziej efektywne i pozwala na przetwarzanie
//    strumienia w sposób bardziej zrównoważony i skalowalny.
