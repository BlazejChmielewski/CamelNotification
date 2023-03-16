import java.util.Arrays;
import java.util.stream.Collectors;


class Solution {

    public static void main(String[] args) {
        String str = "the-stealth-warrior";

        String[] strArr = str.split("[\\W|_]");
        System.out.println(strArr[0] + Arrays.stream(strArr, 1, strArr.length).
                map(n -> n.substring(0, 1).toUpperCase() + n.substring(1))
                .collect(Collectors.joining("")));

        //OUTPUT: theStealthWarrior

    }
}