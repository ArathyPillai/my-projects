package alpha19.logic;

import alpha19.logic.dto.exception.VotingException;
import alpha19.persistence.entities.Organizer;
import java.util.Date;

public interface SystemLogic {

    Organizer createOrUpdateOrganizer(String email, String firstName, String lastName) throws VotingException;

    void sendReminderEmail(String toEmail, Date startDate, Date endDate, String token, String pollTitle, Integer numOfParticipants) throws VotingException;
    
    void handleNotifications();
    
    void handlePollStates();
}
