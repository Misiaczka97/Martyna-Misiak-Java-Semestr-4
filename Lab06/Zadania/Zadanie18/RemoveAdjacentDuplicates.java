import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class RemoveAdjacentDuplicates {
    public static <T> List<T> removeAdjacentDuplicates(Stream<T> stream) {
        List<T> result = new ArrayList<>();
        T[] previous = (T[]) new Object[1]; 
        
        stream.forEach(element -> {
            if (!Objects.equals(previous[0], element)) {
                result.add(element);
                previous[0] = element;
            }
        });
        
        return result;
    }

    public static void main(String[] args) {
        Stream<String> words = Stream.of("a", "a", "b", "b", "c", "c", "c", "d");
        List<String> result = removeAdjacentDuplicates(words);
        result.forEach(System.out::println);
    }
}

/*
Jak można wyeliminować ze strumienia duplikaty znajdujące się obok siebie?

Aby wyeliminować duplikaty znajdujące się obok siebie, należy porównać każdy element strumienia z poprzednim elementem i dodać go do wyniku tylko wtedy, gdy nie jest równy poprzedniemu elementowi. W powyższym kodzie jest to osiągnięte poprzez utrzymywanie ostatnio widzianego elementu i porównywanie go z bieżącym elementem w strumieniu.

Czy Twoja metoda działa dla strumienia równoległego?

Nie, ta metoda nie działa poprawnie dla strumienia równoległego. Strumienie równoległe przetwarzają elementy równocześnie, co oznacza, że elementy mogą być przetwarzane w innej kolejności niż ich pierwotne rozmieszczenie. W związku z tym, proste porównywanie sąsiadujących elementów nie jest możliwe w równoległym przetwarzaniu bez dodatkowej synchronizacji, co neguje korzyści wynikające z równoległego przetwarzania. W przypadku operacji zależnych od kolejności elementów, takich jak usuwanie sąsiadujących duplikatów, przetwarzanie szeregowe jest bardziej odpowiednie.
*/
