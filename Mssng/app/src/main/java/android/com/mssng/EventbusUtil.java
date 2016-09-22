package android.com.mssng;

import android.com.mssng.domain.Person;

/**
 * Created by kevintan on 22/09/2016.
 */

public class EventBusUtil {
    public static class PersonDetailEvent {
        private Person person;

        public PersonDetailEvent(Person person) {
            this.person = person;
        }

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }
    }
}
