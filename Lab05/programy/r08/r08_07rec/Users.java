package r08.r08_07rec;

import java.util.Optional;
import java.util.stream.Stream;

class Users
{
    private static User[] users = {
        new User("gboole", "George Boole"),
        new User("achurch", "Alonzo Church"),
        new User("hcurry", "Haskell Curry")
    };

    public static Optional<User> lookup(String id)
    {
        return Stream.of(users)
            .filter(u -> u.id()
            .equals(id))
            .findFirst();
    }

    public static User classicLookup(String id)
    {
        for (User u : users) {
            if (u.id().equals(id)) {
                return u;
            }
        }
        return null;
    }
}

