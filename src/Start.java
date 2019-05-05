import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Start {

    public static void main(String[] args) {

        List<JuniorJava> juniorJavas = add();

        List<SeniorJava> senior = CheckSenior(juniorJavas);

        senior.forEach(sen -> {
            System.out.println(sen);
        });

    }

    private static List<JuniorJava> add() {
        List<JuniorJava> juniorJavas = new ArrayList<>();

        juniorJavas.add(new JuniorJava("Bassam", new BigDecimal(32000), 2));
        juniorJavas.add(new JuniorJava("Adam", new BigDecimal(32000), 4));
        juniorJavas.add(new JuniorJava("Mattias", new BigDecimal(32000), 6));
        juniorJavas.add(new JuniorJava("Jimy", new BigDecimal(32000), 7));

        return juniorJavas;
    }

    private static List<SeniorJava> CheckSenior(List<JuniorJava> juniorJavas) {

        return juniorJavas.stream().filter(junior -> junior.getYearsOfExperience() > 5).map(junior -> {
            SeniorJava seniorJava = new SeniorJava();
            seniorJava.setName(junior.getName());
            seniorJava.setSalary(junior.getSalary().add(new BigDecimal(5000)));

            return seniorJava;
        }).collect(Collectors.toList());

    }

}
