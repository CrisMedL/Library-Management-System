# Library Management System

## Overview
This Library Management System is a Java-based console application designed to manage a collection of books. It supports basic library operations such as adding, deleting, listing, modifying, and searching for books, using Java's `ArrayList` for in-memory storage. All data is stored temporarily in memory, making it a lightweight solution without requiring a database.

## Features
- **Add a Book**: Allows users to add a new book to the library by specifying an ID, title, author, and publication year. The program prevents duplicate entries based on the book's ID.
- **Delete a Book**: Removes a book from the library based on the book's ID. The system confirms the deletion if the ID matches a book in the library.
- **Modify Book Title**:Enables users to update the title of an existing book by entering the book's ID and a new title. This is helpful for correcting or updating book information.
- **List Books**: Lists all books in the library, sorted by user preference (either by author, title, year, or ID). This feature provides a clear, organized view of the available books.
- **Search for a Book**: Allows users to search for a specific book by entering keywords related to the title, author, or publication year. The program returns a list of books that match the search criteria.
  
## Technologies
- **Programming Language**: Java
- **Data Structure**: `ArrayList` (for managing books in memory)

## Limitations
- **Data Persistence**: Since this is a runtime application, all data is stored in memory and will be lost once the program ends.
- **No Database**: The application does not connect to any external database; it is designed as a lightweight, temporary solution.
