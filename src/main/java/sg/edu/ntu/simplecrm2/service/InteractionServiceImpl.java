package sg.edu.ntu.simplecrm2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sg.edu.ntu.simplecrm2.entity.Interaction;
import sg.edu.ntu.simplecrm2.exception.InteractionNotFoundException;
import sg.edu.ntu.simplecrm2.repository.InteractionRepository;

@Service
@AllArgsConstructor
public class InteractionServiceImpl implements InteractionService {

  private InteractionRepository interactionRepository;

  @Override
  public Interaction saveInteraction(Interaction interaction) {
    return interactionRepository.save(interaction);
  }

  @Override
  public Interaction getInteraction(Long id) {
    return interactionRepository.findById(id).orElseThrow(() -> new InteractionNotFoundException(id));
  }

  @Override
  public List<Interaction> getAllInteractions() {
    return interactionRepository.findAll();
  }

  @Override
  public Interaction updateInteraction(Long id, Interaction interaction) {
    // Load the interaction
    Interaction interactionToUpdate = interactionRepository.findById(id)
        .orElseThrow(() -> new InteractionNotFoundException(id));
    interactionToUpdate.setRemarks(interaction.getRemarks());
    interactionToUpdate.setInteractionDate(interaction.getInteractionDate());
    return interactionRepository.save(interactionToUpdate);
  }

  @Override
  public void deleteInteraction(Long id) {
    interactionRepository.deleteById(id);
  }

}
