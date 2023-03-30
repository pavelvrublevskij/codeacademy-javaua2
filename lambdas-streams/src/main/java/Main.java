import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main (String[] args) {
        System.out.println("HEY");


        CodeAcademyI codeAcademyI = new CodeAcademyI() {
            @Override
            public void study(Integer time) {
                System.out.println("Time" + time);
            }

            @Override
            public void haveBreak(Integer time) {
                System.out.println("Break" + time);
            }
        };

        CodeAcademyFunctional codeAcademyFunctional = new CodeAcademyFunctional() {
            @Override
            public String method(String word) {
                return word.toUpperCase();
            }
        };

        CodeAcademyFunctional codeAcademyFunctionalLambda = (word) -> {
           return word.toUpperCase();
        };

        CodeAcademyTwoParametersI codeAcademyTwoParametersI = (word1, word2) -> System.out.println(word1 + word2);

        codeAcademyTwoParametersI.print("1", "2");

        String zalgiris1 = codeAcademyFunctional.method("zalgiris");
        String zalgiris2 = codeAcademyFunctionalLambda.method("zalgiris");

        Consumer<String> print = x -> System.out.println(x);
        print.accept("Zalgiris laimes");

        Consumer<Integer> square = (x) -> System.out.println(x*x);
        square.accept(5);

        Supplier<String> randomUUID = () -> UUID.randomUUID().toString();
        System.out.println(randomUUID.get());

        Predicate<Integer> isBiggerThanFive = (number) -> number > 5;
        System.out.println(isBiggerThanFive.test(10));

        Function<Integer, Integer> doubleNumber = (number) -> number * 2;
        Integer number = doubleNumber.apply(10);

        Student student = new Student("Vytautas", "Kalinauskas", 2, Gender.MALE);

        Consumer<Student> printStudentName = (student1) -> System.out.println(student1.getName());
        printStudentName.accept(student);

        Supplier<Student> createStudent = () -> new Student("Mindaugas", "Birutis", 3, Gender.FEMALE);
        Student mindaugas = createStudent.get();

        List<Student> group = new ArrayList<>(Arrays.asList(mindaugas, student));
        Map<Gender, List<Student>> maps = group.stream().collect(Collectors.groupingBy(student1 -> student1.getGender()));

        Predicate<Student> isHigherThan2ndCourse = (student2) -> student2.getCourse() > 2;
        System.out.println("Is Vytautas course higher than 2? " + isHigherThan2ndCourse.test(student));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(6,9,10,4,4,15,90,3));
        ArrayList<Integer> numbersHigherThanFive = numbersHigherThanFive(numbers);

        List<String> list = new ArrayList<>();
        list.stream()
                .map((text) -> text.toUpperCase());

            numbers =
                numbers
                .stream()
                .filter((tempNumber) -> tempNumber > 5)
                .filter((tempNumber) -> tempNumber / 2 == 0)
                .collect(Collectors.toList());

        List<String> words = new ArrayList<>(Arrays.asList("Zalgiris", "Saule", "Alus", "Sestadienis", "Pienas", "Duona"));

        Student goodStudent = new Student("Petras", "Grazulis", 3, Gender.MALE);
        Student badStudent = new Student("Karolis", "Blogietis", 4, Gender.MALE);
        List<Student> studentGroup = new ArrayList<>(Arrays.asList(goodStudent, badStudent));


        /* map with strings example */
         words
                 .stream()
                 .map(word -> word.toUpperCase())
                 .forEach(word -> System.out.println(word));

         /* map with objects example */
         studentGroup
                 .stream()
                 .map(student1 -> student1.getName() + " " + student1.getSurname())
                 .forEach(student1 -> System.out.println(student1));




    }


    static ArrayList<Integer> numbersHigherThanFive(List<Integer> numbers) {

        ArrayList<Integer> numbersHigherThanFive = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > 5) {
                numbersHigherThanFive.add(numbers.get(i));
            }
        }
        return numbersHigherThanFive;
    }


}
