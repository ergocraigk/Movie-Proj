import java.util.HashSet;
import java.util.*;
/**
 * Created by Craig on 1/22/2015.
 */
public class setHelper<E> {

    public Set<E> intersection(Set<E> s1, Set<E> s2){
        Set<E> intersection = new HashSet<E>(s1);
        intersection.retainAll(s2);
        return intersection;
    }

    public Set<E> difference(Set<E> s1, Set<E> s2){
        Set<E> difference = new HashSet<E>(s1);
        difference.removeAll(s2);
        return difference;
    }

    public Set<E> union(Set<E> s1, Set<E> s2){
        Set<E> union = new HashSet<E>(s1);
        union.addAll(s2);
        return union;
    }

    public Set<E> symetricDifference(Set<E> s1, Set<E> s2){
        Set<E> unionOfs1Ands2 = union(s1,s2);
        Set<E> intersectionOfs1Ands2 = intersection(s1,s2);
        Set<E> symDiff = difference(unionOfs1Ands2, intersectionOfs1Ands2);
        return symDiff;
    }


}
