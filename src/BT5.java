import java.util.List;
import java.util.Optional;

public class BT5 {
    public static void main(String[] args) {
        List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList = List.of(10, 10, 10);

        findSecondLargest(normalList).ifPresentOrElse(
                num -> System.out.println("Số lớn thứ hai: " + num),
                () -> System.out.println("Không tìm thấy số lớn thứ hai")
        );

        findSecondLargest(singleElementList).ifPresentOrElse(
                num -> System.out.println("Số lớn thứ hai: " + num),
                () -> System.out.println("Không tìm thấy số lớn thứ hai")
        );

        findSecondLargest(allSameList).ifPresentOrElse(
                num -> System.out.println("Số lớn thứ hai: " + num),
                () -> System.out.println("Không tìm thấy số lớn thứ hai")
        );
    }

    public static Optional<Integer> findSecondLargest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst();
    }
}
