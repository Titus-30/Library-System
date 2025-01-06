# 📚 Library Management System

## 📑 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [System Architecture](#system-architecture)
- [Library Items](#library-items)
- [Getting Started](#getting-started)
- [Usage Guide](#usage-guide)
- [Implementation Details](#implementation-details)
- [Contributing](#contributing)
- [License](#license)

## Overview
A Java-based library management system that handles various types of library items including Books, Magazines, DVDs, and Digital Books. The system implements lending functionality and digital access capabilities for appropriate items.

## Features
### Core Functionality
- 📖 Multiple item type support
- 🔄 Borrowing and returning items
- 💻 Digital reading access
- 📋 Item details display
- 🏷️ Unique item identification

### Supported Library Items
| Item Type    | Lendable | Digital Access | Details Display |
|-------------|----------|----------------|-----------------|
| Book        | ✅       | ❌             | Title, Author, ID |
| Magazine    | ✅       | ❌             | Title, Author, ID |
| DVD         | ✅       | ❌             | Title, Director, ID |
| Digital Book| ✅       | ✅             | Title, Author, ID |

## System Architecture
### Interface and Class Hierarchy
```
Lendable (Interface)    DigitalAccess (Interface)
        ↓                       ↓
        └───────┐       ┌──────┘
                ↓       ↓
          LibraryItem1 (Abstract)
                ↓
        ┌───────┼───────┐
        ↓       ↓       ↓
      Book1  Magazine  DVD1
        ↓
  DigitalBook
```

### Interfaces
1. **Lendable**
   - `borrowItem()`
   - `returnItem()`

2. **DigitalAccess**
   - `onlineRead()`

## Library Items
### Common Features
- Title
- Author/Director
- Item ID
- Display functionality
- Borrowing capability

### Item-Specific Features
1. **Book**
   - Physical lending
   - Basic item details

2. **Magazine**
   - Physical lending
   - Periodical handling

3. **DVD**
   - Physical lending
   - Director instead of author

4. **Digital Book**
   - Physical lending
   - Online reading access
   - Digital format support

## Getting Started
### Prerequisites
- Java JDK 8 or higher
- Command line interface or IDE

### Installation
1. Clone the repository
```bash
git clone https://github.com/yourusername/library-management-system.git
```

2. Navigate to project directory
```bash
cd library-management-system
```

3. Compile the program
```bash
javac LibrarySystem.java
```

4. Run the application
```bash
java LibrarySystem
```

## Usage Guide
1. **Start Application**
   - Run the program
   - Select item type

2. **Enter Item Details**
   - Title
   - Author/Director
   - Item ID

3. **Available Operations**
   - View item details
   - Borrow item
   - Return item
   - Access digital content (for Digital Books)

## Implementation Details
### Class Structure
- Abstract base class for common properties
- Interface implementation for specific behaviors
- Inheritance for specialized item types

### Feature Implementation
- Encapsulation using private fields and getters
- Polymorphic behavior through interfaces
- Runtime type checking for specific features

## Contributing
1. Fork the repository
2. Create feature branch
```bash
git checkout -b feature/YourFeature
```
3. Commit changes
```bash
git commit -m 'Add YourFeature'
```
4. Push to branch
```bash
git push origin feature/YourFeature
```
5. Create Pull Request

### Development Guidelines
- Follow Java naming conventions
- Maintain existing code structure
- Add appropriate comments
- Implement proper error handling
- Test new features thoroughly

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

---
💡 **Tips**
- Keep item IDs unique
- Test all item types
- Verify digital access functionality
- Ensure proper item return process

⚠️ **Note**: This is a basic implementation for educational purposes. A production system would require additional features like:
- User authentication
- Database integration
- Item availability tracking
- Reservation system
- Late return handling
