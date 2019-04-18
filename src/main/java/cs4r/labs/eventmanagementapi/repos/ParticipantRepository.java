package cs4r.labs.eventmanagementapi.repos;

import cs4r.labs.eventmanagementapi.entities.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
