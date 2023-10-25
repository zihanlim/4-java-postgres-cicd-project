package sg.edu.ntu.simplecrm2.service;

import java.util.List;

import sg.edu.ntu.simplecrm2.entity.Interaction;

public interface InteractionService {

  Interaction saveInteraction(Interaction interaction);

  Interaction getInteraction(Long id);

  List<Interaction> getAllInteractions();

  Interaction updateInteraction(Long id, Interaction interaction);

  void deleteInteraction(Long id);

}
