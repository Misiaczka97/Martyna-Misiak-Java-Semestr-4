package r08.r08_07rec;

/*
 * Więcej na temat rekordów:
 * https://javastart.pl/baza-wiedzy/slownik/rekordy
 * https://dev.java/learn/records/
*/

public record User(String id, String name)
{
    @Override
    public String toString()
    {
        return name;
    }
}

