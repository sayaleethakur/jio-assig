public class Password {
 
    // whether a password is valid or not
    public static boolean isValid(String password)
    {
 
        // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 8)
              && (password.length() <= 15))) {
            return false;
        }
 
        // to check space
        if (password.contains(" ")) {
            return false;
        }
        if (true) {
            int count = 0;
 
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
 
                // to convert int to string
                String str1 = Integer.toString(i);
 
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
 
         if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("|"))) {
            return false;
        }
 
        if (true) {
            int count = 0;
 
            // checking capital letters
            for (int i = 65; i <= 90; i++) {
 
                // type casting
                char c = (char)i;
 
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
 
        if (true) {
            int count = 0;
 
            // checking small letters
            for (int i = 97; i <= 122; i++) {
 
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
 
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
 
        // if all conditions fails
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        String password1 = "Sayalee$1";
 
        if (isValid(password1)) {
            System.out.println(password1 + " - Valid Password");
        }
        else {
            System.out.println(password1 + " - Invalid Password!");
        }
 
        String password2 = "SAYALEE1%";
        if (isValid(password2)) {
            System.out.println(password2 + " - Valid Password");
        }
        else {
            System.out.println(password2 + " - Invalid Password!");
        }
    }
}
