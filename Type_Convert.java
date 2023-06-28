/*
 * Type Conversion: it is a way of converting one data type to another data type. 
 *  - Implicit Type Conversion -> done by compiler
 *  - Explicit Type Conversion -> done by programmer
 * 
 * int a = 34;
 * 
 * double b = a;    // implicit type conversion
 * 
 * int c = (int) b; // explicit type conversion
 * 
 * 
 * String datatype is not a primitive datatype, it is a class in java.
 * 
 * When it comes to string we can convert any datatype to string but we cannot convert string to any datatype.
 * 
 * int -> Integer
 * float -> Float
 * double -> Double
 * char -> Character
 * boolean -> Boolean
 * 
 * String -> Integer
 * 
 * String str = "123";
 * 
 * int a = Integer.parseInt(str);   // explicit type conversion
 * 
 * String str = "123.45";
 * 
 * double b = Double.parseDouble(str); // explicit type conversion
 * float c = Float.parseFloat(str);    // explicit type conversion
 * 
 * 
 */


public class Type_Convert {
    public static void main(String[] args) {
        // int a = 34;
        // double b = a; // implicit type conversion

        // System.out.println(a + " " + b);
        
        // float d = 23.8f;
        // int c = (int) d;    // explicit type conversion

        // System.out.println(d + " " + c);


        String str = "123";
        int e = Integer.parseInt(str);  // explicit type conversion
        // System.out.println(str + " " + e);

        // System.out.println(str instanceof String);
        // System.out.println(str.getClass().getName());

        // System.out.println(((Object)e).getClass().getName());
        // System.out.println(((Object)b).getClass().getName());
        // System.out.println(((Object)d).getClass().getName());
        // System.out.println(((Object)e).getClass().getName());

        //isinstance
        // System.out.println(Class.forName("java.lang.String").isInstance(123));



        // System.out.println(Class.class.isPrimitive());
        // int[] array = {1, 2, 3};
        // System.out.println(array.getClass().isArray());

        // System.out.println(Integer.class.isAssignableFrom(Double.class));

        // ArrayList<Integer> list = new ArrayList<Integer>();
        // System.out.println(list.getClass().getTypeName());

        System.out.println(((Object)e).getClass().getTypeName());
        System.out.println(((Object)e).getClass().getName());
    }
}

/*
 * int float char double
 * 
 * double -> float -> int -> char -> explicit type conversion
 * 
 * char -> int -> float -> double -> implicit type conversion
 * 
 * adding 0s at empty bytes...
 * 
 * long -> float
 * 
 * 
 * 
 */


// Data Type	Size (in bytes)	    Range
// boolean	    1	                true or false
// byte	        1	                -128 to 127
// short	    2	                -32,768 to 32,767
// int	        4	                -2,147,483,648 to 2,147,483,647
// long	        8	                -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float	    4	                approximately ±1.4 x 10^-45 to ±3.4 x 10^38
// double	    8	                approximately ±4.9 x 10^-324 to ±1.7 x 10^308
// char	        2	                0 to 65,535

// if we convert long to float then we will lose some data, but if we convert float to long then we will not lose any data.
