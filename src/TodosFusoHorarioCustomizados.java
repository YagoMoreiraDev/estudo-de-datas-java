import java.time.ZoneId;

public class TodosFusoHorarioCustomizados {
    public static void main(String[] args) {
        for (String fuso : ZoneId.getAvailableZoneIds()) {
            System.out.println(fuso);
        }
    }
}
