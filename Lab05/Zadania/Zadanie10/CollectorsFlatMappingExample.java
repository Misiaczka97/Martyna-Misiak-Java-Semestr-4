import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsFlatMappingExample {
    static class Item {
        String category;
        Optional<String> detail;

        Item(String category, Optional<String> detail) {
            this.category = category;
            this.detail = detail;
        }

        public String getCategory() {
            return category;
        }

        public Optional<String> getDetail() {
            return detail;
        }
    }

    public static void main(String[] args) {
        List<Item> items = List.of(
            new Item("Fruit", Optional.of("Apple")),
            new Item("Fruit", Optional.empty()),
            new Item("Vegetable", Optional.of("Carrot")),
            new Item("Vegetable", Optional.of("Broccoli")),
            new Item("Vegetable", Optional.empty())
        );

        Map<String, List<String>> groupedDetails = items.stream()
            .collect(Collectors.groupingBy(
                Item::getCategory,
                Collectors.flatMapping(
                    item -> item.getDetail().stream(),
                    Collectors.toList()
                )
            ));

        groupedDetails.forEach((category, details) -> 
            System.out.println(category + ": " + details)
        );
    }
}
