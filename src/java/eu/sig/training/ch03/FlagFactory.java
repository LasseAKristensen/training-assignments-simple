package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FlagFactory {

    /* SECOND METHOD: REPLACE CONDITIONAL WITH POLYMORPHISM pattern */
    // morte code, but having each flag as an object is easier to extend
    public interface Flag {
        List<Color> getColors();
    }
    
    public class DutchFlag implements Flag {
        public List<Color> getColors() {
            return Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
        }
    }
    public class ItalianFlag implements Flag {
        public List<Color> getColors() {
            return Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
        }
    }
    public class DefaultFlag implements Flag {
        public List<Color> getColors() {
            return Arrays.asList(Color.GRAY);
        }
    }
    
    private static final Map<Nationality, Flag> FLAGS = new HashMap<Nationality, Flag>();
    
    public FlagFactory(){
        FLAGS.put(Nationality.DUTCH, new DutchFlag());
        FLAGS.put(Nationality.ITALIAN, new ItalianFlag());   
    }
    
    public List<Color> getFlagColors(Nationality nationality){
        Flag flag = FLAGS.get(nationality);
        flag = flag != null ? flag : new DefaultFlag();
        return flag.getColors();
    }
    
    
    
    /* FIRST METHOD: REFACTORING
    private static Map<Nationality, List<Color>> FLAGS =
            new HashMap<Nationality, List<Color>>();
    
    static {
        FLAGS.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        FLAGS.put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        FLAGS.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        FLAGS.put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        FLAGS.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
    }
    
    public List<Color> getFlagColors(Nationality nationality){
        List<Color> colors = FLAGS.get(nationality);
        return colors != null ? colors : Arrays.asList(Color.GRAY);
    }
    */
    
    
    /*  ORIGINAL
    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result;
        switch (nationality) {
        case DUTCH:
            result = Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
            break;
        case GERMAN:
            result = Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
            break;
        case BELGIAN:
            result = Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
            break;
        case FRENCH:
            result = Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
            break;
        case ITALIAN:
            result = Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
            break;
        case ROMANIA:
            result = Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED);
            break;
        case IRELAND:
            result = Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
            break;
        case HUNGARIAN:
            result = Arrays.asList(Color.RED, Color.WHITE, Color.GREEN);
            break;
        case BULGARIAN:
            result = Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
            break;
        case RUSSIA:
            result = Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);
            break;
        case UNCLASSIFIED:
        default:
            result = Arrays.asList(Color.GRAY);
            break;
        }
        return result;
    }
    // end::getFlag[]
    */
}