package org.fnac.yams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
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
            case 3:
                return BRELAN;
        }
        if(faceCount.values().stream().filter(f->f==2L).count()==2L){
            return DOUBLE_PAIRE;
        }
        if (max == 2){
            return PAIRE;
        }

        return SIMPLE;
    }
}