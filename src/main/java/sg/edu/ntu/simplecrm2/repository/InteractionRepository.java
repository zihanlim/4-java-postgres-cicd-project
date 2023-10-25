package sg.edu.ntu.simplecrm2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.ntu.simplecrm2.entity.Interaction;

public interface InteractionRepository extends JpaRepository<Interaction, Long> {

}
