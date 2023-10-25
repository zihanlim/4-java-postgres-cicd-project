package sg.edu.ntu.simplecrm2.exception;

public class InteractionNotFoundException extends RuntimeException {
  public InteractionNotFoundException(Long id) {
    super("Could not find interaction " + id);
  }

}
