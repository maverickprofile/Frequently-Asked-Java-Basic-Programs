public class DuplicateElementsInArray {
    public static void main(String[] args) {
        //finding the duplicates elements in the array

        /*
        Algorithm:
        1. first go through the given array
        2. now, from taking each element check whether the element is repeating in the array. this can be outer loop
        3. for that you need to create an inner loop, that takes the next element of the selected from the outer loop
        4. after searching through each element make an if condition that
                if a[outer] == a[inner]
                     then print the a[element]
         5. otherwise, return "Not Found Element"
         */

        //create an Array
        String[] arr = {"Java", "C", "C++", "Python", "Java"};


        boolean flag = false;
        //create the outer loop
        for (int i = 0; i < arr.length; i++) {
                //create inner loop
                for (int j = i+1; j<arr.length; j++){

                    //check the condition whether the outer loop element is equals to inner element
                    if (arr[i].equals(arr[j])){
                        System.out.println(arr[i]);
                        flag = true;
                    }

                }
        }

        if (!flag){
            System.out.println("No Duplicate Found");
        }
    }
}
