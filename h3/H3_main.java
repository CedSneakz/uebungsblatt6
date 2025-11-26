package h3;

public class H3_main {
public static void main(String[] args) { 
    int[] array1 ={1, 2, 3, 4, 5};
    int[] array2 ={5, 4, 3, 2, 1};
    int[] array3 = {1, 2, 3, 4};
    int[] array4 = {3, 1, 4, 2, 5};

    System.out.println(compareArraysVal(array1, array2)); 
    System.out.println(compareArraysVal(array1, array3)); 
    System.out.println(compareArraysVal(array1, array4));
    
}

public static boolean compareArraysVal (int[] a, int[] b) {
    if (a.length != b.length) {
        return false;
    }
    for (int i = 0; i < a.length; i++) {
        boolean found = false;
        for (int j = 0; j < b.length; j++) {
            if (a[i] == b[j]) {
                found = true;
                break;
            }
        }
        if (!found) {
            return false;
        }
    }
    return true;
}
}
