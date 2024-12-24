package School;

import java.util.ArrayList;
    public class School {
        ArrayList<Person> persons = new ArrayList<>();

        public void addMember(Person person)
        {
            persons.add(person);
        }


        @Override
        public String toString()
        {
            String text = "";
            for(Person person : persons)
            {
                text += person.toString() +"\n";
            }
            return text;
        }
}
