package virtualmethod.grammar;

import java.util.List;

public class Grammar {

    public static void main(String[] args) {
        List<Verb> verbs = List.of(
                new PhrasalVerb("alá", "tesz"),
                new PhrasalVerbWithSuffix("alá", "tet", "tem")
        );
        List<Preposition> prepositions = List.of(
                new PhrasalVerb("alá", "tesz"),
                new PhrasalVerbWithSuffix("alá", "tet", "tem")
        );
        List<PhrasalVerb> phrasalVerbs = List.of(
                new PhrasalVerb("alá", "tesz"),
                new PhrasalVerbWithSuffix("alá", "tet", "tem")
        );
        List<Suffix> suffixes = List.of(
                new PhrasalVerbWithSuffix("alá", "tet", "tem")
        );
        List<PhrasalVerbWithSuffix> phrasalVerbsWithSuffixes = List.of(
                new PhrasalVerbWithSuffix("alá", "tet", "tem")
        );

        for (Verb verb : verbs) {
            System.out.println();
            System.out.println(verb.getWord());
        }

        for (Preposition preposition : prepositions) {
            System.out.println();
            System.out.println(preposition.getPreposition());
            System.out.println(preposition.getWholeWord());
        }

        for (PhrasalVerb phrasalVerb : phrasalVerbs) {
            System.out.println();
            System.out.println(phrasalVerb.getPreposition());
            System.out.println(phrasalVerb.getWord());
            System.out.println(phrasalVerb.getWholeWord());
        }

        for (Suffix suffix : suffixes) {
            System.out.println();
            System.out.println(suffix.getSuffix());
        }

        for (PhrasalVerbWithSuffix phrasalVerbWithSuffix : phrasalVerbsWithSuffixes) {
            System.out.println();
            System.out.println(phrasalVerbWithSuffix.getPreposition());
            System.out.println(phrasalVerbWithSuffix.getWord());
            System.out.println(phrasalVerbWithSuffix.getSuffix());
            System.out.println(phrasalVerbWithSuffix.getWholeWord());
        }
    }
}
