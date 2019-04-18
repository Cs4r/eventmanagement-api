package cs4r.labs.eventmanagementapi.repos;

import cs4r.labs.eventmanagementapi.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
