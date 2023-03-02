package exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//import java.util.ArrayList;
//import java.util.Map.Entry;

// BEGIN
class App {
    public static void main(String[] args) {
//        List<Map<String, String>> BOOKS = List.of(
//                Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611"),
//                Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111"),
//                Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611"),
//                Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222"),
//                Map.of("title", "Still foooing", "author", "FooBar", "year", "3333"),
//                Map.of("title", "Happy Foo", "author", "FooBar", "year", "4444"));
//        Map<String, String> where = Map.of("author", "Shakespeare", "year", "1611");
//        System.out.println(findWhere(BOOKS, where));
    }

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> bookFilter) {
        List<Map<String, String>> result = new LinkedList<>();
        for (Map<String, String> book: books) {
            if (areBooksFit(bookFilter, book)) {
                result.add(book);
            }
        }
        return result;
    }

    private static boolean areBooksFit(Map<String, String> book1Filter, Map<String, String> book2) {
        for (Map.Entry<String, String> param: book1Filter.entrySet()) {
            if (!book2.get(param.getKey()).equals(param.getValue())) {
                return false;
            }
        }
        return true;
    }
}
//END
