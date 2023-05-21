public class InvalidEmailAddressException extends Throwable {
    public InvalidEmailAddressException(String email,String msg){
        System.out.println("Error: invalid email address,"+ msg+"  ("+email+")");
    }
}
