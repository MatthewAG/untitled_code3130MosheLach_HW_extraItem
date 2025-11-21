package Matthew_Glinik.F_generics;

public interface compareTo_Methood<E> extends Triple_isEqualTo_Methoods<E>, Triple_isGreaterThan_Methoods<E>, Triple_isLessThan_Methoods<E>, Comparable<E> {
    // 1115
    boolean isEqualTo(E other);
    boolean isGreaterThan(E other);
    boolean isLessThan(E other);
    // 3130 methood . \n
    /*
    public default int compareTo(E o)
    {
        if(equals(o))
        {
            return(0);
        }
        else if(greaterThan_s(o))
        {
            return(1);
        }
        else if(lessThan_s(o))
        {
            return(-1);
        }

        int return_value = getComparasionNumber(o);
        if((return_value) != (0))
        {
            return(return_value);
        }
        else
        {
            return(getFilterNumber(o));
        }
    }
    */
    /*
    // 3130 (Winter)
    public int getComparasionNumber(E o);
    public int getFilterNumber(E o);
    */
    // 3130 extraItem
    public default int getComparasionNumber(E o)
    {
        compareTo_Methood_CLASS<E> compareTo_Methood_CLASS_object = new compareTo_Methood_CLASS<E>();
        return(compareTo_Methood_CLASS_object.getComparasionNumber(o));
    }
    public default int getFilterNumber(E o)
    {
        compareTo_Methood_CLASS<E> compareTo_Methood_CLASS_object = new compareTo_Methood_CLASS<E>();
        return(compareTo_Methood_CLASS_object.getFilterNumber(o));
    }
}
