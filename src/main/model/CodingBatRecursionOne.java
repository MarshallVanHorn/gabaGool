package model;


/**
 * https://codingbat.com/java/Recursion-1
* */
public class CodingBatRecursionOne {

    /**
     * Given n of 1 or more,
     * return the factorial of n, which is n * (n-1) * (n-2) ... 1.
     * Compute the result recursively (without loops).
     * <p>
     * factorial(1) → 1
     * factorial(2) → 2
     * factorial(3) → 6
     */

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * We have a number of bunnies and each bunny has two big floppy ears.
     * We want to
     * compute the total number of ears across all the bunnies recursively
     * (without loops or multiplication).
     * <p>
     * bunnyEars(0) → 0
     * bunnyEars(1) → 2
     * bunnyEars(2) → 4
     */

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 * bunnies;
    }

    /**
     * The fibonacci sequence is a famous bit of mathematics,
     * and it happens to have a recursive definition.
     * The first two values in the sequence are 0 and 1 (essentially 2 base cases).
     * Each subsequent value is the sum of the previous two values,
     * so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
     * Define a recursive fibonacci(n) method that returns the nth fibonacci number,
     * with n=0 representing the start of the sequence.
     * <p>
     * fibonacci(0) → 0
     * fibonacci(1) → 1
     * fibonacci(2) → 1
     */

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * We have bunnies standing in a line,
     * numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
     * The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot.
     * Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
     * <p>
     * <p>
     * bunnyEars2(0) → 0
     * bunnyEars2(1) → 2
     * bunnyEars2(2) → 5
     */

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0 || bunnies == 1) {
            return 2 * bunnies;
        }
        if (bunnies % 2 == 1) {
            return 2 + bunnyEars2(bunnies - 1);
        }
        return 3 + bunnyEars2(bunnies - 1);
    }

    /**
     * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
     * the next row has 3 blocks, and so on.
     * Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
     * <p>
     * <p>
     * triangle(0) → 0
     * triangle(1) → 1
     * triangle(2) → 3
     */

    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + triangle(rows - 1);
    }

    /**
     * Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
     * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * <p>
     * <p>
     * sumDigits(126) → 9
     * sumDigits(49) → 13
     * sumDigits(12) → 3
     */

    public int sumDigits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }


    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * <p>
     * count7(717) → 2
     * count7(7) → 1
     * count7(123) → 0
     */

    public int count7(int n) {

        // one digit, equal to 7
        if (n / 10 == 0 && n == 7) {
            return 1;
        }

        // one digit, not equal to 7
        if (n / 10 == 0 && n != 7) {
            return 0;
        }

        // more than one digit, rightmost equal to 7
        if ((n / 10 != 0) && (n % 10 == 7)) {
            return 1 + count7(n / 10);
        }

        // more than one digit, rightmost not equal to 7
        return 0 + count7(n / 10);
    }

    /**
     * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * <p>
     * <p>
     * count8(8) → 1
     * count8(818) → 2
     * count8(8818) → 4
     */

    public int count8(int n) {

        // one digit, equal to 8
        if (n / 10 == 0 && n == 8) {
            return 1;
        }

        // one digit, not equal to 8
        if (n / 10 == 0 && n != 8) {
            return 0;
        }

        // more than one digit, rightmost equal to 8 and left of rightmost equal to 8
        if ((n / 10 != 0) && (n % 10 == 8) && ((n / 10) % 10 == 8)) {
            return 2 + count8(n / 10);
        }

        // more than one digit, rightmost equal to 8 and left of rightmost not equal to 8
        if ((n / 10 != 0) && (n % 10 == 8) && ((n / 10) % 10 != 8)) {
            return 1 + count8(n / 10);
        }

        // more than one digit, rightmost not equal to 8

        return 0 + count8(n / 10);

    }

    /**
     * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
     * <p>
     * <p>
     * powerN(3, 1) → 3
     * powerN(3, 2) → 9
     * powerN(3, 3) → 27
     */

    public int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);
    }

    /**
     * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     * <p>
     * <p>
     * countX("xxhixx") → 4
     * countX("xhixhix") → 3
     * countX("hi") → 0
     */

    public int countX(String str) {

        // str has 0 chars
        if (str.length() == 0) {
            return 0;
        }

        // str has 1 char, and it is a lowercase 'x'
        if (str.length() == 1) {
            if (str.charAt(0) == 'x') {
                return 1;
            }
        }

        // str has 1 char, and it is not a lowercase 'x'
        if (str.length() == 1) {
            if (str.charAt(0) != 'x') {
                return 0;
            }
        }

        // str has more than 1 char, and the leftmost char is a lowercase 'x'
        if (str.length() > 1) {
            if (str.charAt(0) == 'x') {
                return 1 + countX(str.substring(1, str.length()));
            }
        }

        // str has more than 1 char, and the leftmost char is not a lowercase 'x'
        return 0 + countX(str.substring(1, str.length()));

    }

    /**
     * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
     * <p>
     * <p>
     * countHi("xxhixx") → 1
     * countHi("xhixhix") → 2
     * countHi("hi") → 1
     */

    // implementation 1:

    //public int countHi(String str) {
    //    // str has 0 chars or 1 char
    //    if (str.length() == 0 || str.length() == 1) {
    //        return 0;
    //    }
    //
    //    // str has 2 chars, and is exactly the same as "hi"
    //    if (str.length() == 2) {
    //        if (str.substring(0, str.length()).equals("hi") ) {
    //            return 1;
    //        }
    //    }
    //
    //    // str has 2 chars, and is not the same as "hi"
    //    if (str.length() == 2) {
    //        if ( !(  str.substring(0, str.length()).equals("hi") ) ) {
    //            return 0;
    //        }
    //    }
    //
    //    // str has more than 2 chars,
    //    // and its two leftmost chars is exactly the same as "hi"
    //    if (str.length() > 2 ) {
    //        if (str.substring(0, 2).equals("hi") ) {
    //            return 1 + countHi(str.substring(2, str.length()));
    //        }
    //    }
    //
    //
    //    // str has more than 2 chars,
    //    // and its two leftmost chars is not the same as "hi"
    //    return 0 + countHi(str.substring(1, str.length()));
    //}

    // implementation 2:
    public int countHi(String str) {
        // str has 0 chars or 1 char
        if (str.length() == 0 || str.length() == 1) {
            return 0;
        }

        // str has 2 or more chars,
        // and the two leftmost chars is exactly the same as "hi"
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2, str.length()));
        }

        // str has 2 or more chars,
        // and the two leftmost chars is not exactly the same as "hi"
        return 0 + countHi(str.substring(1, str.length()));
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
     * <p>
     * <p>
     * changeXY("codex") → "codey"
     * changeXY("xxhixx") → "yyhiyy"
     * changeXY("xhixhix") → "yhiyhiy"
     */

    // implementation 1:

    //public String changeXY(String str) {
    //
    //    // empty string
    //    if (str.length() == 0) {
    //        return str;
    //    }
    //
    //    // string is 'x'
    //    if ( (str.length() == 1) && str.equals("x") ) {
    //        return "y";
    //    }
    //
    //    // string consists of one char but is not 'x'
    //    if ( (str.length() == 1) && !(str.equals("x")) ) {
    //        return str;
    //    }
    //
    //    // string consists of more than one char and the leftmost char is 'x'
    //    if ( (str.length() > 1) && (str.substring(0, 1).equals("x")) ) {
    //        return "y" + changeXY(str.substring(1, str.length() ) );
    //    }
    //
    //    // string consists of more than one char and the leftmost char is not 'x'
    //    return str.substring(0, 1) + changeXY(str.substring(1, str.length() ) );
    //
    //}

    // implementation 2:
    public String changeXY(String str) {

        // empty string
        if (str.length() == 0) {
            return str;
        }

        // string consists of at least one char and the leftmost char is 'x'
        if (str.substring(0, 1).equals("x")) {
            return "y" + changeXY(str.substring(1, str.length()));
        }

        // string consists of at least one char and the leftmost char is not 'x'
        return str.substring(0, 1) + changeXY(str.substring(1, str.length()));

    }


    /**
     * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
     * <p>
     * <p>
     * changePi("xpix") → "x3.14x"
     * changePi("pipi") → "3.143.14"
     * changePi("pip") → "3.14p"
     */

    public String changePi(String str) {

        // str has 0 chars or 1 char
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        // str has 2 or more chars,
        // and the two leftmost chars is exactly the same as "pi"
        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2, str.length()));
        }

        // str has 2 or more chars,
        // and the two leftmost chars is not exactly the same as "pi"
        return str.substring(0, 1) + changePi(str.substring(1, str.length()));

    }

    /**
     * Given a string, compute recursively a new string where all the 'x' chars have been removed.
     * <p>
     * noX("xaxb") → "ab"
     * noX("abc") → "abc"
     * noX("xx") → ""
     */

    public String noX(String str) {

        // empty string
        if (str.length() == 0) {
            return str;
        }

        // string consists of at least one char and the leftmost char is 'x'
        if (str.substring(0, 1).equals("x")) {
            return noX(str.substring(1, str.length()));
        }

        // string consists of at least one char and the leftmost char is not 'x'
        return str.substring(0, 1) + noX(str.substring(1, str.length()));

    }

    /**
     * Given an array of ints, compute recursively if the array contains a 6.
     * We'll use the convention of considering only the part of the array that begins at the given index.
     * In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
     * <p>
     * <p>
     * array6([1, 6, 4], 0) → true
     * array6([1, 4], 0) → false
     * array6([6], 0) → true
     */

    public boolean array6(int[] nums, int index) {
        // empty array
        if (nums.length == 0) {
            return false;
        }

        // one or more element in nums[index...(nums.length - 1)] and leftmost element is not 6
        if (nums[index] != 6) {
            // make sure I don't go out of bounds
            if ((index) != (nums.length - 1)) {
                return array6(nums, index + 1);
            }
            // just checked the last element in nums[index...(nums.length - 1)]
            // and it is not 6
            return false;
        }

        // one or more element in array[index...(nums.length - 1)] and leftmost element is 6
        return true;
    }

    /**
     * Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
     * We'll use the convention of considering only the part of the array that begins at the given index.
     * In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
     * <p>
     * array11([1, 2, 11], 0) → 1
     * array11([11, 11], 0) → 2
     * array11([1, 2, 3, 4], 0) → 0
     */

    public int array11(int[] nums, int index) {
        // empty array
        if (nums.length == 0) {
            return 0;
        }


        if (nums[index] == 11) {
            if (index != (nums.length - 1)) {
                // nums[index] is equal to 11, and is not the last element in the array
                return 1 + array11(nums, index + 1);
            }
            // nums[index] is equal to 11, and is the last element in the array
            return 1;
        }


        if (nums[index] != 11) {
            if (index != (nums.length - 1)) {
                // nums[index] is not equal to 11, and is not the last element in the array
                return array11(nums, index + 1);
            }
        }
        // nums[index] is not equal to 11, and is the last element in the array
        return 0;
    }

    /**
     * Given an array of ints,
     * compute recursively if the array contains somewhere a value followed in the array by that value times 10.
     * We'll use the convention of considering only the part of the array that begins at the given index.
     * In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
     * <p>
     * array220([1, 2, 20], 0) → true
     * array220([3, 30], 0) → true
     * array220([1, 5, 8, 2, 6, 99, 88, 3, 30], 0) → true
     * array220([66, 77, 2, 888, 9, 1000, 22, 4, 30], 0) → false
     * array220([66, 77, 2, 888, 9, 1000, 22, 4, 30, 6], 0) → false
     * array220([3], 0) → false
     */

    public boolean array220(int[] nums, int index) {
        // empty array
        if (nums.length == 0) {
            return false;
        }


        if (index < (nums.length - 2)) {
            if (nums[index + 1] == nums[index] * 10) {
                // more than two elements in num[index...nums.length - 1] and num[index] is followed in the array
                // by num[index] * 10
                return true;
            }
            // more than two elements in num[index...nums.length - 1] and num[index] is not followed in the array
            // by num[index] * 10
            return array220(nums, index + 1);
        }

        if (index == (nums.length - 2)) {
            if (nums[index + 1] == nums[index] * 10) {
                // two elements in num[index...nums.length - 1] and num[index] is followed in the array
                // by num[index] * 10
                return true;
            }
        }

        // two elements in num[index...nums.length - 1] and num[index] is not in the array
        // by num[index] * 10
        return false;
    }

    /**
     * Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
     * <p>
     * <p>
     * allStar("hello") → "h*e*l*l*o"
     * allStar("abc") → "a*b*c"
     * allStar("ab") → "a*b"
     */
    public String allStar(String str) {
        // empty string, or string contains one element
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        return str.substring(0, 1) + "*" + allStar(str.substring(1));
    }

    /**
     * Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
     * <p>
     * <p>
     * pairStar("hello") → "hel*lo"
     * pairStar("xxyy") → "x*xy*y"
     * pairStar("aaaa") → "a*a*a*a"
     * pairStar("aa") → "a*a"
     */

    public String pairStar(String str) {
        // empty string, or string contains one element
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        // string contains more than one element, and the element at index 0 is identical to the element at index 1
        if (str.substring(0, 1).equals(str.substring(1, 2))) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        // string contains more than one element, and the element at index 0 is not identical to the element at index 1
        return str.charAt(0) + pairStar(str.substring(1));
    }

    /**
     *
     * Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
     *
     * endX("xxre") → "rexx"
     * endX("xxhixx") → "hixxxx"
     * endX("xhixhix") → "hihixxx"
     * endX("xre") → "rex"
     *
     */

    public String endX(String str) {
        // empty string or string containing one element
        if (str.length() <= 1) {
            return str;
        }

        // two or more elements, leftmost is x
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1, str.length())) + "x";
        }

        // two or more elements, leftmost is not x
        return str.charAt(0) + endX(str.substring(1, str.length()));
    }

    /**
     *
     * We'll say that a "pair" in a string is two instances of a char separated by a char.
     * So "AxA" the A's make a pair.
     * Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
     * Recursively compute the number of pairs in the given string.
     *
     * countPairs("axa") → 1
     * countPairs("axax") → 2
     * countPairs("axbx") → 1
     *
     *
     *
     * */

    public int countPairs(String str) {
        // empty string, string contains one element, or string contains two elements
        if (str.length() <= 2) {
            return 0;
        }
        // three or more elements. str[0] and str[2] are the same
        if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1, str.length()));
        }
        // three or more elements. str[0] and str[2] are different
        return countPairs(str.substring(1, str.length()));
    }

    /**
     *
     * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
     *
     *
     * countAbc("abc") → 1
     * countAbc("abcxxabc") → 2
     * countAbc("abaxxaba") → 2
     *
    * */

    public int countAbc(String str) {
//        // empty string, string contains one element, or string contains two elements
//        if (str.length() <= 2) {
//            return 0;
//        }
//        // three or more elements, where str.substring(0, 3) is either "abc" or "aba"
//        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
//            return 1 + countAbc(str.substring(2, str.length()));
//        }
//        // three or more elements, where str.substring(0, 3) is neither "abc" nor "aba"
//        return countAbc(str.substring(1, str.length()));

        // alternative solution

        // empty string, string contains one element, or string contains two elements
        if (str.length() <= 2) {
            return 0;
        }

        if (str.substring(0, 3).equals("abc") ) {
            // three or more elements, where str.substring(0, 3) is "abc"
            return 1 + countAbc(str.substring(3, str.length()));
        }

        if ( str.substring(0, 3).equals("aba") ) {
            // three or more elements, where str.substring(0, 3) is "aba"
            return 1 + countAbc(str.substring(2, str.length()));
        }

        // three or more elements, where str.substring(0, 3) is neither "abc" nor "aba"
        return countAbc(str.substring(1, str.length()));
    }

    /**
     *
     * Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.
     *
     *
     * count11("11abc11") → 2
     * count11("abc11x11x11") → 3
     * count11("111") → 1
     *
    * */

    public int count11(String str) {
        // empty string or string contains 1 element
        if (str.length() <= 1) {
            return 0;
        }

        // two or more elements, where str.substring(0, 1) is "11"
        if (str.substring(0, 2).equals("11")) {
            return 1 + count11(str.substring(2, str.length()));
        }

        // two or more elements, where str.substring(0, 1) is not "11"
        return count11(str.substring(1, str.length()));
    }

    /**
     *
     * Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
     *
     *
     * stringClean("yyzzza") → "yza"
     * stringClean("abbbcdd") → "abcd"
     * stringClean("Hello") → "Helo"
     *
    * */

    public String stringClean(String str) {
        // empty string or string contains 1 element
        if (str.length() <= 1) {
            return str;
        }

        // one or more elements, where str[0] is the same as str[1]
        if (str.substring(0, 1).equals(str.substring(1, 2))) {
            return stringClean(str.substring(1, str.length()));
        }

        // one or more elements, where str[0] is not the same as str[1]
        return str.substring(0, 1) + stringClean(str.substring(1, str.length()));
    }

    /**
     *
     * Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.
     *
     *
     * countHi2("ahixhi") → 1
     * countHi2("ahibhi") → 2
     * countHi2("xhixhi") → 0
     *
    * */

    public int countHi2(String str) {
        // empty string or string contains 1 element
        if (str.length() <= 1) {
            return 0;
        }

        // two or more elements, where str.substring(0, 2) is "xh"
        if (str.substring(0, 2).equals("xh")) {
            return countHi2(str.substring(2, str.length()));
        }

        // two or more elements, where str.substring(0, 2) is "hi"
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2, str.length()));
        }

        // two or more elements, where str.substring(0, 2) is neither"xh" nor "hi"
        return countHi2(str.substring(1, str.length()));
    }

    /**
     *
     * Given a string that contains a single pair of parenthesis,
     * compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
     *
     * parenBit("xyz(abc)123") → "(abc)"
     * parenBit("x(hello)") → "(hello)"
     * parenBit("(xy)1") → "(xy)"
     *
     *
     * */

    public String parenBit(String str) {
        // string contains one or less elements
        if (str.length() <= 1) {
            return str;
        }

        // string contains two or more elements and is equivalent to "()"
        if (str.substring(0, 2).equals("()")) {
            return str;
        }

        if (str.charAt(0) == '(') {
            return "(" + str.substring(1, str.indexOf(")")) + ")";
        }

        // string contains two or more elements and str.substring(0, 1) is not "("
        return parenBit(str.substring(1, str.length()));
    }

    /**
     *
     * Given a string,
     * return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
     * Suggestion: check the first and last chars, and then recur on what's inside them.
     *
     * nestParen("(())") → true
     * nestParen("((()))") → true
     * nestParen("(((x))") → false
     *
     * */

    public boolean nestParen(String str) {


        // solution 1:

//        if (str.length() <= 1) {
//            if (str.contains("(") || str.contains(")")) {
//                // str consists of only one element, which is either '(' or ')'
//                return false;
//            }
//            // str consists of only one element, which is neither '(' nor ')'
//            return true;
//        }
//
//        if (str.length() >= 2) {
//            if (str.charAt(0) != '(' || str.charAt(str.length() - 1) != ')') {
//                // string contains two or more elements, where either the leftmost element isn't '(' or the rightmost element isn't ')'
//                return false;
//            }
//        }
//
//        // string contains two or more elements, where the leftmost element is '(' and rightmost element is ')'
//        if ( str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')' ) {
//            return nestParen(str.substring(1, str.length() - 1));
//        }
//
//        // string consists of elements other than '(' or ')'. Note that if the flow of execution makes it to this point in the function,
//        // it means that the parentheses are nested correctly
//        return true;

        // solution 2:
//        if (str.length() >= 2) {
//            if ( str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')' ) {
//                // string contains two or more elements, where the leftmost element is '(' and rightmost element is ')'
//                return nestParen(str.substring(1, str.length() - 1));
//            }
//                // string contains two or more elements, where either the leftmost element isn't '(' or the rightmost element isn't ')'
//                return false;
//        }
//
//            if (str.contains("(") || str.contains(")")) {
//                // str consists of only one element, which is either '(' or ')'
//                return false;
//            }
//            // str consists of only one element, which is neither '(' nor ')'
//            return true;


        // solution 3:
        if (str.length() <= 1) {
            if (!(str.contains("(") || str.contains(")"))) {
                // str consists of only one element, which is neither '(' nor ')'
                return true;
            }
            // str is either empty or it consists of only one element - which is either '(' or ')'
            return false;
        }
        if ( str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')' ) {
            // string contains two or more elements, where the leftmost element is '(' and rightmost element is ')'
            return nestParen(str.substring(1, str.length() - 1));
        }
        // string contains two or more elements, where either the leftmost element isn't '(' or the rightmost element isn't ')'
        return false;
    }

    /**
     *
     * Given a string and a non-empty substring sub,
     * compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
     *
     * strCount("catcowcat", "cat") → 2
     * strCount("catcowcat", "cow") → 1
     * strCount("catcowcat", "dog") → 0
     *
     *
     * */

    public int strCount(String str, String sub) {
        if (str.length() == 0 || str.length() < sub.length()) {
            // empty string, or string length less than substring length
            return 0;
        }
        if (str.contains(sub)) {
            if (str.length() > sub.length()) {
                // string contains substring and there might be more subs in the string
                return 1 + strCount( str.substring(str.indexOf(sub) + sub.length()), sub );
            }
            // string contains substring and there can't be more subs in the string because the string and the substring are identical
            return 1;
        }
        // string doesn't contain substring
        return 0;
    }

    /**
     *
     * Given a string and a non-empty substring sub,
     * compute recursively if at least n copies of sub appear in the string somewhere,
     * possibly with overlapping. N will be non-negative.
     *
     *
     * strCopies("catcowcat", "cat", 2) → true
     * strCopies("catcowcat", "cow", 2) → false
     * strCopies("catcowcat", "cow", 1) → true
     *
     *
     * */

    public boolean strCopies(String str, String sub, int n) {
        // solution 1:
//        if (n == 0) {
//            return true;
//        }
//
//        if (str.length() >= sub.length()) {
//            if (str.substring(0, sub.length()).equals(sub)) {
//                    return strCopies(str.substring(1), sub, n-1);
//            }
//        } else {
//            return false;
//        }
//
//        return strCopies(str.substring(1), sub, n);

        // solution 2:

//        if (n == 0) {
//            return true;
//        }
//
//        if (str.length() >= sub.length()) {
//            if (str.substring(0, sub.length()).equals(sub)) {
//                return strCopies(str.substring(1), sub, n - 1);
//            }
//            return strCopies(str.substring(1), sub, n);
//        }
//
//        return false;

        // solution 3:

//        if ((str.length() >= sub.length()) && (n > 0)) {
//            if (str.substring(0, sub.length()).equals(sub)) {
//                return strCopies(str.substring(1), sub, n - 1);
//            }
//            return strCopies(str.substring(1), sub, n);
//        }
//
//        if ((str.length() < sub.length()) && (n > 0)) {
//            return false;
//        }
//
//        return true;

        // solution 4:
//        if( n > 0 ) {
//            if ((str.length() >= sub.length()) ) {
//                if (str.substring(0, sub.length()).equals(sub)) {
//                    return strCopies(str.substring(1), sub, n - 1);
//                }
//                return strCopies(str.substring(1), sub, n);
//            }
//
//                return false;
//        }
//
//        return true;

        // solution 5:

//        if (n == 0) {
//            return true;
//        }
//        int len = sub.length();
//        if (str.length() < len) {
//            return false;
//        }
//
//        if (str.substring(0, len).equals(sub)) {
//            // Found it, so subtract 1 from n in the recursion
//            return strCopies(str.substring(1), sub, n-1);
//        } else {
//            return strCopies(str.substring(1), sub, n);
//        }

        // solution 6:

        if (n == 0) {
            return true;
        }

        if (str.length() < sub.length()) {
            return false;
        }

        if (str.substring(0, sub.length()).equals(sub)) {
            // Found it, so subtract 1 from n in the recursion
            return strCopies(str.substring(1), sub, n-1);
        } else {
            return strCopies(str.substring(1), sub, n);
        }

    }

    /**
     *
     * Given a string and a non-empty substring sub,
     * compute recursively the largest substring which starts and ends with sub and return its length.
     *
     * strDist("catcowcat", "cat") → 9
     * strDist("catcowcat", "cow") → 3
     * strDist("cccatcowcatxx", "cat") → 9
     *
     *
     * */

    public int strDist(String str, String sub) {

        if ( !(str.contains(sub)) ||  str.length() == 0) {
            return 0;
        }

        if ( !( str.substring(0, sub.length()).equals(sub) ) ) {
            return strDist(str.substring(1), sub);
        }

        // if the execution flow makes it to this point, it means that str.substring(0, sub.length()).equals(sub)

        // leftmost index of the first occurence of sub
        int firstOcc = str.indexOf(sub, 0);

        // leftmost index of the last occurence of sub
        int lastOcc = str.lastIndexOf(sub, str.length() - 1);

        if (firstOcc == lastOcc) {
            // sub only appears once in str
            return sub.length();
        } else {
            if ( (firstOcc + sub.length()) - 1 < lastOcc) {                   // alternatively, this condition can be expressed as firstOcc + sub.length() <= lastOcc
                // sub appears more than once in str,
                // and there is no overlap in the largest substring that starts and ends with sub

                // str.substring(firstOcc + sub.length(), lastOcc).length()
                // returns the length of the string that is
                // between the character that is immediately to the right of the first occurrence's last character
                // and the character that is immediately to the left of the last occurrence's first character, INCLUSIVE
                // ie: str.substring(firstOcc + sub.length(), lastOcc).length()
                // returns str[((firstOcc + sub.length()) - 1) + 1, lastOcc - 1]

                return str.substring( ((firstOcc + sub.length()) - 1) + 1, lastOcc).length()
                        + str.substring(firstOcc, firstOcc + sub.length()).length()
                        + str.substring(lastOcc, lastOcc + sub.length()).length();
            } else {
                // sub appears more than once in str,
                // and there is overlap in the largest substring that starts and ends with sub
                return str.substring( firstOcc, lastOcc + sub.length() ).length();
            }
        }

    }

}
