class ReverseString {

    String reverse(String inputString) {
        StringBuilder string = new StringBuilder(inputString);
        string.reverse();
        return string.toString();
    }
  
}
