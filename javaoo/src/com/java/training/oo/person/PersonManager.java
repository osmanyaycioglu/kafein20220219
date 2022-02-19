package com.java.training.oo.person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonManager {

    private Map<String /*username*/, Person> personMap = new HashMap<>();

    public PersonManager() {
    }

    public void refresh(final List<Person> personList) {
        Map<String, Person> personMapLoc = new HashMap<>();
        for (Person personLoc : personList) {
            personMapLoc.put(personLoc.getUsername(),
                             personLoc);
        }
        this.personMap = personMapLoc;
    }

    public Person login(final String username,
                        final String password) throws PersonAppException {
        Person personLoc = this.personMap.get(username);
        if (personLoc == null) {
            throw new PersonAppException("Böyle bir user yok : " + username);
        }
        if (!personLoc.getPassword()
                      .equals(password)) {
            throw new PersonAppException("user password problemi : " + username);
        }
        return personLoc;
    }

}
