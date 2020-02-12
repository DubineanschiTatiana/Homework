/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekwill.webservices.infrastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tekwill.webservices.domain.Book;

@RestController
@RequestMapping(value = "books")
public class BookController {

    static List<Book> bookCollection = new ArrayList(Arrays.asList(
            new Book("1", "books", "author", Arrays.asList("genre"), 2018)));

    @RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity(bookCollection, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<Book> getbookById(@PathVariable(value = "id") String id) {
        for (Book book : bookCollection) {
            if (book.getId().equals(id)) {
                return new ResponseEntity(book, HttpStatus.OK);
            }
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = {"application/json"})
    public ResponseEntity createbook(@RequestBody Book book) {
        bookCollection.add(book);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = {"application/json"})
    public ResponseEntity updateBook(@PathVariable(value = "id") String id, @RequestBody Book book) {
        for (int i = 0; i < bookCollection.size(); i++) {
            if (bookCollection.get(i).getId().equals(id)) {
                bookCollection.set(i, book);
                return new ResponseEntity(HttpStatus.OK);
            }
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity deletebook(@PathVariable(value = "id") String id) {
        for (Book book : bookCollection) {
            if (book.getId().equals(id)) {
                bookCollection.remove(book);
                return new ResponseEntity(HttpStatus.OK);
            }
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
