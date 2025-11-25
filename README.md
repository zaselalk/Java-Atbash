# Java Atbash Cipher

A simple Java implementation of the Atbash cipher, a monoalphabetic substitution cipher originally used for the Hebrew alphabet.

## What is Atbash?

Atbash is a substitution cipher where each letter of the alphabet is mapped to its reverse. In other words:
- The first letter (A) becomes the last letter (Z)
- The second letter (B) becomes the second-to-last letter (Y)
- And so on...

The cipher is reciprocal, meaning that encoding and decoding use the same transformation. If you encode a text twice, you get back the original text.

### Alphabet Mapping

```
Plain:  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
Cipher: Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
```

## Features

- ✅ Encodes text using the Atbash cipher
- ✅ Decodes text using the same cipher (reciprocal property)
- ✅ Preserves character case (uppercase remains uppercase, lowercase remains lowercase)
- ✅ Non-alphabetic characters remain unchanged
- ✅ Simple and easy-to-understand implementation

## Requirements

- Java Development Kit (JDK) 8 or higher
- No external dependencies required

## How to Compile and Run

### Compilation

```bash
javac src/Atbash.java
```

### Execution

```bash
java -cp src Atbash
```

## Usage Examples

The program demonstrates the Atbash cipher with a sample text:

```java
String text = convert("Asela");
System.out.println(text);        // Output: Zhvoz
System.out.println(convert(text)); // Output: Asela (decoded back to original)
```

### Example Transformations

| Original | Encoded |
|----------|---------|
| Hello    | Svool   |
| World    | Dliow   |
| Java     | Qzez    |
| Asela    | Zhvoz   |

## Code Explanation

The `convert()` method implements the Atbash cipher:

1. **Character Iteration**: Loops through each character in the input string
2. **Non-Letter Handling**: Non-alphabetic characters (numbers, spaces, punctuation) are preserved as-is
3. **Case Preservation**: Uppercase letters are converted using uppercase alphabet, lowercase using lowercase
4. **Transformation Formula**:
   - For uppercase: `'Z' - (c - 'A')` 
   - For lowercase: `'z' - (c - 'a')`

This formula calculates the mirror position of each letter in the alphabet.

## Project Structure

```
Java-Atbash/
├── src/
│   └── Atbash.java    # Main implementation
├── .gitignore         # Git ignore rules
├── Atbash.iml         # IntelliJ IDEA module file
└── README.md          # This file
```

## Contributing

Feel free to fork this repository and submit pull requests for any improvements or additional features.

## License

This project is open source and available for educational purposes.
