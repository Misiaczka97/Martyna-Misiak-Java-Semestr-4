package r08.r08_07;

class User
{
    public User(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return name;
    }

    private String id;
    private String name;
}

