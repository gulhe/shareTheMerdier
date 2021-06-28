package org.fnac.yams;

import java.util.*;
import java.util.stream.Collectors;

import static org.fnac.yams.Combination.*;

public class CombinationResolver {
    public Combination bestCombination(List<Integer> roll) {
        Map<Integer, Long> faceCount = roll
                .stream()
                .collect( //il y a plus simple mais entre toutes les galères là je le retrouve plus de tête alors je sors un truc qui marche mais sale désolé
                        Collectors.groupingBy(
                                x -> x,
                                Collectors.counting()
                        ));
        Integer max = Math.toIntExact(faceCount
                .values()
                .stream()
                .max(Long::compare)
                .orElse(1L));

        switch (max) {
            case 5:
                return YAM;
            case 4:
                return CARRÉ;
        }

        if (new HashSet<>(faceCount.values()).equals(Set.of(2L, 3L))) {
            return FULL;
        }

        if (max == 3) {
            return BRELAN;
        }

        if(faceCount.values().stream().filter(f->f==2L).count()==2L){
            return DOUBLE_PAIRE;
        }
        if (max == 2){
            return PAIRE;
        }

        if (roll.containsAll(Set.of(2,3,4,5))){ //on a 5 dice roll the only two possible combinations are 1,2,3,4,5 and 2,3,4,5,6 which are the only possible combinations containing this 2,3,4,5 and both contain it ... so ... that's that
            return SUITE;
        }

        return SIMPLE;
    }
}
