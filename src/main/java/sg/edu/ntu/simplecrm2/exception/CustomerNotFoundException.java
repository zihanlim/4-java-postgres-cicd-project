package sg.edu.ntu.simplecrm2.exception;

public class CustomerNotFoundException extends RuntimeException {
  public CustomerNotFoundException(Long id) {
    super("Could not find customer " + id);
  }

}
