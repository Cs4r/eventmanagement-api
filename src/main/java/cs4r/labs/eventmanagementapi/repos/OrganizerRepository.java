package cs4r.labs.eventmanagementapi.repos;

import cs4r.labs.eventmanagementapi.entities.Organizer;
import org.springframework.data.repository.CrudRepository;

public interface OrganizerRepository extends CrudRepository<Organizer, Long> {
}
