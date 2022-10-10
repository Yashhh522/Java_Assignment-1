import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
class Triplet<U, V, T>
{
    public final U first;
    public final V second;
    public final T third;
    private Triplet(U first, V second, T third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Triplet triplet = (Triplet) o;
        if (!first.equals(triplet.first) || !second.equals(triplet.second) || !third.equals(triplet.third))
        {
            return false;
        }
        return true;
    }
    public int hashCode()
    {
        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        result = 31 * result + third.hashCode();
        return result;
    }
    public String toString()
    {
        return "(" + first + ", " + second + ", " + third + ")";
    }
    public static <U, V, T> Triplet<U, V, T> of(U a, V b, T c)
    {
        return new Triplet<>(a, b, c);
    }
}
public class c11
{
    public static void main(String[] args) throws ExecutionException
    {
        Triplet<String, Integer, Character> p1 = Triplet.of("Yash", 34, 'C');
        Triplet<String, Integer, Character> p2 = Triplet.of("Pavan", 18, 'C');
        Triplet<String, Integer, Character> p3 = Triplet.of("Aayush", 43, 'C');
        List<Triplet<String, Integer, Character>> pairs = new ArrayList<>();
        pairs.add(p1);
        pairs.add(p2);
        pairs.add(p3);
        System.out.println(pairs);
        Set<Triplet<String, Integer, Character>> distinctTriplets = new HashSet<>(pairs);
        System.out.println(distinctTriplets);
        System.out.println();
        System.out.println("Prepared by : 21CE034_Yash Gohil");
    }
}
